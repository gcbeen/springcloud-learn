package com.gcbeen.cloud.userservice.service;

import java.util.List;

import com.gcbeen.cloud.userservice.domain.User;

public interface IUserService {
    
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);

}
