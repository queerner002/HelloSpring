package com.java.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
public class TestTx {
    @Test
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        BankService bankService = (BankService)context.getBean("bankService");
        bankService.transfer1(1, 2, 100);
    }

}
