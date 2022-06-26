package com.ms.department.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.department.entity.Department;
import com.ms.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside save department method of department controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("inside find department by id  method of department controller");
		return departmentService.findDepartmentById(departmentId);
	}

}
