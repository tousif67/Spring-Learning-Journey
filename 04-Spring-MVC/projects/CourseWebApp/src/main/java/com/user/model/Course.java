package com.user.model;

public class Course {
	
	private Integer id;
	private String cname;
	private Double price;
	public Course(Integer id, String cname, Double price) {
		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", price=" + price + "]";
	}
	
	
}
