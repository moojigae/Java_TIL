package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		1. 컬렉션 장점 1. 크기의 제약이 없다 
//		크기를 지정하던 안하던 안에 값이 늘어나면 자동으로 늘어남
		List list1 = new ArrayList(); // 초기 용량 10
		
		List<Student> list = new ArrayList<Student>(3); // ()안에 값을 넣어줘서 용량이 3이 됨
// 		뒤에 <>는  안에 Student생략 가능하나 버전이 낮은 java에서는 적용이 안될 수 있으므로 같이 써주는게 좋다
		
//		add(E e) : 리스트 끝에 데이터 e 추가
		list.add(new Student("테스트", 0));
		list.add(new Student("도대남", 60));
		
		System.out.println("list : " + list); 
//		list : [테스트(0점), 도대남(60점)]
		
		list.add(new Student("남나눔", 90));
		list.add(new Student("하현호", 85));
		
		System.out.println("현재 list에 담김 element 개수 : " + list.size());
		System.out.println("list : " + list);
//		현재 list에 담김 element 개수 : 4
//		list : [테스트(0점), 도대남(60점), 남나눔(90점), 하현호(85점)]
		
		list.add(new Student("문미미", 66));
		System.out.println("현재 list에 담김 element 개수 : " + list.size());
		System.out.println("list : " + list);
//		현재 list에 담김 element 개수 : 5
//		list : [테스트(0점), 도대남(60점), 남나눔(90점), 하현호(85점), 문미미(66점)]
		
		
//		컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리 간단
//		add(int index, E e) : index번째 인덱스에 e 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
//		list : [류라라(100점), 테스트(0점), 도대남(60점), 남나눔(90점), 하현호(85점), 문미미(66점)]
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);
//		list : [류라라(100점), 테스트(0점), 도대남(60점), 강건강(40점), 남나눔(90점), 하현호(85점), 문미미(66점)]
		
//		remove(int index) : 해당 index번째 객체 삭제 / 객체 주소를 통해 삭제
		list.remove(1); // 1번째 인덱스 삭제
		System.out.println("list : " + list);
//		list : [류라라(100점), 도대남(60점), 강건강(40점), 남나눔(90점), 하현호(85점), 문미미(66점)]

//		remove(Object o) : 해당 Object 객체 삭제
		list.remove(new Student("강건강", 40)); 
//		new를 이용해서 생성을 하고 있기 때문에 위에 쓰여진 강건강 40과 주소가 다름. 그래서 삭제가 안됨 
//		Object 클래스 안에 equals()메소드와 hashcode()메소드를 오버라이딩을 통해 재정의해야지만
//		주소값을 비교하는게 아니라 필드값을 비교할 수 있게 해줘서 삭제가 가능
		System.out.println("list : " + list);
//		list : [류라라(100점), 도대남(60점), 강건강(40점), 남나눔(90점), 하현호(85점), 문미미(66점)]
//		equals()메소드와 hashcode()메소드를 오버라이딩을 통해 재정의 후 강건강 삭제됨 
//		list : [류라라(100점), 도대남(60점), 남나눔(90점), 하현호(85점), 문미미(66점)]
		
		
//		정렬 방법 1. Collections 클래스 이용
//		Collections.sort(list); // 무얼 기준으로 정렬을 한건지 정해진게 없음
		Collections.sort(list); // compareTo() 오버라이딩 적용 후 오름차순 정렬 됨
		System.out.println("이름 오름차순 : " + list);
//		이름 오름차순 : [남나눔(90점), 도대남(60점), 류라라(100점), 문미미(66점), 하현호(85점)]
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		
//		System.out.println(strList);
//		[저녁시간, 점심시간, 퇴근시간, 기상시간, 출근시간, 취침시간]
//		Collections.sort(strList);
//		System.out.println(strList); // sort가 가지고 있는 기준을 가지고 오름차순 정렬함
//		[기상시간, 저녁시간, 점심시간, 출근시간, 취침시간, 퇴근시간]
		
		
//		정렬 방법 2. List.sort()메소드 이용
//		1. Collections.sort()는 comparable을 상속받아 comparaTo 메소드 재정의를 통해 정렬 구현(한 개의 정렬)
//		2. 지정한 Comparator 클래스에 의한 정렬(여러 개의 정렬) 두 가지로 가능하다 
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator()); // Comparator에 의한 정렬
		System.out.println("점수 오름차순 : " + list);
//		점수 오름차순 : [도대남(60점), 문미미(66점), 하현호(85점), 박보배(85점), 남나눔(90점), 류라라(100점)]
		
		
//		set(int index, E e) : index번째 인덱스에 있는 요소를 e로 수정
		list.set(2, new Student("도대담", 31));
		System.out.println("list : " + list);
//		list : [도대남(60점), 문미미(66점), 도대담(31점), 하현호(85점), 남나눔(90점), 류라라(100점)]
		
		
//		get(int index) : index번째 인덱스에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s); // 도대담(31점) 값이 빠지거나 하지 않고 가지고만 옴
		System.out.println("list : " + list); 
//		list : [도대남(60점), 문미미(66점), 도대담(31점), 하현호(85점), 남나눔(90점), 류라라(100점)]
		
		
//		subList(int index1, int index2) : index1번째 인덱스로부터 index2번째 인덱스까지 리스트 반환
		System.out.println("list 추출 : " + list.subList(2, 5));
//		list 추출 : [도대담(31점), 하현호(85점), 남나눔(90점)]
		
		
//		contains(Object o) : o가 리스트에 존재한다면 true반환 
//		indexOf(Object o) : o가 리스트에 위치하는 인덱스 번호 반환, 없다면 -1 반환
//		둘을 혼용해서 쓰기 보다는 indexOf를 많이 씀
		System.out.println("남나눔, 90이 있는가? " + list.contains(new Student("남나눔",90)));
		System.out.println("남나눔, 90의 인덱스 위치는? " + list.indexOf(new Student("남나눔",90)));
		System.out.println("테스트, 0의 인덱스 위치는? " + list.indexOf(new Student("테스트",0)));
//		남나눔, 90이 있는가? true
//		남나눔, 90의 인덱스 위치는? 4
//		테스트, 0의 인덱스 위치는? -1
		
		
//		clear() : 저장된 모든 객체 삭제
//		isEmpty() : 리스트가 비었을 때 true 반환
		list.clear();
		System.out.println("list : " + list); 	// list : []
		System.out.println("list가 비었나요? " + list.isEmpty()); // list가 비었나요? true
	}
}
