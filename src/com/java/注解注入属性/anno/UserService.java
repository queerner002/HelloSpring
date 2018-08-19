package com.java.注解注入属性.anno;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/8/18 0018.
 */
@Service(value = "userService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("UserService Add Method.");
        userDao.add();
    }

}
