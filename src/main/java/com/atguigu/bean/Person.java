package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  //使用@Value赋值；
  //1、基本数值
  //2、可以写SpEL； #{}
  //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）
  @Value("张三")
  private String name;
  @Value("#{20-2}")
  private Integer age;
  @Value("${person.nickname}")
  private String nickName;
}
