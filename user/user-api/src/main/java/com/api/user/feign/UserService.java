package com.api.user.feign;

import com.api.user.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "user-service"
)
public interface UserService {
    @GetMapping("api/user/getUsers")
    List<UserDto> getUsers();
    @GetMapping("api/user/exception")
    void throwException();
    @GetMapping("api/user/port")
    int getPort();
}
