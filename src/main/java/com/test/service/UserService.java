package com.test.service;

import com.test.model.User;
import com.test.model.UserRole;

import java.util.Set;

public interface UserService {

   public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);
}
