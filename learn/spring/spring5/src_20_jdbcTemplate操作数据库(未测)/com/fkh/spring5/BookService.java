package com.fkh.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDaoImpl bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }
    public void batchAddBook(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);
    }
    public void batchDeleteBook(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
    public void batchUpdateBook(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }
}
