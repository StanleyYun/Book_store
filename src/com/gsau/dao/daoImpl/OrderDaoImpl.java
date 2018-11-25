package com.gsau.dao.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsau.common.MyBatisSqlSessionFactory;
import com.gsau.dao.OrderDao;
import com.gsau.mapper.OrderLineMapper;
import com.gsau.mapper.OrderMapper;
import com.gsau.pojo.OrderLine;
import com.gsau.pojo.Orderform;

public class OrderDaoImpl implements OrderDao{

    @Override
    public void saveOrder(Orderform orderform) {
	SqlSession session = MyBatisSqlSessionFactory.openSession();
	OrderMapper Mapper=session.getMapper(OrderMapper.class);
	OrderLineMapper orderLineMapper=session.getMapper(OrderLineMapper.class);
	Mapper.saveOrder(orderform);
	session.commit();
	int orderformid =Mapper.selectOrderIdByUserId(orderform);
	
	for (OrderLine orLine : orderform.getOrderLines()) {
	    orLine.getOrderform().setId(orderformid);
	    orderLineMapper.saveOrderline(orLine);
	}
	session.commit();
    }

    @Override
    public List<Orderform> findAllOrder(int userid) {
	SqlSession session = MyBatisSqlSessionFactory.openSession();
	OrderMapper Mapper=session.getMapper(OrderMapper.class);
	List<Orderform> orders=Mapper.findAllOrder(userid);
	return orders;
    }

    @Override
    public List<OrderLine> findOrderLine(int orderid) {
	SqlSession session = MyBatisSqlSessionFactory.openSession();
	OrderMapper Mapper=session.getMapper(OrderMapper.class);
	List<OrderLine> orderLine=Mapper.findOrderLine(orderid);
	return orderLine;
    }
    public void delOrderform(int orderid){
	SqlSession session = MyBatisSqlSessionFactory.openSession();
	OrderMapper Mapper=session.getMapper(OrderMapper.class);
	Mapper.delorderLine(orderid);
	session.commit();
	Mapper.delorderform(orderid);
	session.commit();
    }


}
