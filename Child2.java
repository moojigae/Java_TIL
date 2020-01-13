package com.kh.example.chap01_poly.test.model.vo;

public class Child2 extends Parent { // Parent 상속 받음
	private int n;
	
	public Child2() {}
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void printChild2() {
		System.out.println("나 두 번째 자식이야");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("나 두 번째 자식이야!!!!!!!!");
	}
}
