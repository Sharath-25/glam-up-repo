package com.glamtech.glamup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.glamtech.glamup", exclude = SecurityAutoConfiguration.class)
@ImportResource("applicationContext.xml")
public class GlamAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GlamAppApplication.class, args);
	   System.out.println("ApplicationContext is Managing Components \t"+applicationContext);
	}

}
