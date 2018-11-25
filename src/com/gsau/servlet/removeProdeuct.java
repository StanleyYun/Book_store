package com.gsau.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsau.pojo.OrderLine;
import com.gsau.pojo.ShopCart;

/**
 * Servlet implementation class removeProdeuct
 */
public class removeProdeuct extends HttpServlet {
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
	    HttpSession session=request.getSession();
	    ShopCart sp=(ShopCart) session.getAttribute("sp");
	    Integer id=Integer.parseInt(request.getParameter("productid"));
	    sp.dropLine(id);
	    response.sendRedirect("shopcart.jsp");
	}
	

}
