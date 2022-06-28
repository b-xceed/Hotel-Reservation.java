package com.test;


import com.test.model.Role;
import com.test.model.User;
import com.test.model.UserRole;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class ForTestingApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ForTestingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user = new User();

//		user.setFirstName("Badruddin");
//		user.setLastName("khan");
//		user.setUsername("badruddin310");
//		user.setPassword("xceedance@310");
//		user.setEmail("badruddin@123");
//		Role role1 = new Role();
//		role1.setRoleId(310L);
//		role1.setRole("Admin");
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);

//		User user1 = this.userService.createUser(user,userRoleSet);
 //       System.out.println(user1.getUsername());
	}
}
