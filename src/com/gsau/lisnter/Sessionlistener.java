package com.gsau.lisnter;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.gsau.pojo.ShopCart;

/**
 * Application Lifecycle Listener implementation class Sessionlistener
 *
 */
public class Sessionlistener implements HttpSessionListener {

  
    @Override
    public void sessionCreated(HttpSessionEvent se) {
	ShopCart sp=new ShopCart();
	se.getSession().setAttribute("sp", sp);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

   
}
