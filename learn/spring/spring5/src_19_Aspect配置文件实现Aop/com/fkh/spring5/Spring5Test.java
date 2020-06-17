package com.fkh.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {

    @Test    /*Alt+Enter:Add Junit4 to classpath*/
    public void testAop(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
