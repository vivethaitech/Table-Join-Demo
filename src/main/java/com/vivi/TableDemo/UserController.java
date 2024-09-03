package com.vivi.TableDemo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/add")
    public String createUser(@RequestBody UserEntity user) {
        return service.createUser(user);
    }

    @GetMapping("/get")
    public List<UserEntity> getUser() {
        return service.getUser();
    }
}

