package com.jonathan_K.SpringBoot_learning_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLearning1Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringBootLearning1Application.class, args);
	
		MyFirstService fservice = ctx.getBean(MyFirstService.class);
		System.out.println(fservice.tellStory());
	}
	

	//we could define abean from here or at class level with annotations like @Component
//    @Bean
//    MyFirstClass myFirstClass() {
//	    return new MyFirstClass();
//	}
}
