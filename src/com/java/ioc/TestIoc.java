package com.java.ioc;


import com.java.ioc.exp.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/8/8 0008.
 */
public class TestIoc {
    @Test
    public void runUser() {
        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 得到配置创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();

    }

    @Test
    public void runStudent() {
        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 得到配置创建的对象
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void runUserService() {
        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 得到配置创建的对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    @Test
    public void runPropertyDemo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertyDemo pd = (PropertyDemo) context.getBean("prop");
        System.out.println(pd);
        System.out.println(Arrays.toString(pd.getArrs()));
        System.out.println(pd.getList());
        System.out.println(pd.getMap());
        System.out.println(pd.getProperties());
    }

    @Test
    public void runUser1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = (User) context.getBean("user1");
        user.add();
    }

}
