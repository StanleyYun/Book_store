package com.gsau.lisnter;

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.gsau.pojo.Book;
import com.gsau.service.BookService;
import com.gsau.service.servceImpl.BookServiceImpl;

/**
 * Application Lifecycle Listener implementation class indexListener
 *
 */
public class indexListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
	BookService  bookservice=new BookServiceImpl();
	ArrayList<Book> book=bookservice.findAllBook();
	int rowCount=book.size();
	ServletContext sc=sce.getServletContext();
	sc.setAttribute("books", book);
	sc.setAttribute("rowCount", rowCount);
	
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

   

	
}
