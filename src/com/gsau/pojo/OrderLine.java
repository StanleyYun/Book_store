package com.gsau.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderLine implements Serializable{
    private int id;
    private Long num;
    private Book book;
    private Date date;
    
    private Orderform orderform;
    
    public OrderLine() {
    }
    public OrderLine(int id, Long num, Book book, Orderform orderform) {
	super();
	this.id = id;
	this.num = num;
	this.book = book;
	this.orderform = orderform;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Long getNum() {
        return num;
    }
    public void setNum(Long num) {
        this.num = num;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Orderform getOrderform() {
        return orderform;
    }
    public void setOrderform(Orderform orderform) {
        this.orderform = orderform;
    }
    @Override
    public String toString() {
	return "OrderLine [id=" + id + ", num=" + num + ", book=" + book
		+ ", orderform=" + orderform + "]";
    }
    
}
