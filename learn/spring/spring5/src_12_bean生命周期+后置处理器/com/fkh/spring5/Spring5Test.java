package com.fkh.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {

    @Test    /*Alt+Enter:Add Junit4 to classpath*/
    public void testBook(){
        /*1. 加载spring配置文件bean.xml*/
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");*/
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        /*2. 获取配置文件创建的对象（book)为配置文件中的id*/
        Course course = context.getBean("course",Course.class);
        System.out.println("第四步：获取创建的bean实例对象"+course);

        /*手动让bean实例销毁*/
        context.close();
    }
}
