package com.java.ioc;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
@Component(value = "user1")
public class User {
    public void add() {
        System.out.println("User Add Method.");
    }

    @Override
    public String toString() {
        return "This is a user object.";
    }

    public static User createInstance() {
        return new User();
    }

}
