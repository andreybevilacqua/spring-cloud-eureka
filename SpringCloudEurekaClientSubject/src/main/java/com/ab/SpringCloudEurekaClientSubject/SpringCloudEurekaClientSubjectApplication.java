package com.ab.SpringCloudEurekaClientSubject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClientSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientSubjectApplication.class, args);
	}
}
