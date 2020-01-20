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
		
		set.add(new Dog("샤샤",4.0));
		set.add(new Dog("호두",4.5));
		set.add(new Dog("우유",8.1));
		
		System.out.println(set);
//		[우유(8.1kg), 샤샤(4.0kg), 호두(4.5kg)]
		
		set.add(new Dog("샤샤",4.0));			// 주소값으로 비교함
		System.out.println(set);
//		[우유(8.1kg), 샤샤(4.0kg), 호두(4.5kg), 샤샤(4.0kg)]		
//		[우유(8.1kg), 샤샤(4.0kg), 호두(4.5kg)]			// hashcode, equals 적용 후 중복 사라짐
		
//		Set<String> test = new HashSet<String>();		
//		String 자체에는 이미 hashcode나 equals가 오버라이딩 되어 있어서 자동으로 중복값은 출력이 안됨
//		String은 값을 value로 비교를 하고 set은 객체의 주소값을 비교하게 되어 있기 때문에 set은 오버라이딩이 필요함
//		test.add("예시1");
//		test.add("예시2");
//		test.add("예시3");
//		System.out.println(test);		[예시2, 예시3, 예시1]
//		test.add("예시2");
//		System.out.println(test);		[예시2, 예시3, 예시1]
		
		
		Set<Dog> set2 = new LinkedHashSet<Dog>();	// LinkedHashSet : 순서가 유지됨 
		set2.add(new Dog("초코",2.1));
		set2.add(new Dog("콩이",8.3));
		set2.add(new Dog("두부",5.0));
		set2.add(new Dog("초코",2.1));
		System.out.println(set2);		// [초코(2.1kg), 콩이(8.3kg), 두부(5.0kg)]
		
		set2.add(new Dog("로이",6.1));
		set2.add(new Dog("공주",5.2));
		set2.add(new Dog("왕자",9.5));
		set2.add(new Dog("초이",12.5));
		System.out.println(set2);		// [초코(2.1kg), 콩이(8.3kg), 두부(5.0kg), 로이(6.1kg), 공주(5.2kg), 왕자(9.5kg), 초이(12.5kg)]
		
		Set<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
//		Exception in thread "main" java.lang.ClassCastException: com.kh.example.set.model.vo.Dog cannot be cast to java.lang.Comparable
//		TreeSet은 정렬을 해야하기 때문에 기준점이 있어야 하는데 정렬 기준을 몰라서 에러 발생
//		[공주(5.2kg), 두부(5.0kg), 로이(6.1kg), 왕자(9.5kg), 초이(12.5kg), 초코(2.1kg), 콩이(8.3kg)]  compareTo() 메소드 적용 후 출력 값
		
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("초코",6.1));
		set4.add(new Dog("콩이",8.3));
		set4.add(new Dog("두부",5.0));
		set4.add(new Dog("초코",2.1));
		set4.add(new Dog("로이",6.1));		// 몸무게가 같아서 같은 객체로 보고 지워버림. 이름도 같은지 비교해서 동일한 객체인지 비교해 줘야 함
		set4.add(new Dog("공주",5.2));
		set4.add(new Dog("왕자",9.5));
		set4.add(new Dog("초이",12.5));
		System.out.println(set4);
//		[초코(2.1kg), 두부(5.0kg), 공주(5.2kg), 로이(6.1kg), 초코(6.1kg), 콩이(8.3kg), 왕자(9.5kg), 초이(12.5kg)]
		
//		요소 뽑아내기
//		방법 1. Set을 List화 시키기 : addAll() 사용
		List<Dog> list = new ArrayList<Dog>();
		list.addAll(set4);	
		System.out.println(list);
//		[초코(2.1kg), 두부(5.0kg), 공주(5.2kg), 로이(6.1kg), 초코(6.1kg), 콩이(8.3kg), 왕자(9.5kg), 초이(12.5kg)]
		System.out.println(list.get(3));		//	로이(6.1kg)
		
//		방법 2. Iterator 활용하기 : Iterator() 사용
		Iterator<Dog> it = set4.iterator();		// TreeSet에 Dog로 타입 제한을 해놨기 때문에 Iterator도 동일하게 적용 됨
		while(it.hasNext())	{		// 다음 값이 있으면
			System.out.println(it.next()); 		// Dog 제한 값으로 출력 됨
		}
//		초코(2.1kg)
//		두부(5.0kg)
//		공주(5.2kg)
//		로이(6.1kg)
//		초코(6.1kg)
//		콩이(8.3kg)
//		왕자(9.5kg)
//		초이(12.5kg)
		
//		아래의 코드로 실행해도 출력안됨. 일회성 단방향이라 이미 끝에 가 있어서 출력 안됨
		while(it.hasNext()) {
			System.out.println("re : " + it.next());	
		}
	}
}
