package com.ab.SpringCloudEurekaClientArticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClientArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientArticleApplication.class, args);
	}
}
