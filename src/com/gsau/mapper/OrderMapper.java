package com.gsau.mapper;

import java.util.List;

import com.gsau.pojo.OrderLine;
import com.gsau.pojo.Orderform;
import com.gsau.pojo.User;

public interface OrderMapper {
    public void saveOrder(Orderform orderform);

    public int selectOrderIdByUserId(Orderform orderform);
    
    public List<Orderform> findAllOrder(int userid);
    
    public List<OrderLine> findOrderLine(int orderid);
    
    public void delorderLine(int orderid);
    
    public void delorderform(int orderid);
}
