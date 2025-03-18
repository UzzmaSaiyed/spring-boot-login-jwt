package com.example.loginapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.loginapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}