package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "��������";
	private String brand = "������";
	private int price = 1500;
	private static int num = 100;
	
	{	// �ν��Ͻ� ���� : �ν��Ͻ�(��ü)�� ������� �� �޸𸮿� �ö�
		name = "ĭ��";
		price = 1000;
		brand = "�Ե�";
		num -= 10;
	}
	
	static {
//		static ���� ó�� �� �� �ʱ�ȭ ��
//		static�� ���α׷� �������ڸ��� �ö󰡾��ϴµ� 
//		�Ʒ� ������ static�� �ƴ϶� ��ü�� ������ �ö󰡴� �ֵ��̶� �ö��� Ȯ������ �ʾ� ���� ���� ����
//		name = "Ȩ����";
//		brand = "����";
//		price = 2000;
		num = 150;
		num--;
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);	
//		ĭ��, �Ե�, 1000, 139
//		ĭ��, �Ե�, 1000, 129
//		ĭ��, �Ե�, 1000, 119
		
//		���� ��� �� ��� ����
//		1. ���α׷� ó�� ���� �� static�� ���ԵǾ� �ִ� �ڵ�� static�������� �ö�
//		2. �׷����� static������ num = 100���� �ö� �� static ���� ���� num = 149�� �Ǿ� ����
//		3. �ν��Ͻ� �ʱ�ȭ�� ���ؼ� ��ü�� �� �� ���� �� ������ num���� -10�� �� ���� ��µ�
	}
}
