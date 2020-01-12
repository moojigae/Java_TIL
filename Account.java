package com.kh.example.chap01_encapsulation;

public class Account {	// Ŭ���� ����
//	Ŭ���� ������ �ִ� ������ ��� ������� ��. �޼ҵ� ������ �ִ� ������ �ƴ�
//	��������, ��� ����, ��� �ʵ�, �ʵ� �� ���� ��
//	��� ���� �տ��� private ������ �ٿ��� ��
	private String name = "�ڽſ�";
	private String phone = "010-9468-8140";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0;
	
//	�Ա� �޼ҵ�
//	��� �Լ�(�޼ҵ�)�� Ŭ���� �ۿ��� ������ �� �ֵ��� public���� ����
	public void deposit(int money) {	// �޼ҵ� ����
//		�޼ҵ� ���� �ȿ����� ���� : �������� 
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
//	��� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	
//  �ܾ� ��ȸ �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ��� " + balance + "���Դϴ�.");
	}
}
