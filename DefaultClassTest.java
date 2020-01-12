package com.kh.example.chap02_class.defaultClass.controller;

/*default*/ class DefaultClassTest {
//	접근제한자를 작성하지 않으면  default의 의미를 가짐.(default 명시하면 에러 발생)
	public void test() {
		System.out.println("default클래스 내의 test() 호출됨..");
	}
}
