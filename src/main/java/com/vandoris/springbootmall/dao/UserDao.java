package com.vandoris.springbootmall.dao;

import com.vandoris.springbootmall.dto.UserRegisterRequest;
import com.vandoris.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
