package com.vishwa.ideaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IdeaAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=  SpringApplication.run(IdeaAppApplication.class, args);
		hello h=context.getBean(hello.class);
		h.Show();

	}

}
