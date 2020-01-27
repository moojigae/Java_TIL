package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private int menu;
	

	Scanner sc = new Scanner(System.in);
	
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		while(menu != 9) {
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("3. ��� ����");
		System.out.println("4. ��� ���");
		System.out.println("9. ���α׷� ����");
		System.out.println("�޴� ��ȣ�� �������� : ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1: insertEmp(); break;
		case 2: updateEmp(); break;
		case 3: deleteEmp(); break;
		case 4: printEmp(); break;
		case 9: System.out.println("���α׷��� �����մϴ�."); break;
		default: System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void insertEmp() {
		System.out.println("��� ��ȣ : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.println("��� �̸� : ");
		String name = sc.nextLine();
		System.out.println("��� ���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		System.out.println("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.println("����μ� : ");
			String dept = sc.nextLine();
			System.out.println("��� ���� : ");
			int salary = sc.nextInt();
			System.out.println("���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
			sc.nextLine();
		}
		if(answer == 'n' || answer == 'N') {
			ec.add(empNo, name, gender, phone);
		}
	}
	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ��ȣ : ");
		System.out.println("2. ��� ���� : ");
		System.out.println("3. ���ʽ� �� : ");
		System.out.println("9. ���ư��� : ");
		System.out.println("�޴� ��ȣ�� �������� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: 
			System.out.println("������ ��ȭ��ȣ : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			sc.nextLine();
			break;
		case 2: 
			System.out.println("������ ��� ���� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			ec.modify(salary);
			break;
		case 3:
			System.out.println("���ʽ� �� : ");
			double bonus = sc.nextDouble();
			sc.nextLine();
			ec.modify(bonus);
			break;
		case 9:
			System.out.println("���θ޴��� ���ư��ϴ�");
			insertEmp();
			break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); insertEmp(); break;
		}
	}
	public void deleteEmp() {
		sc.nextLine();
		System.out.println("���� �����Ͻðڽ��ϱ�?");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			ec.remove();
			System.out.println("������ ������ �����߽��ϴ�");
		} else {
			insertEmp();
		}
	}
	public void printEmp() {
		if(ec.inform() == null) {
			System.out.println("��� �����Ͱ� �����ϴ�");
		} else {
		System.out.println(ec.inform());
		}
	}
}
