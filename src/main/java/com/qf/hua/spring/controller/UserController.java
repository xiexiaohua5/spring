package com.qf.hua.spring.controller;

import com.qf.hua.spring.service.UserService;
//这个是框架提供的
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//jsr250提供的
import javax.annotation.Resource;


@Controller
public class UserController {
    //不需要new,直接使用注解
    //先声明，在这样使用注解，简化了像之前那样使用代码
    //这个只会根据类型去查找依赖对象
    //@Autowired
    //(name = "userServiceImpl")一般不建议写，
    //因为注解在service的实现类，
    //所以这里要写实现类的首字母小写的名字
    //还有一个type属性，一般都不建议写
    //默认的时候会根据id和type两个属性前后进行查找依赖对象
    @Resource(name = "userServiceImpl")
    public UserService userService;

    //知道就行，直接修饰属性就可以调用里面的方法了
    //可以修饰属性，构造方法，方法
    //@Autowired
    public void setUserService(){
        this.userService = userService;
    }

    public void sayHello(){
        int save = userService.save();
    }
}
