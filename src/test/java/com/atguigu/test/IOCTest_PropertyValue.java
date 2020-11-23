package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sunzhipeng
 * @create 2020-11-15 21:28
 */
public class IOCTest_PropertyValue {
    //1.创建ioc容器
    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
    @Test
    public void test01(){
       printBeans(applicationContext);
        System.out.println("===================");
        Person person=(Person) applicationContext.getBean("person");
        System.out.println(person);
        applicationContext.close();
    }
}