package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:13
 */

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(applicationContext.getBean(Person.class));
        String[] names=applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
