package com.kh.example.chap04_field.control;

public class A_KindsOfVariable { // <== Ŭ���� ������ ����
//	Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ�
//	== ������� 
//	== ����ʵ�
//	== �������� 
	private int globalNum;	
	
	public void method1(int num) { // <== �޼ҵ� ������ ����
//		 				--------�Ű����� : �޼ҵ��� ����� �� ��ȣ �ȿ� �����ϴ� ����
//		�Ű����� : �ܺε� ���ε� �ٸ� ������ ���� �޾ƿ��� ������ ��
//		�Ű����� ���� ���������� �������� ������
//		�޼ҵ� �������� �ۼ��ϴ� ���� : ��������
		int localNum = 10;
		
		System.out.println(localNum);	// 10
//		The local variable localNum may not have been initialized
//		���������� �ݵ�� �ʱ�ȭ�Ǿ� �־�� �ϴµ� �ʱ�ȭ�� �ȵǼ� �ߴ� ����

		System.out.println(num);		// 20 	�Ű������� �ѱ� �� ���
//		 �Ű������� ���� �޾��� �� �ִ� �����̱� ������ ���� �ʱ�ȭ ���ص� ��
		
		System.out.println(globalNum);	// 0 	�� �ʱ�ȭ�� �ȵǾ� �ֱ� ������ jvm �⺻�� ���
//		���������̱� ������ ���� ���� �ٷ� ��µ� 
		
	} // <== �޼ҵ� ������ ��
	
	public void method2() {
//		num = 0;
//		method1���� ������ �Ű������� ���������̱� ������ �ܺο����� ��� �� �� ����
//		System.out.println(localnum);
//		localnum cannot be resolved to a variable 
//		���������� �ش����� �������� ��� ����. ���� �ۿ��� ����Ϸ��� �ؼ� ������
		System.out.println(globalNum); // 0
	}
} // <== Ŭ���� ������ ��
