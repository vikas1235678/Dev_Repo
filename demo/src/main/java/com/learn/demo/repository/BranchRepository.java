package com.learn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.demo.entity.BranchEntity;

public interface BranchRepository extends JpaRepository<BranchEntity, Long> {

	
}
