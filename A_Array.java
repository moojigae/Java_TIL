package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
//	 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
//	---------공간만 생성-------
//	 배열 선언 
//	 	자료형[] 배열명;	< 더 많이 사용됨
//		자료형   배열명[];
//	 배열 할당
//	 	자료형[] 배열명   = new 자료형[배열크기];
//		자료형   배열명[] = new 자료형[배열크기];
//		new연산자를 통해 Heap영역에 배열크기만큼 공간 생성
//		공간이 생성되는 순간 그 공간에 대한 주소값이 생김
//		그 주소값은 stack에 있는 배열명 공간에 대입(참조하고 있음)
//	-------------값을 넣음----
//	 배열 초기화
//	 	1) 인덱스 이용
//			배열명[인덱스 번호] = 값;
//		2) for문 이용 : 규칙이 있을 때만 사용 가능
//			for(int i = 0; i < 배열명.length; i++){
//					배열명[i] = 값;
//				}
//		3) 선언과 동시에 초기화
//		 	자료형[] 배열명 = {값};
//			자료형[] 배열명 = new 자료형[] {값};
	
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		sum1 += num6;
		sum1 += num7;
		sum1 += num8;
		sum1 += num9;
		
		int[] arr = new int[9];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100;
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
//		배열 넘쳤을 때 뜸/ 9라고 하는 존재하지 않는 곳에 값을 넣어서 원래 있는 길이보다 넘쳤다고 에러
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10; 
		}
		
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i]; // 450 arr에 들어오는 값을 다 더해라
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " +arr[i]);
		}
	}
	
	public void method2() {
		// 배열은 한 번 지정한 배열의 크기를 변경할 수 없음. 원래 배열의 크기가 바뀌는게 아니고 새로 만들어진 배열로 교체
		// 사용하지 않는 배열은 올드영역으로 이동되어 가비지 콜렉터에 의해 삭제됨(3초마다 실행)
		// 변수가 이미 참조중일 때 참조 중인 값을 지우고 싶을 때는 dArr = null; 
		double[] dArr = new double[10];
		System.out.println("dArr의 주소 : " + dArr); // dArr의 주소 : [D@15db9742 가공처리 된 주소 실제 주소값은 아님
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변경 할 배열 크기 : ");
		int size = sc.nextInt();
		
		dArr = new double[size];
		System.out.println("dArr의 주소 : " + dArr); // dArr의 주소 : [D@28d93b30
		
		// 할당된 배열 지우기
		dArr = null;
		
	}
	public void method3() {
		// 배열 초기화
		// 1. 인덱스를 이용
		// iArr이라는 int형 5개짜리 배열 생성
		int[] iArr = new int[5];
		
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		
		// 2. for문 초기화
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		// 3. 선언과 동시에 초기화
		int[] iArr2 = {1,2,3,4,5};
		int[] iArr3 = new int[]{1,2,3,4,5};
		
	}
}
