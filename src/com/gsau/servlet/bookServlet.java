package com.gsau.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gsau.pojo.Book;
import com.gsau.service.BookService;
import com.gsau.utils.SpringUtil;

/**
 * Servlet implementation class bookServlet
 */
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public bookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookService bookService = (BookService) SpringUtil.getBean("bookServiceImpl");
		int pageSize=4;

		int rowCount = bookService.bookCount();
		int pageCount=rowCount% pageSize==0 ? rowCount/pageSize: rowCount/pageSize+1;
		int pageNow=1;
		//String spageNow=request.getParameter("pageNow");
		String spageNow=request.getParameter("pageNow");
		if(spageNow!=null){
			pageNow=Integer.parseInt(spageNow);
		}

		ArrayList<Book> books = bookService.SelectBook(pageSize, pageNow);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("books",books); 
		response.sendRedirect("index.jsp");
	}

}
