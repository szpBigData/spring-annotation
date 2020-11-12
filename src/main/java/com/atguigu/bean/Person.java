package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunzhipeng
 * @create 2020-11-12 22:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String name;
  private Integer age;
}
