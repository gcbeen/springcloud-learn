package com.gcbeen.cloud.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.gcbeen.cloud.feignservice.domain.CommonResult;
import com.gcbeen.cloud.feignservice.domain.User;
import com.gcbeen.cloud.feignservice.service.impl.UserFallbackService;

@FeignClient(value = "user-service",fallback = UserFallbackService.class)
public interface IUserService {
    @PostMapping("/user/create")
    CommonResult<?> create(@RequestBody User user);

    @GetMapping("/user/{id}")
    CommonResult<User> getUser(@PathVariable Long id);

    @GetMapping("/user/getByUsername")
    CommonResult<User> getByUsername(@RequestParam String username);

    @PostMapping("/user/update")
    CommonResult<?> update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    CommonResult<?> delete(@PathVariable Long id);
}
