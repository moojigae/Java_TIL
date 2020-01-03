package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age; // �Ϲ� ���� ����
		final int AGE; // ��� ���� 
		
		age = 20;
		AGE = 20;
		
		System.out.println("age: " + age); // age: 20
		System.out.println("AGE: " + AGE); // Age: 20
		
		// ������ �� ����
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// ����� �� ���� ������ �����ѵ� ���� �����Ϸ��� �ϴ� ������ �Ұ����ϴٴ� ���� �߻�
		
		System.out.println("�� ���� �� age: " + age); // �� ���� �� age: 30
		System.out.println("�� ���� �� AGE: " + AGE); // �� ���� �� AGE: 20
	}
}
