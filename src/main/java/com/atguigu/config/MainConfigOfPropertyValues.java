package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author sunzhipeng
 * @create 2020-11-15 21:08
 * 使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中
 */
@Configuration
@PropertySource(value={"classpath:/person.properties"})
public class MainConfigOfPropertyValues {
    @Bean
    public Person person(){
        return new Person();
    }
}
