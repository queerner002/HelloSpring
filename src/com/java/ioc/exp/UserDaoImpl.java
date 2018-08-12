package com.java.ioc.exp;

/**
 * Created by Administrator on 2018/8/9 0009.
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("UserDaoImpl Add...");
    }
}
