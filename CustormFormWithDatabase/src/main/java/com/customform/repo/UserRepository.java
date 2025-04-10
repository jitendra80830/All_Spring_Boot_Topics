package com.customform.repo;

import com.customform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Integer> {
    Optional<User> findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail1);
}
