package com.kh.example.chap04_field.control;

public class B_KindsOfVariable2 {
	public static int staticNum;
//	static�� ������ �������� ���Ǳ� ������ public�� ���� ����
//	static�� ���ؼ� ���� �� �� ��ü �������� class��.������ ����
	
	private int testNum = 10;
//	��ü�� ����鼭 ���� ��
	private static int staticTestNum = 10;
	
	public B_KindsOfVariable2() { // ������ : ��ü ���� �� ���
		testNum++;
		System.out.println("testNum : " + testNum);		
		
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
		
//		testNum : 11
//		staticTestNum : 11		B_KindsOfVariable2 bkv = new B_KindsOfVariable2(); �� �� ���� �� ��� ��
//		testNum : 11
//		staticTestNum : 12		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2(); �� �� �� ���� �� ��� ��
//		���� ��� �� ���� ����
//		1. Heap ������ bkv�� bkv2�� testNum���� 10�� ���� �ö�
//		2. staticTestNum�� static���� ����Ǿ� �ֱ� ������ static ������ �� 10�� ���� �ö�
//		3. B_KindsOfVariable2 bkv = new B_KindsOfVariable2(); ����� ���� �� �� ���� �Ǹ鼭 bkv�� testNum�� 11�� �ǰ� StaticTestNum = 11
//		4. B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2(); ����Ǹ鼭 bkv2�� testNum�� 11�� �ǰ� static������ ���� �ִ� StaticTestNum�� 12�� ��
	}
}
