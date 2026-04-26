package com.example.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.social.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
