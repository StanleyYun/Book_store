package com.gsau.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtil implements ApplicationContextAware{

	private static ApplicationContext applicationContext = null;
	
	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		// TODO Auto-generated method stub
		applicationContext = ac;
	}
	
	public  static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static Object getBean(String id) {
		ApplicationContext applicationContext = getApplicationContext();
		return applicationContext.getBean(id);
	}
}
