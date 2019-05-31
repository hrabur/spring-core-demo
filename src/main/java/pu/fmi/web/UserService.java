package pu.fmi.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@PostConstruct
	public void init() {
		System.out.println("User service init");
		System.out.println("It works " + userDao.loadUserName());
	}

}
