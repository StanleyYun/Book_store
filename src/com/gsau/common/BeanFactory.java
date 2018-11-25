package com.gsau.common;

import com.gsau.service.OrderService;
import com.gsau.service.UserService;
import com.gsau.service.servceImpl.OrderServiceImpl;
import com.gsau.service.servceImpl.UserServiceImpl;


public class BeanFactory {
    private static UserService us;
    private static OrderService os;
    public static final String USERSERVICE="UserService";
    public static final String ORDERSERVICR="OrderService";
    public static Object getObject(String name){
	if(name.equals(USERSERVICE)){
	    return getService();
	}
	if(name.equals(ORDERSERVICR)){
	    return getOrderservie();
	}
	return null;
    }
    private static Object getOrderservie() {
	if(os==null){
	    os=new OrderServiceImpl();
	}
	return os;
    }
    private static UserService getService() {
	if(us==null){
	    us=new UserServiceImpl();
	}
	return us;
    }
}
