package com.vandoris.springbootmall.service.impl;

import com.vandoris.springbootmall.dao.UserDao;
import com.vandoris.springbootmall.dto.UserRegisterRequest;
import com.vandoris.springbootmall.model.User;
import com.vandoris.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
