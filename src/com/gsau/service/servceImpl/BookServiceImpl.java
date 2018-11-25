package com.gsau.service.servceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsau.dao.BookDao;
import com.gsau.pojo.Book;
import com.gsau.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public ArrayList<Book> findAllBook() {
		ArrayList<Book> listBook = bookDao.findAllBook();
		return listBook;
	}
	public int bookCount(){
		int rowCount = bookDao.BookCount();
		return rowCount;
	}
	public ArrayList<Book> SelectBook(int pageSize,int pageNow){
		ArrayList<Book> listBook = bookDao.SelectBook(pageSize,pageNow);
		return listBook;
	}
	@Override
	public Book SelectBookById(int id) {
		Book book = bookDao.findBookById(id);
		return book;
	}
}
