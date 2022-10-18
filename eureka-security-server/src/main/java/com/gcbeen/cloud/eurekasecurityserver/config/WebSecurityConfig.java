package com.gcbeen.cloud.eurekasecurityserver.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 默认情况下添加 SpringSecurity 依赖的应用 
 * 每个请求都需要添加 CSRF token 才能访问，
 * Eureka 客户端注册时并不会添加，
 * 所以需要配置/eureka/**路径不需要CSRF token。
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http://${username}:${password}@${hostname}:${port}/eureka/
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
