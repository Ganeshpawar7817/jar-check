package com.ganesh.SubProject.service;

import org.springframework.stereotype.Service;

import com.ganesh.SubProject.dao.UserDao;

@Service
public class UserService {
	
	UserDao userDao;
	
	public String check() {
		userDao.check();
		return "Return Successfully ...!!";
	}
	

}
