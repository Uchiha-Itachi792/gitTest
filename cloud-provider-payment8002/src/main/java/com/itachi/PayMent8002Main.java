package com.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMent8002Main {
    public static void main(String[] args) {
        SpringApplication.run(PayMent8002Main.class, args);
    }
}
