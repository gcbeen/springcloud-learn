package com.gcbeen.cloud.feignservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gcbeen.cloud.feignservice.domain.CommonResult;
import com.gcbeen.cloud.feignservice.domain.User;
import com.gcbeen.cloud.feignservice.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserFeignController {
    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public CommonResult<?> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/getByUsername")
    public CommonResult<?> getByUsername(@RequestParam String username) {
        return userService.getByUsername(username);
    }

    @PostMapping("/create")
    public CommonResult<?> create(@RequestBody User user) {
        return userService.create(user);
    }

    @PostMapping("/update")
    public CommonResult<?> update(@RequestBody User user) {
        return userService.update(user);
    }

    @PostMapping("/delete/{id}")
    public CommonResult<?> delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
