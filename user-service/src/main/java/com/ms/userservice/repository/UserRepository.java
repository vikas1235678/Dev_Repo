package com.ms.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.userservice.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	
}
