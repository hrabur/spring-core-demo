package pu.fmi.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringCoreDemo.class)
public class SpringCoreDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(SpringCoreDemo.class);
		ctx.start();
	}
	
	@Bean
	public UserDao userDao() {
		return new UserDao();
	}
	
	@Bean
	public UserService userService(UserDao userDao) {
		UserService service = new UserService();
		service.setUserDao(userDao);
		return service;
	}

}
