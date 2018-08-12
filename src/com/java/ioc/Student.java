package com.java.ioc;

/**
 * Created by Administrator on 2018/8/9 0009.
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
