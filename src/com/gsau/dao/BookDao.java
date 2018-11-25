package com.gsau.dao;

import java.util.ArrayList;

import com.gsau.pojo.Book;

public interface BookDao {
    public ArrayList<Book> findAllBook();

    public int BookCount();
    
    public ArrayList<Book> SelectBook(int pageSize,int pageNow);

    public Book findBookById(int id);
}
