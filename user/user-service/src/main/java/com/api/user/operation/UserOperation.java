package com.api.user.operation;

import com.api.core.exception.NotFoundException;
import com.api.user.data.IUserRepository;
import com.api.user.data.entity.UserEntity;
import com.api.user.data.mapper.IUserMapper;
import com.api.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Service
public class UserOperation {
    @Value("${server.port}")
    private int port;
    @Autowired
    IUserMapper userMapper;
    @Autowired
    IUserRepository userRepository;

    private final static Logger logger = LoggerFactory.getLogger(UserOperation.class);

    public List<UserDto> getUsers() {
        logger.info("UserOperation -> getUsers");
        return userMapper.toDtos(userRepository.findAll());
    }

    public UserDto getUser(String userName) {
        UserEntity userEntity = userRepository.findByUserName(userName);
        return userMapper.toDto(userEntity);
    }

    public int throwException(){
        String a = "a";
        if(a.equals("a")){
            throw new NotFoundException("not found");
        }
        return 1;
    }
    public int getPort(){
        logger.info("UserOperation -> getPort");
        return port;
    }
}
