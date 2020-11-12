package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:14
 * 告诉spring这是一个配置类
 */
@Configuration
@ComponentScan(value="com.atguigu")
public class MainConfig {
    //给容器中注册一个bean，类型为返回值类型，id默认是用方法名作为id
    @Bean
    public Person person(){
        return new Person("张三",18);
    }
}
