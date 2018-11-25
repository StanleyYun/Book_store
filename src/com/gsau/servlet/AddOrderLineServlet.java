package com.gsau.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsau.pojo.Book;
import com.gsau.pojo.OrderLine;
import com.gsau.pojo.ShopCart;
import com.gsau.pojo.User;
import com.gsau.service.BookService;
import com.gsau.utils.SpringUtil;

/**
 * Servlet implementation class AddOrderLineServlet
 */
public class AddOrderLineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookid=request.getParameter("productid");
		BookService bookService = (BookService) SpringUtil.getBean("bookService");
		Book book=bookService.SelectBookById(Integer.parseInt(bookid));
		OrderLine orderLine=new OrderLine();
		orderLine.setBook(book);
		orderLine.setNum(1l);
		HttpSession session=request.getSession();
		ShopCart sp = (ShopCart)session.getAttribute("sp");
		User user=(User)session.getAttribute("user");
		if(sp!=null){
			sp.addOrder(orderLine);
			response.sendRedirect("shopcart.jsp");
		}
	}

}
