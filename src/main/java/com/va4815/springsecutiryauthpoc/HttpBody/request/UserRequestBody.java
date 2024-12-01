package com.va4815.springsecutiryauthpoc.HttpBody.request;

public class UserRequestBody {
    private String username;

    public UserRequestBody(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
