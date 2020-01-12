package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
//	Person��ü�� �� �� �ִ� 5���� ���� ����
	Person[] pArr = new Person[5];
	
	System.out.println(pArr);
	for(int i = 0; i < pArr.length; i++) {
		System.out.println("pArr[" + i + "] : " + pArr[i]);
	}
//	pArr[0] : null
//	pArr[1] : null
//	pArr[2] : null
//	pArr[3] : null
//	pArr[4] : null
	
//	�� �ε��� ���� ��ü�� �����Ͽ� ����
	pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
	pArr[1] = new Person("������", 34, '��', 179.5, 96.1);
	pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
	pArr[3] = new Person("�����", 27, '��', 161.4, 56.8);
	pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);
	
	for(int i = 0; i < pArr.length;i++) {
		System.out.println("pArr[" + i + "] : " + pArr[i]);
	}
//	��ü�� ���� �ּҰ� ��µ�
//	pArr[0] : com.kh.example.person.model.vo.Person@6d06d69c
//	pArr[1] : com.kh.example.person.model.vo.Person@7852e922
//	pArr[2] : com.kh.example.person.model.vo.Person@4e25154f
//	pArr[3] : com.kh.example.person.model.vo.Person@70dea4e
//	pArr[4] : com.kh.example.person.model.vo.Person@5c647e05
	
	for(int i = 0; i < pArr.length;i++) {
		System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
	}
//	pArr[0] : ���ǰ�, 20, ��, 175.8, 66.9
//	pArr[1] : ������, 34, ��, 179.5, 96.1
//	pArr[2] : �����, 14, ��, 190.0, 77.3
//	pArr[3] : �����, 27, ��, 161.4, 56.8
//	pArr[4] : ���̹�, 53, ��, 157.9, 58.3
	
	Person her = new Person("�ڽſ�", 20, '��', 164.3, 48.6);
	System.out.println(her);	// com.kh.example.person.model.vo.Person@783e6358
//	1. Person��ü�� �ּҸ� stack���� her�� ��� ����
//	2. her�� ����ϸ� ��ü�� ���� �ּҰ� �翬�� ��µ�
//	3. her.personInfo()�� �Ͽ� Ŭ���� �ȿ� personInfo()�޼ҵ�� ������ �ϸ�
//	       �����ϰ� �ִ� String���� ���
	System.out.println(her.personInfo());	// �ڽſ�, 20, ��, 164.3, 48.6
	}
	
	public void method2() {
//	����� ���ÿ� �Ҵ� �� �ʱ�ȭ
		Person[] pArr = {new Person("���ǰ�", 20, '��', 175.8, 66.9),
						 new Person("������", 34, '��', 179.5, 96.1),
						 new Person("�����", 14, '��', 190.0, 77.3),
						 new Person("�����", 27, '��', 161.4, 56.8),
						 new Person("���̹�", 53, '��', 157.9, 58.3)};
		
		for(int i = 0; i < pArr.length;i++) {
			System.out.println(pArr[i].getName() + "���� ���� : " + pArr[i].personInfo());
//			���ǰ����� ���� : ���ǰ�, 20, ��, 175.8, 66.9
//			���������� ���� : ������, 34, ��, 179.5, 96.1
//			�������� ���� : �����, 14, ��, 190.0, 77.3
//			�������� ���� : �����, 27, ��, 161.4, 56.8
//			���̴̹��� ���� : ���̹�, 53, ��, 157.9, 58.3
		}
	}
}

// ��ü �迭 �ȿ� �� ������ ��� ����
// 1. Person[] pArr = new Person[5]; 
// 	  Person��ü�� �� �� �ִ� pArr�̶�� ������ stack�� ����� heap������ ��ü�� ���� 5���� ������ ������
// 2. ������ heap������ ���� �ּҰ��� pArr�� ��
// 3. heap�������� �� �ε������� �迭�� �ּҰ� �� �ְ� �迭�� ���� �޼ҵ尡 ��
// 4. �迭�� ũ��� �ڷ����� ũ�⿡ ���� ������ ��
// 5. �迭 �ȿ� ��� �ִ� ���� �̱� ���� Person Ŭ���� �ȿ� �ִ� �޼ҵ�� ����
// 6. personInfo() �޼ҵ�� String���� return�� �� �ֵ��� �Ǿ� �־ ��� ����  
