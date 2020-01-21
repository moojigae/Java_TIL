package com.kh.practice;

public class Test2 {
	public static void main(String[] args) {
		Object[] sarr = new String[4];

		sarr[0] = new String("123");
		sarr[1] = String.valueOf(new Integer(456));
//		sarr[2] = (String)new Object() // 객체는 스트링으로 강제 형변환 할 수 없음
		sarr[2] = (String)new Object().toString(); // new Object() 객체를 생성하면 주소값이 생성되고 그 주소값을 String으로 바꿔주는 메소드는 toString() => java.lang.Object@15db9742 주소값
		sarr[3] = String.valueOf(789);	 // 배열 길이 오버됨. 배열 길이를 3에서 4로 늘려줌

		for (Object obj : sarr) {
			System.out.println(obj);
		}

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
