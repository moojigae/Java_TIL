package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p = new Parent();
//		ㄴ부모타입 레퍼런스	ㄴ부모 객체
		p.printParent(); 	// 나 부모야
		
		System.out.println();
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
//		ㄴ 자식타입 레퍼런스    ㄴ 자식 객체
		c1.printChild1();		// 나 첫 번째 자식이야
		c1.printParent(); 		// 나 부모야 / 상속받고 있어서 호출 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2(); // 다형성 업 캐스팅
//		Parent p3 = new Child1(); // 다형성
		
		p2.printParent(); // 나 부모야
//		p2 print를 할 때 자식의 메소드는 안보이고 부모의 메소드만 보이는 이유
//		heap 영역에 child2 객체에 대한 영역이 생기고 그 안에 int n(Child2에서 선언한 필드), child2의 method, 
//		부모의 int x, int y(필드)와 parent의 method가 담기는데 여기서 볼 수 있는 영역은 부모의 영역만 볼 수 있기 때문에 출력시 부모의 메소드만 보임
//		자식객체(Child2)의 메소드도 함께 보고 싶으면 형변환을 해야함
		
		((Child2)p2).printChild2(); // 나 두 번째 자식이야
//		다운 캐스팅
//		Child2의 method도 같이 보고 싶은 경우 (Child2)라는 형변환을 통해 볼 수 있음
		
		System.out.println();
		
//		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우");
//		부모는 자식을 받을 수 있으나 자식은 부모를 받을 수 없으므로 성립될 수 없음
//		Child2 c2 = new Parent();
//		Type mismatch: cannot convert from Parent to Child2
//		stack에 c2라는 이름으로 공간이 생기고 heap영역에 Parent에 대한 객체가 만들어짐
//		자식 객체는 상속을 받았기 때문에 Heap영역에 부모의 멤버와 메소드를 가지고 있음  
//		그러나 Parent는 부모이기 때문에 안에 자식 객체의 멤버와 메소드를 가지고 있지 않기 때문에 형변환을 할 수 있는거 자체가 없음
		
		System.out.println();
		System.out.println("=== 간단 예제 ===");
		System.out.println();
		
//		instanceof 연산자
//		어떤 클래스 형의 주소를 참조하고 있는지 확인하는 연산자 / 결과를 true,false로 반환
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		
		for(int i = 0; i < pArr.length;i++) {
			if(pArr[i] instanceof Child1) { 		// pArr의 인덱스번째가 Child1클래스를 참조하고 있으면
				((Child1)pArr[i]).printChild1();	// pArr[i]를 형변환해서 printChild1()을 실행해라
			} else if(pArr[i] instanceof Child2){	// pArr의 인덱스번째가 Child2클래스를 참조하고 있으면
				((Child2)pArr[i]).printChild2();	// pArr[i]를 형변환해서 printChild2()을 실행해라
			}
		}
//		=== 간단 예제 ===
//
//		나 첫 번째 자식이야
//		나 두 번째 자식이야
//		나 첫 번째 자식이야
//		나 두 번째 자식이야
				
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();
		}
//		동적 바인딩
//		부모가 출력될거 같지만 자식이 출력된 이유
//		오버라이딩을 사용하면 우선권을 가지게 되므로 자식의 메소드가 먼저 실행됨
//		난 첫 번째 자식이야!!!!!!!!
//		나 두 번째 자식이야!!!!!!!!
//		난 첫 번째 자식이야!!!!!!!!
//		나 두 번째 자식이야!!!!!!!!
	}
}

