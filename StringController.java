package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
//		str1 == str2; 	주소값 비교
//		str1.equals(str2);	안에 값 비교
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2)); // str1과 str2의 주소는 같은가? : true
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3)); // str1과 str3의 주소는 같은가? : false
		
//		hashCode 주소값 반환
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
//		str1의 hashCode : 3254818
//		str2의 hashCode : 3254818
//		str3의 hashCode : 3254818
//		hashCode로는 연산된 값이 나오기 때문에 실제 주소를 볼 수가 없음
		
//		System.identityHashCode 역시 실 주소값은 아니고 연산된 값임
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
//		str1의 실주소값 : 366712642
//		str2의 실주소값 : 366712642
//		str3의 실주소값 : 1829164700
		
//		str1과 str2의 주소값이 같은 이유
//		String의 값은 Heap영역에 String pool(=Literal pool = Constant pool)이라는
//		공간이 따로 있는데 그 곳에 String의 값만 따로 들어가고 그 곳의 주소를 참조함 
//		같은 값이 들어오면 그 곳의 주소를 동일하게 참조하기 때문에 둘의 주소가 같음
		
//		str1과 str3의 주소값이 다른 이유
//		new String을 통해 객체가 생성되어 Heap영역에 공간이 생기고 그 곳에 값이 들어간 것이기 때문에 주소 다름
		
//		배열에 String이 들어간 경우
//		String pool영역에 String값이 들어가고 그 주소를 배열 안에서 참조하여 사용함
		
//		str2에 String추가해서 주소값 바뀌는 것 확인
		str2 += "oracle";
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2)); 		//	str1과 str2의 주소는 같은가? : false
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
//		str1의 실주소값 : 366712642
//		str2의 실주소값 : 2018699554
//		str3의 실주소값 : 1829164700
	}
	
	public void method2() {
//		StringBuffer Test
//		계속해서 값을 변경해야 할 때 String같은 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에 가비지 콜렉터가 계속 지워야하는 단점이 있음(불변이라는 특징 때문)
//		변경이 적고 읽기만 하는 경우에는 불변 클래스인 String 클래스가 용이하겠지만,
//		변경해야하는 값이 많은 경우 StringBuffer나 StringBulider로 하는게 더 효율적임
//		StringBuffer나 StringBulider 둘이 사용하는 메소드는 크게 다르지 않음
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 Buffer1의 수용량 : " + buffer1.capacity()); // 초기 Buffer1의 수용량 : 16
		System.out.println("buffer1 에 들어있는 실제 값의 길이 : " + buffer1.length()); // buffer1 에 들어있는 실제 값의 길이 : 0
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity()); // 초기 buffer2의 수용량 : 100
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length()); // buffer2에 들어있는 실제 값의 길이 : 0
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity()); // 초기 buffer3의 수용량 : 19 <- 기본 수용량 16에 3이 더해진 값 출력
		System.out.println("buffer3에 들어있는 실제 값의 길이 : " + buffer3.length()); // buffer3에 들어있는 실제 값의 길이 : 3
		
		System.out.println();
		
//		StringBuilder 사용해보기
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("초기 builder의 수용량 : " + builder.capacity()); // 초기 builder의 수용량 : 19
		System.out.println("builder에 들어있는 실제 값의 길이 : " + builder.length()); // builder에 들어있는 실제 값의 길이 : 3
		
		
//		append() : 매개변수로 받은 문자를 뒤에 추가함
//		builder.append("abc");
//		System.out.println("abc 추가 후의 builder : " + builder); // abc 추가 후의 builder : abcabc
//		System.out.println("abc 추가 후의 builder 용량 : " + builder.capacity()); // abc 추가 후의 builder 용량 : 19
//		System.out.println("abc 추가 후의 builder 길이 : " + builder.length()); // abc 추가 후의 builder 길이 : 6
//		
//		System.out.println();
//		builder.append("def");
//		System.out.println("def 추가 후의 builder : " + builder); // def 추가 후의 builder : abcabcdef
//		System.out.println("def 추가 후의 builder 용량 : " + builder.capacity()); // def 추가 후의 builder 용량 : 19
//		System.out.println("def 추가 후의 builder 길이 : " + builder.length()); // def 추가 후의 builder 길이 : 9
		builder.append("abc").append("def"); 
//		---------------------> StringBuilder가 반환값이기 때문에 .append()가능
//		메소드().메소드() => 메소드 체이닝
//		메소드 전에 반환값에 따라 그 반환값에 있는 메소드를 사용 가능 기본 자료형에는 메소드가 없기 때문에 체이닝 일어나지 않음
//		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------
//		 StringBuilder 반환값
//		--------------------------------
//				String 반환값
		System.out.println("abc, def 추가 후의 builder : " + builder); // abc, def 추가 후의 builder : abcabcdef
		System.out.println("abc, def 추가 후의 builder 용량 : " + builder.capacity()); // abc, def 추가 후의 builder 용량 : 19
		System.out.println("abc, def 추가 후의 builder 길이 : " + builder.length()); // abc, def 추가 후의 builder 길이 : 9
		
		System.out.println();
		
//		insert(index, "추가할 문자") : 지정한 인덱스부터 추가할 문자를 넣음
		builder.insert(2, "zzz");
		System.out.println("인덱스2에 zzz 추가 후의 builder : " + builder); // 인덱스2에 zzz 추가 후의 builder : abzzzcabcdef
		
		System.out.println();
		
//		delete(index, index) : 지정한 index부터 index 전까지 문자 삭제
		builder.delete(2, 5); // start <== 인덱스 < end(java에서는 인덱스 범위 지정할 때 처음은 포함하고 마지막은 포함 안함)
		System.out.println("인덱스 2부터 5까지 삭제 후의 builder : " + builder); // 인덱스 2부터 5까지 삭제 후의 builder : abcabcdef
		
		System.out.println();
		
//		reverse() : 문자열 거꾸로 바꿔줌
		builder.reverse();
		System.out.println("reverse 후의 builder : " + builder); // reverse 후의 builder : fedcbacba
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		System.out.println(sb); //zcyyba
	} 
	
	public void method3() {
		String str = "Hello World";
		
//		1. charAt(int index) : char
//			String의 index번째  char 반환
		char ch = str.charAt(4);
		System.out.println(ch); // o
		
//		2. concat(String str): String
//		매개변수로 들어온 값을 원래 String의 끝에 이어붙인 값(String)을 반환
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr); 
//		concatStr : Hello World!!!
		str += "!!!";
		System.out.println(str); // Hello World!!!
		
//		3. contentEquals() : boolean
		System.out.println("concat.equals(str) : " + concatStr.contentEquals(str)); // concat.equals(str) : true
		
//		4. substring(int beginIndex) : String
//			substring(int beginIndex, int endIndex): String
//		String의 일부를 반환 - 매개변수가 하나면, 그 인덱스부터 끝까지 반환
//						    매개변수가 두개면, 시작 인덱스 <= 문자 < 끝 인덱스(끝 인덱스는 포함 안함)
		System.out.println("str.substring(6) : " + str.substring(6)); // str.substring(6) : World!!!
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5)); // str.substring(0, 5) : Hello
		
//		5. replace(char oldChar, char newChar): String
//		지정 char를 새로운 char로 대체하여 반환
		System.out.println("str.replace('e', 'E') : " + str.replace('e', 'E')); 
//		str.replace('e', 'E') : HEllo World!!!
		
//		6. toUpperCase()/toLowerCase(): String
//			모든 대문자로 혹은 소문자로 바꿔 반환
		System.out.println("str.toUpperCase() : " + str.toUpperCase()); 
//		str.toUpperCase() : HELLO WORLD!!!
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
//		str.toLowerCase() : hello world!!!
		
//		7. equalsIgnoreCase() : boolean
//		대소문자 구분하지 않고 비교하여 단어만 같으면 true 반환
		String str2 = "Wonderful";
		String str3 = "WonderFul";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
//		str2.equals(str3) : false
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
//		str2.equalsIgnoreCase(str3) : true
		
//		8. trim() : String
//		앞/뒤에 있는 공백(빈 공간)을 제거한 문자열 반환
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "     Ja  va     ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim()); 
//		     Java| str4.trim() : Java
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
//		Java     | str5.trim() : Java
		System.out.println(str6 + "| str5.trim() : " + str6.trim());
//	     Ja  va     | str5.trim() : Ja  va -> 글자가 나오면 글자에 있는 공백은 무시
		
//		9. split(String str) : String[]
//		문자열을 분리하여 배열에 담아 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", ");
		System.out.println("분리된 문자열 개수(split) : " + splitArr.length);
//		분리된 문자열 개수(split) : 6
//		for(int i = 0; i < splitArr.length; i++) {
//			System.out.println(splitArr[i]);
//			Java
//			Oracle
//			JDBC
//			Front
//			Server
//			Framwork
//		}
		
//		향상된 for문(for-each문) : 돌릴 대상과 담을 변수만 필요
		for(String s : splitArr) { // for문은 지정을 안해줘도 처음부터 끝까지 돔
//					   --------> 돌리고 싶은 대상(배열만 들어가는 것은 아니고 콜렉션도 들어감)
//			담겨있는 String값을 s에 임시로 담고 실행구문 실행하므로 출력을 반복 
			System.out.println(s);
//			Java
//			Oracle
//			JDBC
//			Front
//			Server
//			Framwork
		}
	}
	public void method4() {
//		StringTokenizer 클래스
		String str = "Java, Oracle, JDBC, Front, Server, FramWork";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + stObj.countTokens()); // 6
		
		while(stObj.hasMoreTokens()) { // 토큰이 있는지 확인 있으면 안으로 들어감
			System.out.println(stObj.nextToken()); // 있다고 했던 토큰을 다 꺼냄
		}
		System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens()); // 값을 꺼낸 후의 문자열 개수 : 0 / 위에서 다 꺼내졌기 때문에 결과값 0
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*,Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("분리된 문자열 개수 : " + stObj2.countTokens()); // 분리된 문자열 개수 : 6
		
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
//			Apple
//			Banana
//			Cream
//			Dessert
//			Egg
//			Fruits
		}
		
//		split()과 StringTokenizer의 차이점
//		1. 분리한 문자열을 String[]로 처리하고 싶을 때 split()
//		   분리한 문자열을 객체로 처리하고 싶을 때 StringTokenizer클래스
//		2. split() 메소드의 구분자는 1개
//		   StringTokenizer클래스의 구분자는 여러개 가능
	}
}

