package com.example.girl.demo.controller;

import com.example.girl.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "hello")
    public User greeting(){
        User user = new User();
        user.setName("yangwenliang");
        user.setAge(12);
        return user;
    }
}
