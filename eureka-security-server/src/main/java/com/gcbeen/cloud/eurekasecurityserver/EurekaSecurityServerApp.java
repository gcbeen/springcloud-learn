package com.gcbeen.cloud.eurekasecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSecurityServerApp {

    public static void main( String[] args ) {
        SpringApplication.run(EurekaSecurityServerApp.class, args);
    }
}
