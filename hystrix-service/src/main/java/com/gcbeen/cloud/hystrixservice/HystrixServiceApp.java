package com.gcbeen.cloud.hystrixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;



@EnableHystrix
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixServiceApp {

    public static void main( String[] args ) {
        SpringApplication.run(HystrixServiceApp.class, args);
    }

    // @Bean
    // public ServletRegistrationBean<?> hystrixMetricsStreamServlet(){
    //     ServletRegistrationBean<?> registrationBean = new ServletRegistrationBean<>(new HystrixMetricsStreamServlet());
    //     registrationBean.addUrlMappings("/actuator/hystrix.stream");
    //     return registrationBean;
    // }


}
