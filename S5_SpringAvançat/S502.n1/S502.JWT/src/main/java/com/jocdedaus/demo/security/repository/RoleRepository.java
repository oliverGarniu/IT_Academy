package com.jocdedaus.demo.security.repository;

import com.jocdedaus.demo.security.model.Role;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Qualifier("role")
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
