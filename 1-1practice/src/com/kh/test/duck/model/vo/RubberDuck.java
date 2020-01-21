package com.kh.test.duck.model.vo;

public class RubberDuck extends Duck {
	public final static String PLACE = "����ȣ��";
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
		System.out.println(super.toString() + "�����Դ� "+ weight + "kg �Դϴ�. ������ �� �������� ���ؿ�.");
	}
	
}
