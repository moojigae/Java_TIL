package com.kh.example.animal.controller;

import com.kh.example.animal.mode.vo.Animal;
import com.kh.example.animal.mode.vo.Dog;
import com.kh.example.animal.mode.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("������", 9, 6.3);
//		System.out.println(a); 	// ������ 9 6.3
//		a�� ����ϸ� ��ǥ���� ����� �Ǿ�� �� /a�� ���� a.toString�ε� toString()�� ������ �Ǿ��־ toString�� ��� ���ص� ��ǥ���� ��µ�
//		��ǥ���� �ּҷ� ������ �Ǿ� �־��µ� toString()�޼ҵ� �ȿ� return���� �־������μ� �ش� ���� ��ǥ������ �ٲ�� ��µ�
//		System.out.println(a.toString());	// ������ 9 6.3	
//		toString�� ��ǥ���� ����ϹǷ� �ش� �� ���� ���
//		System.out.println(a.inform()); // ������ 9 6.3
//		���� �� ������ ���
		
		Dog d = new Dog("�¾���", 8, 4.5, 40, "���");
		System.out.println(d); // �¾��� 8 4.5 40.0 ���
		
		Snake s = new Snake("���", 4, 10.2, "����");
		System.out.println(s); // ��� 4 10.2 ����
	}
}
