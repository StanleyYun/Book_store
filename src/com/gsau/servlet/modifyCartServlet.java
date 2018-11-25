package com.gsau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gsau.pojo.ShopCart;

/**
 * Servlet implementation class modifyCartServlet
 */
public class modifyCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String bookid=request.getParameter("productid");
	    String number=request.getParameter("number");
	    ShopCart sp = (ShopCart)request.getSession().getAttribute("sp");
	    int id=Integer.parseInt(bookid);
	    sp.modifyline(Integer.parseInt(bookid), Long.parseLong(number));
	    response.sendRedirect("shopcart.jsp");//forward≥¢ ‘
	}

}
