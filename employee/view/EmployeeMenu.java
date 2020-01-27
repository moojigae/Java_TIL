package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private int menu;
	

	Scanner sc = new Scanner(System.in);
	
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		while(menu != 9) {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호를 누르세요 : ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1: insertEmp(); break;
		case 2: updateEmp(); break;
		case 3: deleteEmp(); break;
		case 4: printEmp(); break;
		case 9: System.out.println("프로그램을 종료합니다."); break;
		default: System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
	}
	
	public void insertEmp() {
		System.out.println("사원 번호 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 이름 : ");
		String name = sc.nextLine();
		System.out.println("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("전화 번호 : ");
		String phone = sc.nextLine();
		System.out.println("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.println("사원부서 : ");
			String dept = sc.nextLine();
			System.out.println("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.println("보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
			sc.nextLine();
		}
		if(answer == 'n' || answer == 'N') {
			ec.add(empNo, name, gender, phone);
		}
	}
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호 : ");
		System.out.println("2. 사원 연봉 : ");
		System.out.println("3. 보너스 율 : ");
		System.out.println("9. 돌아가기 : ");
		System.out.println("메뉴 번호를 누르세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: 
			System.out.println("수정할 전화번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			sc.nextLine();
			break;
		case 2: 
			System.out.println("수정할 사원 연봉 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			ec.modify(salary);
			break;
		case 3:
			System.out.println("보너스 율 : ");
			double bonus = sc.nextDouble();
			sc.nextLine();
			ec.modify(bonus);
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다");
			insertEmp();
			break;
		default: System.out.println("잘못 입력하셨습니다."); insertEmp(); break;
		}
	}
	public void deleteEmp() {
		sc.nextLine();
		System.out.println("정말 삭제하시겠습니까?");
		char answer = sc.nextLine().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공했습니다");
		} else {
			insertEmp();
		}
	}
	public void printEmp() {
		if(ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다");
		} else {
		System.out.println(ec.inform());
		}
	}
}
