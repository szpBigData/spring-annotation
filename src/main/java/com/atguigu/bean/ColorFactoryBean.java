package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;



/**
 * @author sunzhipeng
 * @create 2020-11-15 11:57
 * 创建一个spring定义的FactoryBean
 */
//创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<color> {

    //返回一个Color对象，这个对象会添加到容器中
    @Override
    public color getObject() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("ColorFactoryBean...getObject...");
        return new color();
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return color.class;
    }

    //是单例？
    //true：这个bean是单实例，在容器中保存一份
    //false：多实例，每次获取都会创建一个新的bean；
    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return false;
    }

}
