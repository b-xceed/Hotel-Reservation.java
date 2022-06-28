package com.test.service.impl;

import com.test.model.User;
import com.test.model.UserRole;
import com.test.repo.RoleRepository;
import com.test.repo.UserRepository;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

      User local =  this.userRepository.findByUsername(user.getUsername());

      if(local!=null)
      {
          System.out.println("User is already there !!");
          throw new Exception("User Already present ! !");
      }else {
          for(UserRole ur:userRoles)
          {
              roleRepository.save(ur.getRole());
          }

          user.getUserRoles().addAll(userRoles);
         local= this.userRepository.save(user);
      }
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
}
