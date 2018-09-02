package com.java.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2018/8/24 0024.
 */
public class LogHandler {
    public void before() {
        System.out.println("Start Write Log.");
    }

    public void after() {
        System.out.println("End Write Log.");
    }

    public void around(ProceedingJoinPoint joinPoint) {
        try {
            before();
            Object[] args = joinPoint.getArgs();
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
                System.out.println(joinPoint.getArgs()[i]);
            }
            User user = (User) joinPoint.getThis();
            System.out.println("user.age = " + user.age);
            joinPoint.proceed();
            after();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
