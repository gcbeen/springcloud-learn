package com.gcbeen.cloud.ribbonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RibbonServiceApp {

    public static void main( String[] args ) {
        SpringApplication.run(RibbonServiceApp.class, args);
    }
    
}
