package com.hu.impl.login;

import com.hu.api.login.loginService;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService {
    public String loginSystem() {
        return "this is a test";
    }
}
