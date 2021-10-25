package com.example.moneyloverapigateway;

import feign.Retryer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MoneyLoverApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyLoverApiGatewayApplication.class, args);
    }



}
