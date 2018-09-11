package com.yoo.capacity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableEurekaClient
@EnableScheduling
public class TransportCapacityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportCapacityApplication.class, args);
	}


}

