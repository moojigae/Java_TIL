package com.kh.variable;

public class A_Variable { // class
	
	public void declareVariable() { // method
//		���� ���� �� �ʱ�ȭ
//		A. ���� ���� : �ڷ��� ������;
//		1. ����
		boolean isTrue;
//		2. ������
//		2-1. ����
		char ch;
//		2-2. ���ڿ�
		String str;
//		3. ������
//		3-1. ����
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
//		3-2. �Ǽ�
		float fNum;
		double dNum;
//		B. �ʱ�ȭ : ������ = ��;
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
//		fNum = 4.0; 
		// Type mismatch: cannot convert from double to float
		// f�� ���� ��� �Ǽ��� �⺻���� double�� �νĵǱ� ������ 8byte�� 4byte�� ������ �� �� ���� ����
		fNum = 4.0f;
		dNum = 8.0;
		
		ch = 'A'; // ch���� ''/ �� ���ڸ� ���� 
		str = "A"; // str�� "" ��� / �� ���� �̻� ����
		
		System.out.println("isTrue�� ��: " + isTrue);
		System.out.println("bNum�� ��: " + bNum);
		System.out.println("sNum�� ��: " + sNum);
		System.out.println("iNum�� ��: " + iNum);
		System.out.println("lNum�� ��: " + lNum);
		System.out.println("fNum�� ��: " + fNum);
		System.out.println("dNum�� ��: " + dNum);
		System.out.println("ch�� ��: " + ch);
		System.out.println("str�� ��: " + str);
	}
	
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		// 1. ����
		boolean isTrue = false;
		// 2. ������
		// 2.1 ����
		char ch = '��';
		// 2.2 ���ڿ� 
		String str = "kh����������";
		// 3. ������
		// 3-1 ����
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 3-2 �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue�� ��: " + isTrue);		// isTrue�� ��: true
		System.out.println("ch�� ��: " + ch);				// ch�� ��: A		
		System.out.println("str�� ��: " + str);			// str�� ��: A		
		System.out.println("bNum�� ��: " + bNum);			// bNum�� ��: 1
		System.out.println("sNum�� ��: " + sNum);			// sNum�� ��: 2
		System.out.println("iNum�� ��: " + iNum);			// iNum�� ��: 4
		System.out.println("lNum�� ��: " + lNum);			// lNum�� ��: 8
		System.out.println("fNum�� ��: " + fNum);			// fNum�� ��: 4.0
		System.out.println("dNum�� ��: " + dNum);			// dNum�� ��: 8.0
	}
	
	
}
