package com.gsau.service;

import java.util.ArrayList;

import com.gsau.pojo.Book;

public interface BookService {
    public ArrayList<Book> findAllBook();
    public int bookCount();
    public ArrayList<Book> SelectBook(int pageSize,int pageNow);
    public Book SelectBookById(int id);
}
