package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1);
//		com.kh.example.chap05_constructor.model.vo.User@2ed94a8b
//		u1에 User객체에 대한 주소값 담김
//		The constructor User() is undefined
//		매개변수 있는 생성자를 만든 상태에서 기본 생성자를 지웠을 때 나타나는 에러
		u1.inform();
		
		User u2 = new User("id입니다", "pwd입니다");
//		매개변수 id와 pwd에 값 넣기
		u2.inform();
		
		User u3 = new User("id입니다","pwd입니다","이름입니다");
		u3.inform();
		
		
	}
}
