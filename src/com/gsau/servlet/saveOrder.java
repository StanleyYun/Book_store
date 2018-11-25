package com.gsau.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsau.common.BeanFactory;
import com.gsau.pojo.OrderLine;
import com.gsau.pojo.Orderform;
import com.gsau.pojo.ShopCart;
import com.gsau.pojo.User;
import com.gsau.service.OrderService;


/**
 * Servlet implementation class saveOrder
 */
public class saveOrder extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	OrderService orderService = (OrderService) BeanFactory.getObject(BeanFactory.ORDERSERVICR);
	HttpSession session=request.getSession();
	ShopCart sp=(ShopCart)session.getAttribute("sp");
	User user=(User) session.getAttribute("user");
	Orderform orderform=new Orderform(user,sp.getCost(),new Date());
	Map<Integer, OrderLine> map = sp.getMap();
	List<OrderLine> orderLines=new ArrayList<OrderLine>();
	Collection<OrderLine> collection =map.values();
	for (OrderLine orderLine : collection) {
	    orderLine.setOrderform(orderform);
	}
	orderLines.addAll(collection);
	orderform.setOrderLines(orderLines);
	orderService.saveOrder(orderform);
	sp.clearAll();
	request.getRequestDispatcher("findAllOrder").forward(request, response);
    }

}
