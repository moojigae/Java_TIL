package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.setEmpNo(100);
		em.setEmpName("홍길동");
		em.setDept("영업부");
		em.setJob("과장");
		em.setAge(25);
		em.setGender('남');
		em.setSalary(2500000);
		em.setBonusPoint(0.05);
		em.setPhone("010-1234-5678");
		em.setAddress("서울시 강남구");
		
		
		System.out.println(em.getEmpNo() + " " + em.getEmpName() + " " + em.getDept() + " "
							+ em.getJob() + " " + em.getAge() + " " + em.getGender() + " " +
							em.getSalary() + " " + em.getBonusPoint() + " " + em.getPhone() 
							+ " " + em.getAddress());
	}
}
