package com.java.bean生命周期;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2018/8/25 0025.
 */

public class BfPersonServiceTest {

    public static void main(String[] args) {
        System.out.println("开始初始化容器");
        ConfigurableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("person.xml"));
        System.out.println("xml加载完毕");
        //beanFactory需要手动注册beanPostProcessor类的方法
        beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
        Person person1 = (Person) beanFactory.getBean("person1");
        System.out.println(person1);
        System.out.println("关闭容器");
        beanFactory.destroySingletons();
    }
}
