package com.kh.example.chap01_poly.test.model.vo;

public class Child1 extends Parent { //Parent ��ӹ���
	private int z;
	
	public Child1() {}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("�� ù ��° �ڽ��̾�");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("�� ù ��° �ڽ��̾�!!!!!!!!");
	} 
}
