package com.gsau.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsau.common.BeanFactory;
import com.gsau.pojo.OrderLine;
import com.gsau.service.OrderService;

/**
 * Servlet implementation class findOrderlineByorderId
 */
public class findOrderlineByorderId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findOrderlineByorderId() {
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
	    int id=Integer.parseInt(request.getParameter("orderid"));
	    OrderService orderService = (OrderService) BeanFactory.getObject(BeanFactory.ORDERSERVICR);
	    List<OrderLine> orderLine= orderService.selectOrderLine(id);
	    HttpSession session=request.getSession();
	    double cost= orderLine.get(0).getOrderform().getCost();
	    session.setAttribute("orderLines", orderLine);
	    session.setAttribute("cost", cost);
	    response.sendRedirect("orderinfo.jsp");
	}

}
