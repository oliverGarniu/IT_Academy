package com.jocdedaus.demo.security.repository;

import com.jocdedaus.demo.security.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Qualifier("user")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
