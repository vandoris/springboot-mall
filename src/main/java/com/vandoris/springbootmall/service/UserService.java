package com.vandoris.springbootmall.service;

import com.vandoris.springbootmall.dto.UserLoginRequest;
import com.vandoris.springbootmall.dto.UserRegisterRequest;
import com.vandoris.springbootmall.model.User;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
