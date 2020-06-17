package com.fkh.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {

    @Test    /*Alt+Enter:Add Junit4 to classpath*/
    public void testBook(){
        /*1. 加载spring配置文件bean.xml*/
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");*/
        /* 使用完全注解开发，需要记载配置类*/
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        /*2. 获取配置文件创建的对象（book)为配置文件中的id*/
        DruidDataSource dataSource = context.getBean("dataSource",DruidDataSource.class);
        System.out.println(dataSource);
    }
}
