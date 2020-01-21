package com.kh.test.duck.model.vo;

public class RubberDuck extends Duck {
	public final static String PLACE = "석촌호수";
	private int weight;
	
	public RubberDuck() {}
	public RubberDuck(String name, String kinds, int weight) {
		super(name,kinds);
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	@Override
	public void quack() {
		System.out.println(super.toString() + "몸무게는 "+ weight + "kg 입니다. 하지만 전 말을하지 못해요.");
	}
	
}
