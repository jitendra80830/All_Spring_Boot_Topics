package com.ms.user.service.repo;

import com.ms.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Integer> {
}
