package com.java.jdbc.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
public class TestJdbc {
    UserDaoImpl userDaoImpl;

    @Before
    public void init() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserDaoImpl userDaoImpl = (UserDaoImpl) applicationContext.getBean("userDaoImpl");
        this.userDaoImpl = userDaoImpl;
    }

    @Test
    public void runUserAdd() {
        User user = new User();
        user.setUsername("spring-jdbc");
        user.setPassword("spring-password");
        userDaoImpl.add(user);

    }

}
