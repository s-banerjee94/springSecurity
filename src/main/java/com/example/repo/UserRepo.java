package com.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.User;
@Repository
public interface UserRepo extends JpaRepository<User, String> {
	public Optional<User> findByEmail(String email);
}
