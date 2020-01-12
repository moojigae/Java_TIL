package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTest {
//	�Ű������� ������ ��ȯ�� ������ ���� ����
//	1. �Ű����� ���� ��ȯ�� ���� �޼ҵ�
	public void method1() {
//		   ��ȯ��x 	�Ű�����x
		System.out.println("�Ű������� ��ȯ�� �� �� ���� �޼ҵ��Դϴ�.");		// �Ű������� ��ȯ�� �� �� ���� �޼ҵ��Դϴ�.
	}
	
//	2. �Ű����� ���� ��ȯ�� �ִ� �޼ҵ�
	public int method2() {	
//		  ��ȯ��o 	�Ű�����x
//		This method must return a result of type int
//		��ȯ���� �����ϴ� �޼ҵ忡�� return���� ��������� �ʾ��� �� ������ ����
//		(���� ��ȯ�ؾ��ϴ� ���� int�̱� ������ type int��� �ߴ� ��
		System.out.println("��ȯ���� �ְ� �Ű������� ���� �޼ҵ��Դϴ�.");		// ��ȯ���� �ְ� �Ű������� ���� �޼ҵ��Դϴ�.
		int i = 10;	
		return i;		// 10�� ��ȯ
	}
	
//	3. �Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	public void method3(int num1, int num2) {
//		  ��ȯ�� x              �Ű����� o
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
//		return; // ��ȯ���� void�� ��ȯ�� ���� ���ư�
		System.out.println("sum : " + sum);
//		num1 : 10
//		num2 : 20
//		sum : 30
	}
	
//	4. �Ű����� �ְ� ��ȯ�� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
//		  ��ȯ�� o             �Ű����� o
		return num1 + num2;			// System.out.println(mt.method4(10, 30)); --> 40 ���
//		������ ������ ��� ���� ���� return�� ��Ƽ� ��ȯ �� �� ����
	}
	
//	��ȭ1. ��ȯ���� �迭�� ���
	public int[] method5() {
		int[] iArr = {1,2,3,4,5};
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);	// MethodTest iArr : [I@38082d64
		return iArr;
//		Run resultArr : [I@15db9742		--> �ּҰ��� ��ȯ�߱� ������ �ּҰ��� ��µ�
	}
	
//	��ȭ2. ��ȯ���� Ŭ������ ���
	public User method6() {
		User user = new User("user01", "pass01","�ڽſ�");
		System.out.println("MethodTest user" + user);
		return user;
//		MethodTest usercom.kh.example.chap05_constructor.model.vo.User@6d06d69c
//		Run user : com.kh.example.chap05_constructor.model.vo.User@6d06d69c
	}
}
