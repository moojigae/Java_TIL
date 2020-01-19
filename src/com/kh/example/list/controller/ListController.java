package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		1. �÷��� ���� 1. ũ���� ������ ���� 
//		ũ�⸦ �����ϴ� ���ϴ� �ȿ� ���� �þ�� �ڵ����� �þ
		List list1 = new ArrayList(); // �ʱ� �뷮 10
		
		List<Student> list = new ArrayList<Student>(3); // ()�ȿ� ���� �־��༭ �뷮�� 3�� ��
// 		�ڿ� <>��  �ȿ� Student���� �����ϳ� ������ ���� java������ ������ �ȵ� �� �����Ƿ� ���� ���ִ°� ����
		
//		add(E e) : ����Ʈ ���� ������ e �߰�
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("���볲", 60));
		
		System.out.println("list : " + list); 
//		list : [�׽�Ʈ(0��), ���볲(60��)]
		
		list.add(new Student("������", 90));
		list.add(new Student("����ȣ", 85));
		
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
//		���� list�� ��� element ���� : 4
//		list : [�׽�Ʈ(0��), ���볲(60��), ������(90��), ����ȣ(85��)]
		
		list.add(new Student("���̹�", 66));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
//		���� list�� ��� element ���� : 5
//		list : [�׽�Ʈ(0��), ���볲(60��), ������(90��), ����ȣ(85��), ���̹�(66��)]
		
		
//		�÷��� ���� 2. �߰�/����/���� ���� ���ó�� ����
//		add(int index, E e) : index��° �ε����� e �߰�
		list.add(0, new Student("�����", 100));
		System.out.println("list : " + list);
//		list : [�����(100��), �׽�Ʈ(0��), ���볲(60��), ������(90��), ����ȣ(85��), ���̹�(66��)]
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : " + list);
//		list : [�����(100��), �׽�Ʈ(0��), ���볲(60��), ���ǰ�(40��), ������(90��), ����ȣ(85��), ���̹�(66��)]
		
//		remove(int index) : �ش� index��° ��ü ���� / ��ü �ּҸ� ���� ����
		list.remove(1); // 1��° �ε��� ����
		System.out.println("list : " + list);
//		list : [�����(100��), ���볲(60��), ���ǰ�(40��), ������(90��), ����ȣ(85��), ���̹�(66��)]

//		remove(Object o) : �ش� Object ��ü ����
		list.remove(new Student("���ǰ�", 40)); 
//		new�� �̿��ؼ� ������ �ϰ� �ֱ� ������ ���� ������ ���ǰ� 40�� �ּҰ� �ٸ�. �׷��� ������ �ȵ� 
//		Object Ŭ���� �ȿ� equals()�޼ҵ�� hashcode()�޼ҵ带 �������̵��� ���� �������ؾ�����
//		�ּҰ��� ���ϴ°� �ƴ϶� �ʵ尪�� ���� �� �ְ� ���༭ ������ ����
		System.out.println("list : " + list);
//		list : [�����(100��), ���볲(60��), ���ǰ�(40��), ������(90��), ����ȣ(85��), ���̹�(66��)]
//		equals()�޼ҵ�� hashcode()�޼ҵ带 �������̵��� ���� ������ �� ���ǰ� ������ 
//		list : [�����(100��), ���볲(60��), ������(90��), ����ȣ(85��), ���̹�(66��)]
		
		
//		���� ��� 1. Collections Ŭ���� �̿�
//		Collections.sort(list); // ���� �������� ������ �Ѱ��� �������� ����
		Collections.sort(list); // compareTo() �������̵� ���� �� �������� ���� ��
		System.out.println("�̸� �������� : " + list);
//		�̸� �������� : [������(90��), ���볲(60��), �����(100��), ���̹�(66��), ����ȣ(85��)]
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
//		
//		System.out.println(strList);
//		[����ð�, ���ɽð�, ��ٽð�, ���ð�, ��ٽð�, ��ħ�ð�]
//		Collections.sort(strList);
//		System.out.println(strList); // sort�� ������ �ִ� ������ ������ �������� ������
//		[���ð�, ����ð�, ���ɽð�, ��ٽð�, ��ħ�ð�, ��ٽð�]
		
		
//		���� ��� 2. List.sort()�޼ҵ� �̿�
//		1. Collections.sort()�� comparable�� ��ӹ޾� comparaTo �޼ҵ� �����Ǹ� ���� ���� ����(�� ���� ����)
//		2. ������ Comparator Ŭ������ ���� ����(���� ���� ����) �� ������ �����ϴ� 
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator()); // Comparator�� ���� ����
		System.out.println("���� �������� : " + list);
//		���� �������� : [���볲(60��), ���̹�(66��), ����ȣ(85��), �ں���(85��), ������(90��), �����(100��)]
		
		
//		set(int index, E e) : index��° �ε����� �ִ� ��Ҹ� e�� ����
		list.set(2, new Student("�����", 31));
		System.out.println("list : " + list);
//		list : [���볲(60��), ���̹�(66��), �����(31��), ����ȣ(85��), ������(90��), �����(100��)]
		
		
//		get(int index) : index��° �ε����� �ִ� ��Ҹ� ������ ��
		Student s = list.get(2);
		System.out.println(s); // �����(31��) ���� �����ų� ���� �ʰ� ������ ��
		System.out.println("list : " + list); 
//		list : [���볲(60��), ���̹�(66��), �����(31��), ����ȣ(85��), ������(90��), �����(100��)]
		
		
//		subList(int index1, int index2) : index1��° �ε����κ��� index2��° �ε������� ����Ʈ ��ȯ
		System.out.println("list ���� : " + list.subList(2, 5));
//		list ���� : [�����(31��), ����ȣ(85��), ������(90��)]
		
		
//		contains(Object o) : o�� ����Ʈ�� �����Ѵٸ� true��ȯ 
//		indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ���ٸ� -1 ��ȯ
//		���� ȥ���ؼ� ���� ���ٴ� indexOf�� ���� ��
		System.out.println("������, 90�� �ִ°�? " + list.contains(new Student("������",90)));
		System.out.println("������, 90�� �ε��� ��ġ��? " + list.indexOf(new Student("������",90)));
		System.out.println("�׽�Ʈ, 0�� �ε��� ��ġ��? " + list.indexOf(new Student("�׽�Ʈ",0)));
//		������, 90�� �ִ°�? true
//		������, 90�� �ε��� ��ġ��? 4
//		�׽�Ʈ, 0�� �ε��� ��ġ��? -1
		
		
//		clear() : ����� ��� ��ü ����
//		isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println("list : " + list); 	// list : []
		System.out.println("list�� �������? " + list.isEmpty()); // list�� �������? true
	}
}
