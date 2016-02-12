package be.cake.backend.application;

import java.util.Calendar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.cake.backend.config.ApplicationConfiguration;
import be.cake.backend.dao.User;


public class Startup {

	
	
	public static void main(String[] args) {
	
		User user = new User();
		user.setUserName("tma");
		user.setAddress("Avenue George Petre");
		user.setUserSince(Calendar.getInstance().getTime());
		//userRepository
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ApplicationConfiguration.class); 
		ctx.registerShutdownHook();
		ctx.refresh();
		
		//UserGenerator userGenerator = ctx.getBean("userGenerator");

	}

}
