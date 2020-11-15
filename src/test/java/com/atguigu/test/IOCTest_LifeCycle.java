package com.atguigu.test;

import com.atguigu.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sunzhipeng
 * @create 2020-11-15 12:21
 */
public class IOCTest_LifeCycle {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成");
       // applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }

}
