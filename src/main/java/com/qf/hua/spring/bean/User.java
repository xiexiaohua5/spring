package com.qf.hua.spring.bean;

import lombok.*;

import java.util.List;
import java.util.Map;

/*这一个注解就相当于这下面几个注解，无需再写get,set方法*/
@Data
/*@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode*/
public class User {
    private String username;
    private String password;
    private Address address;
    private List<Integer> list;
    private Map<String,String> map;

    /*初始化方法是构造方法执行完成之后自动执行的第一个方法*/
    public void init(){
        this.username = "hello";
        System.out.println("init");
    }

    //回收方法，知道就好，不使用
    public void destory(){
        this.username = null;
        System.out.println("对象即将被回收");
    }

}
