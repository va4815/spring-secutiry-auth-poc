package com.va4815.springsecutiryauthpoc.repository;

import com.va4815.springsecutiryauthpoc.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
