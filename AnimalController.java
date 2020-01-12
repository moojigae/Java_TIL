package com.kh.example.animal.controller;

import com.kh.example.animal.mode.vo.Animal;
import com.kh.example.animal.mode.vo.Dog;
import com.kh.example.animal.mode.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("강아지", 9, 6.3);
//		System.out.println(a); 	// 강아지 9 6.3
//		a를 출력하면 대표값이 출력이 되어야 함 /a는 원래 a.toString인데 toString()이 생략이 되어있어서 toString을 사용 안해도 대표값이 출력됨
//		대표값이 주소로 설정이 되어 있었는데 toString()메소드 안에 return값을 넣어줌으로서 해당 값이 대표값으로 바뀌어 출력됨
//		System.out.println(a.toString());	// 강아지 9 6.3	
//		toString이 대표값을 출력하므로 해당 값 정상 출력
//		System.out.println(a.inform()); // 강아지 9 6.3
//		값이 잘 들어갔는지 출력
		
		Dog d = new Dog("태양이", 8, 4.5, 40, "장모");
		System.out.println(d); // 태양이 8 4.5 40.0 장모
		
		Snake s = new Snake("방울", 4, 10.2, "빗살");
		System.out.println(s); // 방울 4 10.2 빗살
	}
}
