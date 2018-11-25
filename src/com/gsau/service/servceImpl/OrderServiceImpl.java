package com.gsau.service.servceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gsau.dao.OrderDao;
import com.gsau.dao.UserDao;
import com.gsau.dao.daoImpl.OrderDaoImpl;
import com.gsau.dao.daoImpl.UserDaoImpl;
import com.gsau.pojo.OrderLine;
import com.gsau.pojo.Orderform;
import com.gsau.pojo.User;
import com.gsau.service.OrderService;

public class OrderServiceImpl implements OrderService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private OrderDao orderDao;

	@Override
	public User OrderUser(String name) {
		User user=userDao.findByUserName(name);
		return user;
	}

	@Override
	public void saveOrder(Orderform orderform) {
		orderDao.saveOrder(orderform);
	}

	@Override
	public List<Orderform> findOrderform(User user) {
		List<Orderform> list=orderDao.findAllOrder(user.getId());
		return list;
	}
	public  List<OrderLine> selectOrderLine(int orderid){
		List<OrderLine> orderLine=orderDao.findOrderLine(orderid);
		return orderLine;
	}
	public void delOrderform(int orderid){
		orderDao.delOrderform(orderid);
	}
}
