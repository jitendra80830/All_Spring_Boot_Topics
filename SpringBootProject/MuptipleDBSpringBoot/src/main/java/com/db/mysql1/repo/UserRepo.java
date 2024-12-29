package com.db.mysql1.repo;

import com.db.mysql1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Integer> {
}
