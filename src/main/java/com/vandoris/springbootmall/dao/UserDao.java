package com.vandoris.springbootmall.dao;

import com.vandoris.springbootmall.dto.UserRegisterRequest;
import com.vandoris.springbootmall.model.User;

public interface UserDao {

    User getUserByEmail(String email);

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
