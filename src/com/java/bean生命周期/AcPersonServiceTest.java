package com.java.bean生命周期;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/25 0025.
 */
public class AcPersonServiceTest {
    public static void main(String[] args) {
        System.out.println("开始初始化容器");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person.xml");
        System.out.println("xml加载完毕");
        Person person1 = (Person) applicationContext.getBean("person1");
        Person person2 = (Person) applicationContext.getBean("person1");
        System.out.print("person1 == person2?  ");
        System.out.println(person1==person2);
        System.out.println(person1);
        System.out.println("关闭容器");
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }


}
