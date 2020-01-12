package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { 		// 같은 패키지, Parent의 자식이 아님
		Parent p = new Parent();
		p.dNum = 0.0;		//default라서 접근 가능
		p.bool = false;		// 같은 패키지라 접근 됨
		p.ch = 'A';			// public 접근 가능		
//		p.num = 10;
//		The field Parent.num is not visible  -> private이라서 밖에서 안보임
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
