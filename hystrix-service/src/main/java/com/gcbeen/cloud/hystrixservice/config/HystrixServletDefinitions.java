package com.gcbeen.cloud.hystrixservice.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

// 被监控 设置
@Configuration
public class HystrixServletDefinitions {
    
    @Bean(name = "hystrixRegistrationBean")
    public ServletRegistrationBean<?> servletRegistrationBean() {
          ServletRegistrationBean<?> registration = new ServletRegistrationBean<>(
                        new HystrixMetricsStreamServlet(), "/actuator/hystrix.stream");
          registration.setName("hystrixServlet");
          registration.setLoadOnStartup(1);
          return registration;
    }


}
