package com.gsau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gsau.pojo.User;
import com.gsau.service.UserService;
import com.gsau.service.servceImpl.UserServiceImpl;

/**
 * Servlet implementation class registerServlet
 */
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setCharacterEncoding("GBK");
	    request.setCharacterEncoding("GBK");
	    String username=request.getParameter("userid");
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
	    User u=new User(username,password,country,province,city,street1,street2,zip,homephone,officephone,Long.parseLong(cellphone),email);
	    UserService userService=new UserServiceImpl();
	    boolean b=userService.registerUser(u);
	    if(b){
		request.getRequestDispatcher("login.jsp").forward(request, response);
	    }else{
		request.getRequestDispatcher("register.jsp?Error=注册失败，请查正后重新注册").forward(request, response);
	    }
	    
	}

}
