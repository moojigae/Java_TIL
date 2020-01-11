package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
//	 얕은 복사 : 배열의 주소만 복사, 데이터 공유
//	 깊은 복사 : 동일한 새로운 배열을 생성하여 실제 내부 값만 복사하여 따로 운용
//	 1) for문을 이용한 1:1 복사
//	 2) system.arraycopy() 를 이용한 복사
//	 3) Arrays.copyOf() 이용한 복사
//	 4) clone() 이용한 복사 	<- 사용을 권장하지 않음 
	
	public void method1() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr; // 얕은 복사
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); // 1 2 3 4 5 
		}
		System.out.println();
		for(int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");   // 1 2 3 4 5 
		}
		System.out.println();
		// 원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 	// 99 2 3 4 5
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");	// 99 2 3 4 5
		}
		System.out.println();
		
		System.out.println("originArr의 주소 값 : " + originArr); 	// originArr의 주소 값 : [I@15db9742
		System.out.println("copyArr의 주소 값 : " + copyArr);		// copyArr의 주소 값 : [I@15db9742
	}

	public void method2() {
		// 깊은 복사 1. for문 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		for(int i=0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];	// copyArr에 값 originArr 넣어
		}
		for(int i=0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " ");	// 1 2 3 4 5 
		}
		System.out.println();
		for(int i=0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");	// 1 2 3 4 5 
		}
		System.out.println();
		
		System.out.println("==== originArr의 0번째 인덱스를 99로 변경 ====");
		originArr[0] = 99;
		
		for(int i=0; i<originArr.length;i++) {
			System.out.print(originArr[i] + " ");	// 99 2 3 4 5 
		}
		System.out.println();
		for(int i=0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");	// 1 2 3 4 5 
		}
		System.out.println();
	}
	
	public void method3() {
		//깊은복사2: arraycopy() 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
//				    원본배열시작위치  복사배열시작위치
//		System.arraycopy(src, srcPos, dest, destPos, length);
//				원본 배열	   복사 배열	  복사 길이
//		originArr 배열의 모든 데이터를 copyArr배열에 복사를 하는데 
//		copyArr의 3번째 인덱스에서부터 붙여넣고 싶음
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");	// 1 2 3 4 5 
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");	// 0 0 0 1 2 3 4 5 0 0 
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");	// 99 2 3 4 5  
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");	// 0 0 0 1 2 3 4 5 0 0 
		}
		System.out.println();
	}
	
	public void method4() {
		// 깊은 복사 3. Arrays.copyOf() 이용
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("==== 처음 값 ====");
		for(int i = 0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " " );	// 1 2 3 4 5 
		}
		System.out.println();
		for (int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");	// 0 0 0 0 0 0 0 0 0 0   int의 기본값 0으로 초기화 되어 있음
		}
		System.out.println();
		
		System.out.println("==== copyOf()로 복사 후 ====");
//		Arrays.copyOf(original, newLength)
//			      원본 배열    복사할 길이
		
		copyArr = Arrays.copyOf(originArr, originArr.length);
		// Arrays 클래스는 배열을 사용할 때 편리한 메소드들을 모아 놓음
		// collections 콜렉션을 사용할 때 유용한 메소드들을 모아 놓은 클래스
		
		for(int i = 0; i < originArr.length;i++) {
			System.out.print(originArr[i] + " " );		// 1 2 3 4 5
		}
		System.out.println();
		for (int i = 0; i < copyArr.length;i++) {
			System.out.print(copyArr[i] + " ");		// 1 2 3 4 5
		}
		System.out.println();
	}
}
