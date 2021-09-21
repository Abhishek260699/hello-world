package com.userservice.VO;

import com.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private User user;
	private Department department;
	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}
	public void setDepartment(Department department2) {
		// TODO Auto-generated method stub
		
	}
}
