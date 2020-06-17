package com.fkh.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {

    @Test    /*Alt+Enter:Add Junit4 to classpath*/
    public void testBook(){
        /*1. 加载spring配置文件bean.xml*/
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        /*2. 获取配置文件创建的对象（book)为配置文件中的id*/

        /*在配置文件中bean标签定义的是MyBean
        * 然而使用getBean返回的是Course
        * 这就是工厂Bean的作用
        * 注意：这里getBean的参数是MyBean的id名和 Course的类名，两者不同，但返回的是Course对象*/
        Course course = context.getBean("mybean",Course.class);
        System.out.println(course);
    }
}
