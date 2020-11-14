package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:14
 * 配置类==配置文件
 * 告诉spring这是一个配置类
 * 包扫描：只要标注了@Controller
 * @Service @Repository @Component 都会被自动扫描加到容器中
 */
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
@Configuration
@ComponentScans(
        value=
        {@ComponentScan(value="com.atguigu",excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})

},useDefaultFilters = false)

})
public class MainConfig {
    //给容器中注册一个bean，类型为返回值类型，id默认是用方法名作为id
    @Bean
    public Person person(){
        return new Person("张三",18);
    }
}
