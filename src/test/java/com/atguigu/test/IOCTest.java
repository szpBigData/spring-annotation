package com.atguigu.test;

import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.font.FontRenderContext;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:34
 */
public class IOCTest {
@Test
    public void test01(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
        String [] names=applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
