package com.va4815.springsecutiryauthpoc.entity;

import com.va4815.springsecutiryauthpoc.HttpBody.request.UserRequestBody;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    public User() {
    }

    public User(UserRequestBody requestBody) {
        this.username = requestBody.getUsername();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
