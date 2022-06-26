package com.ms.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ms.userservice.entity.Users;
import com.ms.userservice.repository.UserRepository;
import com.ms.userservice.valueobject.Department;
import com.ms.userservice.valueobject.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Users saveUser(Users user) {
		log.info("inside saveUser method and UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("inside getUserWithDepartment method and UserService");
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		Optional<Users> user = userRepository.findById(userId);
		Department department =
//				restTemplate.getForObject("http://localhost:9001/departments/"
//						+ user.get().getDepartmentId(),
//						Department.class);
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"
						+ user.get().getDepartmentId(),
						Department.class);
		responseTemplateVO.setDepartment(department);
		responseTemplateVO.setUser(user);
		return responseTemplateVO;
	}
}
