package com.gsau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gsau.common.BeanFactory;
import com.gsau.service.OrderService;

/**
 * Servlet implementation class removeOrder
 */
public class removeOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    int id=Integer.parseInt(request.getParameter("orderid"));
	    OrderService orderService = (OrderService) BeanFactory.getObject(BeanFactory.ORDERSERVICR);
	    orderService.delOrderform(id);
	    request.getRequestDispatcher("findAllOrder").forward(request, response);
	}

}
