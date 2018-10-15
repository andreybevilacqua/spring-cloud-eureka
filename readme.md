# Spring Cloud Eureka and Ribbon Project

## Intro

This is a project to practice the Spring Cloud Eureka and Ribbon.

It uses Java 8, Maven, Spring Boot 2.0.5 and Spring Cloud 2.0.2.

The server project is already configured to be able to start multiple servers (check `application.yml`file).


## How to startup

To startup, follow order below:

    - Spring Cloud Eureka Server;
    - All Spring Cloud Eureka Client projects:
        - To use Ribbon it's necessary to run each client with a profile. To do so:
            - mvn spring-boot:run -Dspring.profiles.active=adjective
            - mvn spring-boot:run -Dspring.profiles.active=noun
            - mvn spring-boot:run -Dspring.profiles.active=cold-noun
            - mvn spring-boot:run -Dspring.profiles.active=verb
            - mvn spring-boot:run -Dspring.profiles.active=article
            - mvn spring-boot:run -Dspring.profiles.active=subject  
    - Spring Boot Sentence.

Access `http://localhost:8020/sentence` to check the full sentence created.

## Monitoring and Check

To check Eureka server status, access `http://localhost:8010`. You can click on the link to the right of any of these servers and replace `/info` to `/` to check the available endpoints.
Every client you start-up should appear in the Application area. 

The SpringBootSentenceApplication log show that this client is using Ribbon. For example: `Flipping property: SPRINGCLOUDEUREKACLIENTNOUN.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer`