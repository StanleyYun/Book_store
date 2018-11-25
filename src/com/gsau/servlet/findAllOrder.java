package com.gsau.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsau.common.BeanFactory;
import com.gsau.pojo.Orderform;
import com.gsau.pojo.User;
import com.gsau.service.OrderService;

/**
 * Servlet implementation class findAllOrder
 */
public class findAllOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    List<Orderform>orders=null;
	    OrderService orderService = (OrderService) BeanFactory.getObject(BeanFactory.ORDERSERVICR);
	    HttpSession session=request.getSession();
	    User user=(User) session.getAttribute("user");
	    if(user!=null){
	         orders=orderService.findOrderform(user);
	    }
	    session.setAttribute("orders", orders);
	    response.sendRedirect("order.jsp");
	    
	}

}
