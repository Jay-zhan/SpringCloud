package com.springcloud.sup.spring_cloud_sup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudSupApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSupApplication.class, args);
	}

}

