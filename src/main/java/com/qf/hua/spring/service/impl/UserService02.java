package com.qf.hua.spring.service.impl;

import com.qf.hua.spring.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//当有多个实现类的时候，可以设置优先选择
@Primary
@Service
public class UserService02 implements UserService {
    @Override
    public int save() {
        return 0;
    }
}
