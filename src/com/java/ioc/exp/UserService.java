package com.java.ioc.exp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/8/9 0009.
 */

public class UserService {

    private UserDao userDao; // 声明为接口类型，降低service层与dao层的耦合度，不依赖于dao层的具体实现

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("UserService Add...");
        this.userDao.add();
    }
}
