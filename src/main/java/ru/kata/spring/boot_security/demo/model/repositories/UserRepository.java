package ru.kata.spring.boot_security.demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername (String username);
//    Optional<User> findByUsername(String username);//nail
    User findByEmail(String email);
}
