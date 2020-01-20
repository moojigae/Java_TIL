package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		Set<Dog> set = new HashSet<Dog>();
		
		set.add(new Dog("����",4.0));
		set.add(new Dog("ȣ��",4.5));
		set.add(new Dog("����",8.1));
		
		System.out.println(set);
//		[����(8.1kg), ����(4.0kg), ȣ��(4.5kg)]
		
		set.add(new Dog("����",4.0));			// �ּҰ����� ����
		System.out.println(set);
//		[����(8.1kg), ����(4.0kg), ȣ��(4.5kg), ����(4.0kg)]		
//		[����(8.1kg), ����(4.0kg), ȣ��(4.5kg)]			// hashcode, equals ���� �� �ߺ� �����
		
//		Set<String> test = new HashSet<String>();		
//		String ��ü���� �̹� hashcode�� equals�� �������̵� �Ǿ� �־ �ڵ����� �ߺ����� ����� �ȵ�
//		String�� ���� value�� �񱳸� �ϰ� set�� ��ü�� �ּҰ��� ���ϰ� �Ǿ� �ֱ� ������ set�� �������̵��� �ʿ���
//		test.add("����1");
//		test.add("����2");
//		test.add("����3");
//		System.out.println(test);		[����2, ����3, ����1]
//		test.add("����2");
//		System.out.println(test);		[����2, ����3, ����1]
		
		
		Set<Dog> set2 = new LinkedHashSet<Dog>();	// LinkedHashSet : ������ ������ 
		set2.add(new Dog("����",2.1));
		set2.add(new Dog("����",8.3));
		set2.add(new Dog("�κ�",5.0));
		set2.add(new Dog("����",2.1));
		System.out.println(set2);		// [����(2.1kg), ����(8.3kg), �κ�(5.0kg)]
		
		set2.add(new Dog("����",6.1));
		set2.add(new Dog("����",5.2));
		set2.add(new Dog("����",9.5));
		set2.add(new Dog("����",12.5));
		System.out.println(set2);		// [����(2.1kg), ����(8.3kg), �κ�(5.0kg), ����(6.1kg), ����(5.2kg), ����(9.5kg), ����(12.5kg)]
		
		Set<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
//		Exception in thread "main" java.lang.ClassCastException: com.kh.example.set.model.vo.Dog cannot be cast to java.lang.Comparable
//		TreeSet�� ������ �ؾ��ϱ� ������ �������� �־�� �ϴµ� ���� ������ ���� ���� �߻�
//		[����(5.2kg), �κ�(5.0kg), ����(6.1kg), ����(9.5kg), ����(12.5kg), ����(2.1kg), ����(8.3kg)]  compareTo() �޼ҵ� ���� �� ��� ��
		
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("����",6.1));
		set4.add(new Dog("����",8.3));
		set4.add(new Dog("�κ�",5.0));
		set4.add(new Dog("����",2.1));
		set4.add(new Dog("����",6.1));		// �����԰� ���Ƽ� ���� ��ü�� ���� ��������. �̸��� ������ ���ؼ� ������ ��ü���� ���� ��� ��
		set4.add(new Dog("����",5.2));
		set4.add(new Dog("����",9.5));
		set4.add(new Dog("����",12.5));
		System.out.println(set4);
//		[����(2.1kg), �κ�(5.0kg), ����(5.2kg), ����(6.1kg), ����(6.1kg), ����(8.3kg), ����(9.5kg), ����(12.5kg)]
		
//		��� �̾Ƴ���
//		��� 1. Set�� Listȭ ��Ű�� : addAll() ���
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);	
		System.out.println(list);
//		[����(2.1kg), �κ�(5.0kg), ����(5.2kg), ����(6.1kg), ����(6.1kg), ����(8.3kg), ����(9.5kg), ����(12.5kg)]
		System.out.println(list.get(3));		//	����(6.1kg)
		
//		��� 2. Iterator Ȱ���ϱ� : Iterator() ���
		Iterator<Dog> it = set4.iterator();		// TreeSet�� Dog�� Ÿ�� ������ �س��� ������ Iterator�� �����ϰ� ���� ��
		while(it.hasNext())	{		// ���� ���� ������
			System.out.println(it.next()); 		// Dog ���� ������ ��� ��
		}
//		����(2.1kg)
//		�κ�(5.0kg)
//		����(5.2kg)
//		����(6.1kg)
//		����(6.1kg)
//		����(8.3kg)
//		����(9.5kg)
//		����(12.5kg)
		
//		�Ʒ��� �ڵ�� �����ص� ��¾ȵ�. ��ȸ�� �ܹ����̶� �̹� ���� �� �־ ��� �ȵ�
		while(it.hasNext()) {
			System.out.println("re : " + it.next());	
		}
	}
}
