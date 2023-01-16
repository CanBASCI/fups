package com.api.user.controller;

import com.api.user.dto.UserDto;
import com.api.user.feign.UserService;
import com.api.user.operation.UserOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@AllArgsConstructor
public class UserController implements UserService {
    @Autowired
    UserOperation userOperation;

    @Override
    public List<UserDto> getUsers() {
        return userOperation.getUsers();
    }

    @Override
    public void throwException() {
        userOperation.throwException();
    }

    @Override
    public int getPort() {
        return userOperation.getPort();
    }
}
