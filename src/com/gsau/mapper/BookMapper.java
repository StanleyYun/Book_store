package com.gsau.mapper;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.gsau.pojo.Book;

public interface BookMapper {
    public ArrayList<Book> findAllBook();

    public int findCount();
    
    public ArrayList<Book> SelectBook(int start, int pageNow);

    public Book findBookById(int id);
}
