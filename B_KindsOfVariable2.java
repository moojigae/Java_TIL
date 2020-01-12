package com.kh.example.chap04_field.control;

public class B_KindsOfVariable2 {
	public static int staticNum;
//	static은 공유의 목적으로 사용되기 때문에 public이 같이 사용됨
//	static에 대해서 접근 할 때 객체 생성없이 class명.변수명 가능
	
	private int testNum = 10;
//	객체가 생기면서 들어가는 값
	private static int staticTestNum = 10;
	
	public B_KindsOfVariable2() { // 생성자 : 객체 만들 때 사용
		testNum++;
		System.out.println("testNum : " + testNum);		
		
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
		
//		testNum : 11
//		staticTestNum : 11		B_KindsOfVariable2 bkv = new B_KindsOfVariable2(); 한 번 실행 시 결과 값
//		testNum : 11
//		staticTestNum : 12		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2(); 한 번 더 실행 시 결과 값
//		위의 결과 값 나온 이유
//		1. Heap 영역에 bkv와 bkv2로 testNum값인 10이 각각 올라
//		2. staticTestNum은 static으로 선언되어 있기 때문에 static 영역에 값 10이 따로 올라감
//		3. B_KindsOfVariable2 bkv = new B_KindsOfVariable2(); 명령을 통해 한 번 실행 되면서 bkv의 testNum은 11이 되고 StaticTestNum = 11
//		4. B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2(); 실행되면서 bkv2의 testNum은 11이 되고 static영역에 따로 있던 StaticTestNum은 12가 됨
	}
}
