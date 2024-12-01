package com.va4815.springsecutiryauthpoc.service;

import com.va4815.springsecutiryauthpoc.HttpBody.request.UserRequestBody;
import com.va4815.springsecutiryauthpoc.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User createUser(UserRequestBody requestBody);
}
