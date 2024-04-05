package com.tobeto.pairwork_orm.repositories;

import com.tobeto.pairwork_orm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> getByUsername(String username);
	
	Optional<User> getByEmail(String email);
}
