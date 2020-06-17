package com.fkh.spring5;

import java.util.List;

public interface BookDao {

    void add(Book book);

    /*批量添加*/
    void batchAdd(List<Object[]> batchArgs);

    void delete(String bname);

    /*批量删除*/
    void batchDelete(List<Object[]> batchArgs);

    void updateBook(Book book);

    /*批量修改*/
    void batchUpdate(List<Object[]> batchArgs);

    /**/
    int selectCount();

    /*查询返回对象*/
    Book findBookInfo(String bname);

    /*查询返回集合*/
    List<Book> findAllBook();
}
