package com.gsau.dao;

import java.util.List;

import com.gsau.pojo.OrderLine;
import com.gsau.pojo.Orderform;

public interface OrderDao {
    public void  saveOrder(Orderform orderform);
    public List<Orderform> findAllOrder(int userid);
    public List<OrderLine> findOrderLine(int orderid);
    public void delOrderform(int orderid);
    
}
