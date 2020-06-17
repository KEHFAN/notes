package com.fkh.spring5;

import org.springframework.stereotype.Component;

/*Aspect J注解实现AOP操作*/
/*1.创建类，并定义方法*/
@Component
public class User {
    public void add(){
        System.out.println("add....");
    }
}
