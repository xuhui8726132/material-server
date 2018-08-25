package com.xuhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MaterialServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterialServerApplication.class, args);
	}
}
