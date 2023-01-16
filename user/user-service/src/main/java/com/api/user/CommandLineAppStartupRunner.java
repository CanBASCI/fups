package com.api.user;

import com.api.user.operation.UserOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private UserOperation userOperation;

    @Override
    public void run(String...args) throws Exception {
        userOperation.getUsers();

    }
}
