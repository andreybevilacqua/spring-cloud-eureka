package com.ab.SpringCloudEurekaClientColdNoun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClientColdNounApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientColdNounApplication.class, args);
    }
}
