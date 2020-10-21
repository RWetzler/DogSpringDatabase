package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import dmacc.beans.Dog;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Dog dog() {
		Dog bean = new Dog();

		return bean;
	}
}
