package pu.fmi.web;

import javax.annotation.PostConstruct;

public class UserDao {
	
	@PostConstruct
	public void init() {
		System.out.println("User DAO init");
	}
	
	public String loadUserName() {
		return "Young paduan";
	}
}
