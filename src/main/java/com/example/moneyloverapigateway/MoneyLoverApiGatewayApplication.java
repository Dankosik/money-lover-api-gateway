package com.example.moneyloverapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MoneyLoverApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyLoverApiGatewayApplication.class, args);
    }

}
