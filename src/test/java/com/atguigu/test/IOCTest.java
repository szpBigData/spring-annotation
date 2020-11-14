package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import javax.naming.NamingEnumeration;
import java.util.Map;


/**
 * @author sunzhipeng
 * @create 2020-11-12 22:34
 */
public class IOCTest {
@Test
    public void test01(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
        String [] names=applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
    @Test
    public void test2(){
    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
    String[] names=applicationContext.getBeanDefinitionNames();
    for (String name:names){
        System.out.println(name);
    }
    }
    @Test
    public void test3(){
    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("IOC容器创建完成");
    Object bean=applicationContext.getBean("sunzhipeng");
    Object bean2=applicationContext.getBean("sunzhipeng");
        System.out.println(bean==bean2);
    }
    @Test
    public void test4(){
    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
    String[] names = applicationContext.getBeanNamesForType(Person.class);
        Environment environment = applicationContext.getEnvironment();
        //动态获取环境变量的值，win10
       String property= environment.getProperty("os.name");
        System.out.println(property);
       for (String name:names){
           System.out.println(name);}
        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
        System.out.println(persons);
    }
    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
    @Test
    public void testImport(){
        printBeans(applicationContext);
    }

}
