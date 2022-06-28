package com.test.repo;

import com.test.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    private Role findByUserRole(String role) {
        return new Role();
    }
}
