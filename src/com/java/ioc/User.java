package com.java.ioc;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
public class User {
    public void add() {
        System.out.println("User Add Method.");
    }

    @Override
    public String toString() {
        return "This is a user object.";
    }

}
