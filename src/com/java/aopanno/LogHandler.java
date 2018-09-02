package com.java.aopanno;

import com.java.aop.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Administrator on 2018/8/24 0024.
 */

@Aspect
public class LogHandler {

    @Before(value="execution(* com.java.aopanno.User.*(..))")
    public void before() {
        System.out.println("Start Write Log.");
    }

    @After(value="execution(* com.java.aopanno.User.*(..))")
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
            com.java.aop.User user = (User) joinPoint.getThis();
            System.out.println("user.age = " + user.age);
            joinPoint.proceed();
            after();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
