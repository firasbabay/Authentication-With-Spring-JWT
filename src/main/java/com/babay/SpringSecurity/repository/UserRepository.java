package com.babay.SpringSecurity.repository;

import com.babay.SpringSecurity.Model.Role;
import com.babay.SpringSecurity.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
