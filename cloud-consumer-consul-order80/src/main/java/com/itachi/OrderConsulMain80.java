package com.itachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @auther zzyy
 * @create 2020-02-18 17:20
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解是为了用zookeeper或者consul作为注册中心时向其注册中心
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MySelfRule.class)
public class OrderConsulMain80
{
    public static void main(String[] args) {
            SpringApplication.run(OrderConsulMain80.class, args);
    }
}
