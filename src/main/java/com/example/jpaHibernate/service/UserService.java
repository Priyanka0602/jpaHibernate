package com.example.jpaHibernate.service;

import com.example.jpaHibernate.dao.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUser();
//    User getUserById(long userId);
//    void deleteUser(long userId);
//    User updateUser(User user);
}
