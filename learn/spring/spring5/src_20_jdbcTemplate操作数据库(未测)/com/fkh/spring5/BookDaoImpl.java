package com.fkh.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        /*1.创建SQL语句*/
        String sql = "insert into t_book values(?,?)";
        /*2.调用方法实现添加*/
        Object[] args = {book.getBname(), book.getAuthor()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    /*批量添加*/
    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void delete(String bname) {
        String sql = "delete from t_book where bname=?";
        int update = jdbcTemplate.update(sql, bname);
        System.out.println(update);
    }
    /*批量删除*/
    @Override
    public void batchDelete(List<Object[]> batchArgs){
        String sql = "delete from t_book where bname=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set author=? where bname=?";
        Object[] args = {book.getAuthor(), book.getBname()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    /*批量修改*/
    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set author=? where bname=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /*查询返回某个值*/
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    /*查询返回对象*/
    @Override
    public Book findBookInfo(String bname) {
        String sql = "select * from t_book where bname=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), bname);
        return book;
    }

    /*查询返回集合*/
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
}
