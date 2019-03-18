package com.perftool.perftool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PerftoolApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(PerftoolApplication.class, args);
		context.getBean(signIn.class);
		System.out.println(context);
	    
	}
	
}