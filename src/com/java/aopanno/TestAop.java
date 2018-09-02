package com.java.aopanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
public class TestAop {

    @Test
    public void runUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
        User user = (User) context.getBean("user");
        user.add();
    }

}
