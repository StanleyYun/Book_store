package com.gsau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.gsau.common.BeanFactory;
import com.gsau.pojo.User;
import com.gsau.service.UserService;

/**
 * Servlet implementation class modifyUser
 */
public class modifyUser extends HttpServlet {
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
	    int id=Integer.parseInt(request.getParameter("userid"));
	    String name=request.getParameter("username");
	    String password=request.getParameter("password");
	    String country=request.getParameter("country");
	    String province=request.getParameter("province");
	    String city=request.getParameter("city");
	    String street1=request.getParameter("street1");
	    String street2=request.getParameter("street2");
	    String zip=request.getParameter("zip");
	    String homephone=request.getParameter("homephone");
	    String officephone=request.getParameter("officephone");
	    String cellphone=request.getParameter("cellphone");
	    String email=request.getParameter("email");
	    User u=new User(id,name,password,country,province,city,street1,street2,zip,homephone,officephone,Long.parseLong(cellphone),email);
	    UserService userService = (UserService) BeanFactory.getObject(BeanFactory.USERSERVICE);
	    try {
		userService.updateUser(u);
		request.getSession().setAttribute("user", u);
		response.sendRedirect("userinfo.jsp");
		
	    } catch (Exception e) {
		
	    }
	}

}
