package com.api.user.feign;

import com.api.user.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        name = "user-service",
        url = "${user-service.server}"
)
public interface UserService {
    @GetMapping("api/user/getUsers")
    List<UserDto> getUsers();
    @GetMapping("api/user/getUser/{userName}")
    UserDto getUser(@PathVariable(value = "userName") String userName);
    @GetMapping("api/user/exception")
    int throwException();
    @GetMapping("api/user/port")
    int getPort();
}
