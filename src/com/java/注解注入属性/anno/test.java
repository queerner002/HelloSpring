package com.java.注解注入属性.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/18 0018.
 */

public class test {
    @Test
    public void runUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

}
