package com.gsau.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gsau.common.BeanFactory;
import com.gsau.exception.UserException;
import com.gsau.pojo.ShopCart;
import com.gsau.pojo.User;
import com.gsau.service.UserService;
import com.gsau.utils.SpringUtil;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    request.setCharacterEncoding("GBK");
	    response.setCharacterEncoding("GBK");
	    UserService userService = (UserService) SpringUtil.getBean("userServiceImpl");
	    HttpSession session=request.getSession();
	    String username=request.getParameter("userid");
	    String password=request.getParameter("password");
	    //UserService userService=new UserServiceImpl();
	    /*方法一：通过设置状态变量进行验证信息反馈
	     * boolean b=false;
	    if( username!=""&&password!=""){
	       b=userService.login(username, password);
	       if(b){
		   //加入session以及添加过滤器
		  // request.getRequestDispatcher("main.jsp").forward(request, response);
		   response.sendRedirect("index.jsp");
	       }else{
		   request.getRequestDispatcher("login.jsp?error='username or password'").forward(request, response);
	       }
	    }else{
		//request.getRequestDispatcher("login.jsp?error='username or password not null'").forward(request, response);
		response.sendRedirect("login.jsp?error='username or password not null'");
		
	    }*/
	    //方法二：通过异常处理解决验证影响反馈
	    try {
		User u=userService.login1(username, password);
		session.setAttribute("user", u);
		ShopCart sp=new ShopCart();
		session.setAttribute("sp", sp);
		response.sendRedirect("index.jsp");
	    } catch (UserException e) {
		session.setAttribute("error", e.getMessage());
		request.getRequestDispatcher("login.jsp").forward(request, response);;
	    }
	}

}
