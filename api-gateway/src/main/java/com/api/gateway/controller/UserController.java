package com.api.gateway.controller;

import com.api.gateway.operation.UserOperation;
import com.api.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(path = "api_gw/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    UserOperation userOperation;

    @GetMapping("/getUser/{userName}")
    ResponseEntity<UserDto> getUser(@PathVariable String userName){
        return ResponseEntity.ok().body(userOperation.getUser(userName));
    }

    @GetMapping("/getUsers")
    ResponseEntity<List<UserDto>> getUsers(){
        return ResponseEntity.ok().body(userOperation.getUsers());
    }

    @GetMapping("/throwException")
    ResponseEntity<Integer> throwException(){
        return ResponseEntity.ok().body(userOperation.throwException());
    }

    @GetMapping("/getPort")
    int getPort(){
        return userOperation.getPort();
    }

}
