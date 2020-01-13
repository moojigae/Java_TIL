package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	
	public void method() {
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p = new Parent();
//		���θ�Ÿ�� ���۷���	���θ� ��ü
		p.printParent(); 	// �� �θ��
		
		System.out.println();
		
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
//		�� �ڽ�Ÿ�� ���۷���    �� �ڽ� ��ü
		c1.printChild1();		// �� ù ��° �ڽ��̾�
		c1.printParent(); 		// �� �θ�� / ��ӹް� �־ ȣ�� ����
		
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = new Child2(); // ������ �� ĳ����
//		Parent p3 = new Child1(); // ������
		
		p2.printParent(); // �� �θ��
//		p2 print�� �� �� �ڽ��� �޼ҵ�� �Ⱥ��̰� �θ��� �޼ҵ常 ���̴� ����
//		heap ������ child2 ��ü�� ���� ������ ����� �� �ȿ� int n(Child2���� ������ �ʵ�), child2�� method, 
//		�θ��� int x, int y(�ʵ�)�� parent�� method�� ���µ� ���⼭ �� �� �ִ� ������ �θ��� ������ �� �� �ֱ� ������ ��½� �θ��� �޼ҵ常 ����
//		�ڽİ�ü(Child2)�� �޼ҵ嵵 �Բ� ���� ������ ����ȯ�� �ؾ���
		
		((Child2)p2).printChild2(); // �� �� ��° �ڽ��̾�
//		�ٿ� ĳ����
//		Child2�� method�� ���� ���� ���� ��� (Child2)��� ����ȯ�� ���� �� �� ����
		
		System.out.println();
		
//		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
//		�θ�� �ڽ��� ���� �� ������ �ڽ��� �θ� ���� �� �����Ƿ� ������ �� ����
//		Child2 c2 = new Parent();
//		Type mismatch: cannot convert from Parent to Child2
//		stack�� c2��� �̸����� ������ ����� heap������ Parent�� ���� ��ü�� �������
//		�ڽ� ��ü�� ����� �޾ұ� ������ Heap������ �θ��� ����� �޼ҵ带 ������ ����  
//		�׷��� Parent�� �θ��̱� ������ �ȿ� �ڽ� ��ü�� ����� �޼ҵ带 ������ ���� �ʱ� ������ ����ȯ�� �� �� �ִ°� ��ü�� ����
		
		System.out.println();
		System.out.println("=== ���� ���� ===");
		System.out.println();
		
//		instanceof ������
//		� Ŭ���� ���� �ּҸ� �����ϰ� �ִ��� Ȯ���ϴ� ������ / ����� true,false�� ��ȯ
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		
		for(int i = 0; i < pArr.length;i++) {
			if(pArr[i] instanceof Child1) { 		// pArr�� �ε�����°�� Child1Ŭ������ �����ϰ� ������
				((Child1)pArr[i]).printChild1();	// pArr[i]�� ����ȯ�ؼ� printChild1()�� �����ض�
			} else if(pArr[i] instanceof Child2){	// pArr�� �ε�����°�� Child2Ŭ������ �����ϰ� ������
				((Child2)pArr[i]).printChild2();	// pArr[i]�� ����ȯ�ؼ� printChild2()�� �����ض�
			}
		}
//		=== ���� ���� ===
//
//		�� ù ��° �ڽ��̾�
//		�� �� ��° �ڽ��̾�
//		�� ù ��° �ڽ��̾�
//		�� �� ��° �ڽ��̾�
				
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();
		}
//		���� ���ε�
//		�θ� ��µɰ� ������ �ڽ��� ��µ� ����
//		�������̵��� ����ϸ� �켱���� ������ �ǹǷ� �ڽ��� �޼ҵ尡 ���� �����
//		�� ù ��° �ڽ��̾�!!!!!!!!
//		�� �� ��° �ڽ��̾�!!!!!!!!
//		�� ù ��° �ڽ��̾�!!!!!!!!
//		�� �� ��° �ڽ��̾�!!!!!!!!
	}
}

