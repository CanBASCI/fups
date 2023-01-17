package com.api.gateway.operation;

import com.api.user.dto.UserDto;
import com.api.user.feign.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@Slf4j
public class UserOperation {
    private final static Logger logger = LoggerFactory.getLogger(UserOperation.class);

    @Autowired
    UserService userService;
    public UserDto getUser(String userName){
        logger.info("UserOperation -> getUser => userName: {} ", userName);
        return userService.getUser(userName);
    }
    public List<UserDto> getUsers(){
        logger.info("UserOperation -> getUser");
        return userService.getUsers();
    }

    public int throwException(){
        logger.info("UserOperation -> throwException");
        return userService.throwException();
    }

    public int getPort(){
        logger.info("UserOperation -> getPort");
        return userService.getPort();
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = userService.getUser(username);
        if(userDto == null)
        {
            throw new UsernameNotFoundException("User not found in database.");
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        userDto.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });
        return new org.springframework.security.core.userdetails.User(userDto.getUserName(), userDto.getPassword(), authorities);
    }
}
