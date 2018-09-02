package com.java.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
public class TestAop {
    @Test
    public void runUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        User user = (User) context.getBean("user");
        user.add();
    }

    @Test
    public void runUser1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        User user = (User) context.getBean("user");
        user.del("ceshi", 5);
    }

}
