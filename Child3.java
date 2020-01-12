package com.kh.example.test.model.vo3;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent {
	public Child3() {
//		super.num = 10;
//		super.dNum = 90.9; // 다른 패키지라 안됨
		super.bool = false; // protected는 다른 패키지이지만 상속받은 후손이라 가능
		super.ch = 'b'; // public은 어디서나 가능
	}
}
