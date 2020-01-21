package com.kh.test.duck.model.vo;

public abstract class Duck {
	private String name;
	private String kinds;
	
	protected Duck() {}
	protected Duck(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getKinds() {
		return kinds;
	}
	
	@Override
	public String toString() {
//		toString 대표값 반환
		return "저는 " + kinds + "이고, 이름은 " + name + "입니다.";
	}
	
	public abstract void quack();	// 추상 메소드
}
