package com.kh.test.duck.model.vo;

public class mallard extends Duck{
	private String location;
	private String color;
	
	public mallard () {}
	public mallard (String name, String kinds, String location, String color) {
		super(name,kinds);
		this.location = location;
		this.color = color;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	@Override
	public void quack() {
		System.out.println(super.toString() + " 주 서식지는 " + location +"이며, 색상은 " + color + "입니다.");
	}
	
}
