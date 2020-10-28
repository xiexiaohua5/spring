package com.qf.hua.spring.service.impl;

import com.qf.hua.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public int save() {
        System.out.println("hello");
        return 0;
    }
}
