package com.fkh.spring5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*后置处理器需要单独一个类来实现BeanPostProcessor*/
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之前执行的方法：单独类实现BeanPostProcessor中方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("在初始化之后执行的方法：单独类实现BeanPostProcessor中方法");
        return bean;
    }
}
