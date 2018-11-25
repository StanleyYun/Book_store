package com.gsau.service;

import java.util.List;

import com.gsau.pojo.OrderLine;
import com.gsau.pojo.Orderform;
import com.gsau.pojo.User;

public interface OrderService {
    public User OrderUser(String name);
    public void saveOrder(Orderform orderform);
    public List<Orderform> findOrderform(User user);
    public  List<OrderLine> selectOrderLine(int orderid);
    public void delOrderform(int orderid);
}
