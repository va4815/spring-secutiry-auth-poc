package com.va4815.springsecutiryauthpoc.service.impl;

import com.va4815.springsecutiryauthpoc.HttpBody.request.UserRequestBody;
import com.va4815.springsecutiryauthpoc.entity.User;
import com.va4815.springsecutiryauthpoc.repository.UserRepository;
import com.va4815.springsecutiryauthpoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }

    @Override
    public User createUser(UserRequestBody requestBody) {
        User user = new User(requestBody);
        return userRepository.save(user);
    }
}
