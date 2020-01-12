package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.control.A_KindsOfVariable;
import com.kh.example.chap04_field.control.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		
		A_KindsOfVariable akv = new A_KindsOfVariable();
//		akv.method1(20);
//		akv.method2();
		
		// ��ü ���� : B_KindsOfVariable2
		
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
//		                         ------------------------ ������
//		bkv.staticNum;
//		Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
//		staticNum�� ������ ������ ���� ���� ��� ����. ������ ������ ��
		
//		static�� ���ؼ� ���� �� �� ��ü �������� class��.������ ����
//		int a = bkv.staticNum;
//		The static field B_KindsOfVariable2.staticNum should be accessed in a static way
//		static���� ����� ��ü ���� �ʿ���� class��.���������� �����ϸ� �ȴٰ� ����� ���޼��� �߻�
		
		int a1 = B_KindsOfVariable2.staticNum;
//		com.kh.example.chap04_field.control.B_KindsOfVariable2���� static������ �ö󰡱� ������ ��ü ���� ���� ����
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();

		Product p = new Product();
		p.inform();
//		1. JVM �⺻�� �ʱ�ȭ : null, null, 0, 0
//		2. ����� �ʱ�ȭ : ��������, ������, 1500, 100
//		3. �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
//		�ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 80
		
		Product p3 = new Product();
		p3.inform();
//		�ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 70
//		ĭ��, �Ե�, 1000, 139
//		ĭ��, �Ե�, 1000, 129
//		ĭ��, �Ե�, 1000, 119
	}
}
