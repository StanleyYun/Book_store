package com.gsau.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFilter() {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
	    FilterChain chain) throws IOException, ServletException {
	HttpServletRequest req=(HttpServletRequest)request;
	HttpServletResponse res=(HttpServletResponse)response;
	req.setCharacterEncoding("GBK");
	res.setCharacterEncoding("GBK");
	HttpSession session=req.getSession(false);
	if(session==null){
	    res.sendRedirect(req.getContextPath()+"/login.jsp");
	}else{
	    if(session.getAttribute("user")!=null){
		chain.doFilter(req, res);
	    }else{
		session.setAttribute("error", "当前用户未登录!!!请登录后重试");
		res.sendRedirect(req.getContextPath()+"/login.jsp");
	    }
	    
	}
    }

    @Override
    public void destroy() {
    }

}
