package com.learn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.demo.entity.BranchEntity;
import com.learn.demo.repository.BranchRepository;

@Service
public class BranchService {
	
	@Autowired
	BranchRepository branchRepo;

	public List<BranchEntity> saveBranch(List<BranchEntity> branch){
		return branchRepo.saveAll(branch);
	}
	

}
