package com.gcbeen.cloud.feignservice.service.impl;

import org.springframework.stereotype.Component;

import com.gcbeen.cloud.feignservice.domain.CommonResult;
import com.gcbeen.cloud.feignservice.domain.User;
import com.gcbeen.cloud.feignservice.service.IUserService;

@Component
public class UserFallbackService implements IUserService {
    @Override
    public CommonResult<?> create(User user) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getByUsername(String username) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<?> update(User user) {
        return new CommonResult<>("调用失败，服务被降级",500);
    }

    @Override
    public CommonResult<?> delete(Long id) {
        return new CommonResult<>("调用失败，服务被降级",500);
    }
}
