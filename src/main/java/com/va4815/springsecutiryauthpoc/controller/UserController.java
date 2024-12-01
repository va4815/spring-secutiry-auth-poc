package com.va4815.springsecutiryauthpoc.controller;

import com.va4815.springsecutiryauthpoc.HttpBody.request.UserRequestBody;
import com.va4815.springsecutiryauthpoc.entity.User;
import com.va4815.springsecutiryauthpoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody UserRequestBody requestBody) {
        return userService.createUser(requestBody);
    }

}
