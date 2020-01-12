package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
//	Person객체가 들어갈 수 있는 5개의 공간 생성
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
	
//	각 인덱스 별로 객체를 생성하여 대입
	pArr[0] = new Person("강건강", 20, '남', 175.8, 66.9);
	pArr[1] = new Person("남나눔", 34, '남', 179.5, 96.1);
	pArr[2] = new Person("도대담", 14, '남', 190.0, 77.3);
	pArr[3] = new Person("류라라", 27, '여', 161.4, 56.8);
	pArr[4] = new Person("문미미", 53, '여', 157.9, 58.3);
	
	for(int i = 0; i < pArr.length;i++) {
		System.out.println("pArr[" + i + "] : " + pArr[i]);
	}
//	객체에 대한 주소값 출력됨
//	pArr[0] : com.kh.example.person.model.vo.Person@6d06d69c
//	pArr[1] : com.kh.example.person.model.vo.Person@7852e922
//	pArr[2] : com.kh.example.person.model.vo.Person@4e25154f
//	pArr[3] : com.kh.example.person.model.vo.Person@70dea4e
//	pArr[4] : com.kh.example.person.model.vo.Person@5c647e05
	
	for(int i = 0; i < pArr.length;i++) {
		System.out.println("pArr[" + i + "] : " + pArr[i].personInfo());
	}
//	pArr[0] : 강건강, 20, 남, 175.8, 66.9
//	pArr[1] : 남나눔, 34, 남, 179.5, 96.1
//	pArr[2] : 도대담, 14, 남, 190.0, 77.3
//	pArr[3] : 류라라, 27, 여, 161.4, 56.8
//	pArr[4] : 문미미, 53, 여, 157.9, 58.3
	
	Person her = new Person("박신우", 20, '여', 164.3, 48.6);
	System.out.println(her);	// com.kh.example.person.model.vo.Person@783e6358
//	1. Person객체의 주소를 stack영역 her에 담고 있음
//	2. her을 출력하면 객체에 대한 주소가 당연히 출력됨
//	3. her.personInfo()를 하여 클래스 안에 personInfo()메소드로 접근을 하면
//	       리턴하고 있는 String값을 출력
	System.out.println(her.personInfo());	// 박신우, 20, 여, 164.3, 48.6
	}
	
	public void method2() {
//	선언과 동시에 할당 및 초기화
		Person[] pArr = {new Person("강건강", 20, '남', 175.8, 66.9),
						 new Person("남나눔", 34, '남', 179.5, 96.1),
						 new Person("도대담", 14, '남', 190.0, 77.3),
						 new Person("류라라", 27, '여', 161.4, 56.8),
						 new Person("문미미", 53, '여', 157.9, 58.3)};
		
		for(int i = 0; i < pArr.length;i++) {
			System.out.println(pArr[i].getName() + "님의 정보 : " + pArr[i].personInfo());
//			강건강님의 정보 : 강건강, 20, 남, 175.8, 66.9
//			남나눔님의 정보 : 남나눔, 34, 남, 179.5, 96.1
//			도대담님의 정보 : 도대담, 14, 남, 190.0, 77.3
//			류라라님의 정보 : 류라라, 27, 여, 161.4, 56.8
//			문미미님의 정보 : 문미미, 53, 여, 157.9, 58.3
		}
	}
}

// 객체 배열 안에 값 생성과 출력 과정
// 1. Person[] pArr = new Person[5]; 
// 	  Person객체만 들어갈 수 있는 pArr이라는 공간이 stack에 생기고 heap영역에 객체가 들어가는 5개의 공간이 생성됨
// 2. 생성된 heap영역에 대한 주소값이 pArr에 들어감
// 3. heap영역에는 각 인덱스별로 배열의 주소가 들어가 있고 배열에 값과 메소드가 들어감
// 4. 배열의 크기는 자료형의 크기에 따라 배정이 됨
// 5. 배열 안에 들어 있는 값을 뽑기 위해 Person 클래스 안에 있는 메소드로 접근
// 6. personInfo() 메소드는 String으로 return할 수 있도록 되어 있어서 출력 가능  
