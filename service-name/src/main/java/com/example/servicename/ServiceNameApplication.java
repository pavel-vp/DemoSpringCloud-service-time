package com.example.servicename;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceNameApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceNameApplication.class, args);
    }

}

