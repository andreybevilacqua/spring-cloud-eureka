package com.ab.SpringCloudEurekaClientNoun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClientNounApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientNounApplication.class, args);
	}
}
