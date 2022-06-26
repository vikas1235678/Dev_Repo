package com.ms.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.department.entity.Department;
import com.ms.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("inside save department method of department service");
		return departmentRepository.save(department);
	}

	public Optional<Department> findDepartmentById(Long departmentId) {
		log.info("inside find department by id  method of department service");
		return departmentRepository.findById(departmentId);
	}
}
