package com.learn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.demo.entity.BranchEntity;
import com.learn.demo.service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	BranchService branchService;
	
	public List<BranchEntity> saveBranch(@RequestBody List<BranchEntity> branchEntity) {
		return branchService.saveBranch(branchEntity);
	}
}
