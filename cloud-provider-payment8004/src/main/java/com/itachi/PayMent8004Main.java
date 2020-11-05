package com.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient//该注解是为了用zookeeper或者consul作为注册中心时向其注册中心
public class PayMent8004Main {
    public static void main(String[] args) {
        SpringApplication.run(PayMent8004Main.class, args);
    }
}
