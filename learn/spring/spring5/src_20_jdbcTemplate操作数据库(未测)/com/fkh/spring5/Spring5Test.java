package com.fkh.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Spring5Test {

    @Test    /*Alt+Enter:Add Junit4 to classpath*/
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBname("abc");
        book.setAuthor("jjj");
        bookService.addBook(book);
        /*批量添加*/
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"a","1"};
        Object[] o2 = {"b","2"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        bookService.batchAddBook(batchArgs);
        /*批量删除*/
        List<Object[]> batchArgs1 = new ArrayList<>();
        Object[] o3 = {"2"};
        Object[] o4 = {"3"};
        batchArgs1.add(o3);
        batchArgs1.add(o4);
        bookService.batchDeleteBook(batchArgs1);
        /*批量修改*/
        List<Object[]> batchArgs2 = new ArrayList<>();
        Object[] o5 = {"a","3"};
        Object[] o6 = {"b","4"};
        batchArgs2.add(o5);
        batchArgs2.add(o6);
        bookService.batchUpdateBook(batchArgs2);
    }
}
