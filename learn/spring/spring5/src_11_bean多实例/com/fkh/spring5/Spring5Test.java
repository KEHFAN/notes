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

        /*Spring中，默认情况下 bean 是单实例对象
        * 即：对象是在加载配置文件时创建，
        * 不管调用多少次getBean都只有一个对象*/
        Course course1 = context.getBean("course",Course.class);
        Course course2 = context.getBean("course",Course.class);
        System.out.println(course1);
        System.out.println(course2);
        /*com.fkh.spring5.Course@74fe5c40
          com.fkh.spring5.Course@74fe5c40
          两次输出的对象地址相同，说明只有一个对象*/

        /*设置多实例的情况下
        * 对象是在调用getBean时创建
        * 每调用一次就创建一个对象*/
        Stu stu1 = context.getBean("stu",Stu.class);
        Stu stu2 = context.getBean("stu",Stu.class);
        System.out.println(stu1);
        System.out.println(stu2);
        /*com.fkh.spring5.Stu@77847718
          com.fkh.spring5.Stu@7f3b84b8
          两次输出的对象地址不同，说明不是同一个对象*/
    }
}
