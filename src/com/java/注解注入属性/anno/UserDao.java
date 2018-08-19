package com.java.注解注入属性.anno;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/8/18 0018.
 */
@Repository(value = "userDao")
public class UserDao {
    public void add() {
        System.out.println("UserDao Add Method.");
    }

}
