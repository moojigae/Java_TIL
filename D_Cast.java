package com.kh.variable;

public class D_Cast {
	public void rule1() {
//		boolean flag = true;
//		boolean flag2 = 100; 
		// Type mismatch: cannot convert from int to boolean
		// boolean 타입에는 숫자가 들어갈 수 없기 때문에 에러 발생
		
		int num = 'A'; 
		// A를 넣어도 유니코드 숫자로 들어감
		System.out.println("num: " + num);	// num: 65
		
		char ch = 97; 
		System.out.println("ch: " + ch);	// ch: a
		
//		char ch2 = num;
		// Type mismatch: cannot convert from int to char
		// num은 숫자형이기 때문에 안들어감/ 숫자로 넣을 때는 `리터럴`이기 때문에 값을 보고 치환할 수 있고 
		// 변수로 넣었을 때는 타입의 크기만 볼 수 있고 값을 볼 수 없음
		
		char ch2 = (char)num;
		// int형인 num을 char로 넣기 위해선 강제형변환 필요
		System.out.println("ch2: " + ch2);	// ch2: A
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: " + ch3);	// ch3: ?
		// char형의 범위는 0 ~ 65,535 까지인데 num2에 -97 음수가 들어있기 때문에
		// char의 범위에 속하지 않으므로 값을 찾을 수 없어서 ? 출력됨
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		// Type mismatch: cannot convert from long to int
		// int형에 더 큰 long형을 넣어려고 하니 큰게 작은걸로 들어갈 수 없어서 에러 발생
		
		// iNum + lNum을 int result에 저장할 수 있는 방법
		// 방법1. `수행 결과`를 int로 강제 형변환
		int result = (int)(iNum + lNum); // 110
		
		// 방법2. long형을 int로 강제 형변환
		int result2 = iNum + (int)lNum; // 110
		
		// 번외. 결과값을 저장하는 result를 long형으로 받음(위에 두 방법이 안되었을 떄)
		long result3 = iNum + lNum; // 110
	
	}
	public void rule3() {
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println("bNum: " + bNum); // bNum: 34 : 데이터 손실로 290 출력 안됨
	}
}
