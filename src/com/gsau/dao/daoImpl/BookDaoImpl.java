package com.gsau.dao.daoImpl;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsau.common.MyBatisSqlSessionFactory;
import com.gsau.dao.BookDao;
import com.gsau.mapper.BookMapper;
import com.gsau.pojo.Book;

@Repository
public class BookDaoImpl implements BookDao{

	@Override
	public ArrayList<Book> findAllBook() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper=session.getMapper(BookMapper.class);
		ArrayList<Book> booklist=mapper.findAllBook();
		return booklist;
	}

	@Override
	public int BookCount() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper=session.getMapper(BookMapper.class);
		int rowCount=mapper.findCount();
		return rowCount;
	}

	@Override
	public ArrayList<Book> SelectBook(int pageSize,int pageNow){
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper=session.getMapper(BookMapper.class);
		pageSize = pageSize*(pageNow-1);
		int start = pageSize*pageNow+1;
		RowBounds rowBounds=new RowBounds(start, pageSize);
		ArrayList<Book> list=mapper.SelectBook(start, pageSize);
		return list;
	}

	@Override
	public Book findBookById(int id) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper=session.getMapper(BookMapper.class);
		Book book=mapper.findBookById(id);
		return book;
	}
}
