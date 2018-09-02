package com.java.aopanno;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
public class User {
    public int age = 0;

    public void add() {
        System.out.println("Running User Add Method.");
    }

    public void del(String s, int age) {

        System.out.println("Running User Del Method.");
    }


}
