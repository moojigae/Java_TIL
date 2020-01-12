package com.kh.example.animal.mode.vo;

public class Animal {
//- name : String
//- age : int
//- weight : double

// +Animal()
// +Animal(name:String, age:int, double:weight)
	
//	+ getter/setter
//	+ inform():String
//	  	반환 형식 : 이름 나이 몸무게
	
	private String name;
	private int age;
	private double weight;
	
	public Animal() {}
	public Animal(String name,int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
//	public String inform() { // Animal의 실질적 대표값
//		return name + " "+ age + " " + weight;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " "+ age + " " + weight; 
//		return super.toString(); // 주소값 출력
//		extends하지 않았으면 Object가 부모
	}
}
