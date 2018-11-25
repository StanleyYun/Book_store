package com.gsau.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orderform implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private User user;
    private double cost;
    private Date orderdate;
    private List<OrderLine> orderLines;
    public Orderform(int id, User user, double cost, Date orderdate) {
	super();
	this.id = id;
	this.user = user;
	this.cost = cost;
	this.orderdate = orderdate;
    }
    public Orderform() {
	super();
    }
    public Orderform(User user, double cost, Date orderdate) {
	super();
	this.user = user;
	this.cost = cost;
	this.orderdate = orderdate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public Date getOrderdate() {
        return orderdate;
    }
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
    @Override
    public String toString() {
	return "Orderform [id=" + id + ", user=" + user + ", cost=" + cost
		+ ", orderdate=" + orderdate + "]";
    }
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
    
}
