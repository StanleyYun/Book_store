package com.gsau.pojo;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class ShopCart { 
    Map<Integer, OrderLine>map=new TreeMap<Integer,OrderLine>();

    public Map<Integer, OrderLine> getMap() {
	return map;
    }
    public void addOrder(OrderLine line){
	//�ж϶�������ͬ�鼮�Ƿ����
	OrderLine orderLine=map.get(line.getBook().getId());//�Ȼ�ȡ���ﳵ���Ѵ��ڵ��鼮
	if(orderLine!=null){
	    Long num=orderLine.getNum()+line.getNum();
	    orderLine.setNum(num);
	}else{
	    map.put(line.getBook().getId(), line);//���鱣�浽������
	}
    }
    public Double getCost(){
	Collection<OrderLine> lines=map.values();
	Double cost=0.0;
	for (OrderLine orderLine : lines) {
	    Long num = orderLine.getNum();
	    double price=Double.parseDouble(orderLine.getBook().getPrice());
	    cost=cost+price*num;
	}
	return cost;
    }
    public void modifyline(int bookid,Long num){
	OrderLine line = map.get(bookid);
	line.setNum(num);
    }
    public void clearAll() {
	map.clear();
    }
    public void dropLine(int id){
	map.remove(id);
    }
}
