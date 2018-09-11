package com.yoo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TransportOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportOrderApplication.class, args);
	}
}
