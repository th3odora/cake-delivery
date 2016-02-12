package be.cake.backend.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.cake.backend.config.ApplicationConfiguration;


public class Startup {

	
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ApplicationConfiguration.class); 
		ctx.registerShutdownHook();
		ctx.refresh();
		
		//UserGenerator userGenerator = ctx.getBean("userGenerator");

	}

}
