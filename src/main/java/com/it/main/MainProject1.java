package com.it.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class MainProject1 {

	public static void main(String[] args) {
		SpringApplication.run(MainProject1.class, args);

	}

}
