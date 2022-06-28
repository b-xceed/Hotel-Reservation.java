package com.test.repo;

import com.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
