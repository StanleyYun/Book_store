package com.gsau.pojo;

import java.io.Serializable;



public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;

	private String name;
	private String price;
	private String info;
	private String image;
	private String isbn;
	private String press;
	private int pagecode;
	private String category;
	private String author;
	
	public Book() {
	    
	    super();
	}
	public Book(String name, String price, String info, String image,
		String isbn, String press, int pagecode, String category,
		String author) {
	    super();
	    this.name = name;
	    this.price = price;
	    this.info = info;
	    this.image = image;
	    this.isbn = isbn;
	    this.press = press;
	    this.pagecode = pagecode;
	    this.category = category;
	    this.author = author;
	}
	public Book(int id, String name, String price, String info,
		String image, String isbn, String press, int pagecode,
		String category, String author) {
	    super();
	    this.id = id;
	    this.name = name;
	    this.price = price;
	    this.info = info;
	    this.image = image;
	    this.isbn = isbn;
	    this.press = press;
	    this.pagecode = pagecode;
	    this.category = category;
	    this.author = author;
	}
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public String getPrice() {
	    return price;
	}
	public void setPrice(String price) {
	    this.price = price;
	}
	public String getInfo() {
	    return info;
	}
	public void setInfo(String info) {
	    this.info = info;
	}
	public String getImage() {
	    return image;
	}
	public void setImage(String image) {
	    this.image = image;
	}
	public String getIsbn() {
	    return isbn;
	}
	public void setIsbn(String isbn) {
	    this.isbn = isbn;
	}
	public String getPress() {
	    return press;
	}
	public void setPress(String press) {
	    this.press = press;
	}
	public int getPagecode() {
	    return pagecode;
	}
	public void setPagecode(int pagecode) {
	    this.pagecode = pagecode;
	}
	public String getCategory() {
	    return category;
	}
	public void setCategory(String category) {
	    this.category = category;
	}
	public String getAuthor() {
	    return author;
	}
	public void setAuthor(String author) {
	    this.author = author;
	}
	@Override
	public String toString() {
	    return "Book [id=" + id + ", name=" + name + ", price=" + price
		    + ", info=" + info + ", image=" + image + ", isbn=" + isbn
		    + ", press=" + press + ", pagecode=" + pagecode
		    + ", category=" + category + ", author=" + author + "]";
	}
	
	
}
