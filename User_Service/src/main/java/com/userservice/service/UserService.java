package com.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userservice.VO.Department;
import com.userservice.VO.ResponseTemplateVO;
import com.userservice.entity.User;
import com.userservice.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);

		// Talk to my department class
		Department department = restTemplate
				.getForObject("http://DEPARTMENT_SERVICE/departments" + user.getDepartmentId(), Department.class);

		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
