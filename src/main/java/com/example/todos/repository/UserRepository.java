package com.example.todos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todos.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);
	Optional<User> findById(Integer id);
}
