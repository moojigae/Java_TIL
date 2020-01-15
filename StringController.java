package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
//		str1 == str2; 	�ּҰ� ��
//		str1.equals(str2);	�ȿ� �� ��
		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2)); // str1�� str2�� �ּҴ� ������? : true
		System.out.println("str1�� str3�� �ּҴ� ������? : " + (str1 == str3)); // str1�� str3�� �ּҴ� ������? : false
		
//		hashCode �ּҰ� ��ȯ
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
//		str1�� hashCode : 3254818
//		str2�� hashCode : 3254818
//		str3�� hashCode : 3254818
//		hashCode�δ� ����� ���� ������ ������ ���� �ּҸ� �� ���� ����
		
//		System.identityHashCode ���� �� �ּҰ��� �ƴϰ� ����� ����
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
//		str1�� ���ּҰ� : 366712642
//		str2�� ���ּҰ� : 366712642
//		str3�� ���ּҰ� : 1829164700
		
//		str1�� str2�� �ּҰ��� ���� ����
//		String�� ���� Heap������ String pool(=Literal pool = Constant pool)�̶��
//		������ ���� �ִµ� �� ���� String�� ���� ���� ���� �� ���� �ּҸ� ������ 
//		���� ���� ������ �� ���� �ּҸ� �����ϰ� �����ϱ� ������ ���� �ּҰ� ����
		
//		str1�� str3�� �ּҰ��� �ٸ� ����
//		new String�� ���� ��ü�� �����Ǿ� Heap������ ������ ����� �� ���� ���� �� ���̱� ������ �ּ� �ٸ�
		
//		�迭�� String�� �� ���
//		String pool������ String���� ���� �� �ּҸ� �迭 �ȿ��� �����Ͽ� �����
		
//		str2�� String�߰��ؼ� �ּҰ� �ٲ�� �� Ȯ��
		str2 += "oracle";
		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2)); 		//	str1�� str2�� �ּҴ� ������? : false
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
//		str1�� ���ּҰ� : 366712642
//		str2�� ���ּҰ� : 2018699554
//		str3�� ���ּҰ� : 1829164700
	}
	
	public void method2() {
//		StringBuffer Test
//		����ؼ� ���� �����ؾ� �� �� String���� ��� ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������ ������ �ݷ��Ͱ� ��� �������ϴ� ������ ����(�Һ��̶�� Ư¡ ����)
//		������ ���� �б⸸ �ϴ� ��쿡�� �Һ� Ŭ������ String Ŭ������ �����ϰ�����,
//		�����ؾ��ϴ� ���� ���� ��� StringBuffer�� StringBulider�� �ϴ°� �� ȿ������
//		StringBuffer�� StringBulider ���� ����ϴ� �޼ҵ�� ũ�� �ٸ��� ����
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� Buffer1�� ���뷮 : " + buffer1.capacity()); // �ʱ� Buffer1�� ���뷮 : 16
		System.out.println("buffer1 �� ����ִ� ���� ���� ���� : " + buffer1.length()); // buffer1 �� ����ִ� ���� ���� ���� : 0
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity()); // �ʱ� buffer2�� ���뷮 : 100
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length()); // buffer2�� ����ִ� ���� ���� ���� : 0
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity()); // �ʱ� buffer3�� ���뷮 : 19 <- �⺻ ���뷮 16�� 3�� ������ �� ���
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length()); // buffer3�� ����ִ� ���� ���� ���� : 3
		
		System.out.println();
		
//		StringBuilder ����غ���
		StringBuilder builder = new StringBuilder("abc");
		System.out.println("�ʱ� builder�� ���뷮 : " + builder.capacity()); // �ʱ� builder�� ���뷮 : 19
		System.out.println("builder�� ����ִ� ���� ���� ���� : " + builder.length()); // builder�� ����ִ� ���� ���� ���� : 3
		
		
//		append() : �Ű������� ���� ���ڸ� �ڿ� �߰���
//		builder.append("abc");
//		System.out.println("abc �߰� ���� builder : " + builder); // abc �߰� ���� builder : abcabc
//		System.out.println("abc �߰� ���� builder �뷮 : " + builder.capacity()); // abc �߰� ���� builder �뷮 : 19
//		System.out.println("abc �߰� ���� builder ���� : " + builder.length()); // abc �߰� ���� builder ���� : 6
//		
//		System.out.println();
//		builder.append("def");
//		System.out.println("def �߰� ���� builder : " + builder); // def �߰� ���� builder : abcabcdef
//		System.out.println("def �߰� ���� builder �뷮 : " + builder.capacity()); // def �߰� ���� builder �뷮 : 19
//		System.out.println("def �߰� ���� builder ���� : " + builder.length()); // def �߰� ���� builder ���� : 9
		builder.append("abc").append("def"); 
//		---------------------> StringBuilder�� ��ȯ���̱� ������ .append()����
//		�޼ҵ�().�޼ҵ�() => �޼ҵ� ü�̴�
//		�޼ҵ� ���� ��ȯ���� ���� �� ��ȯ���� �ִ� �޼ҵ带 ��� ���� �⺻ �ڷ������� �޼ҵ尡 ���� ������ ü�̴� �Ͼ�� ����
//		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------
//		 StringBuilder ��ȯ��
//		--------------------------------
//				String ��ȯ��
		System.out.println("abc, def �߰� ���� builder : " + builder); // abc, def �߰� ���� builder : abcabcdef
		System.out.println("abc, def �߰� ���� builder �뷮 : " + builder.capacity()); // abc, def �߰� ���� builder �뷮 : 19
		System.out.println("abc, def �߰� ���� builder ���� : " + builder.length()); // abc, def �߰� ���� builder ���� : 9
		
		System.out.println();
		
//		insert(index, "�߰��� ����") : ������ �ε������� �߰��� ���ڸ� ����
		builder.insert(2, "zzz");
		System.out.println("�ε���2�� zzz �߰� ���� builder : " + builder); // �ε���2�� zzz �߰� ���� builder : abzzzcabcdef
		
		System.out.println();
		
//		delete(index, index) : ������ index���� index ������ ���� ����
		builder.delete(2, 5); // start <== �ε��� < end(java������ �ε��� ���� ������ �� ó���� �����ϰ� �������� ���� ����)
		System.out.println("�ε��� 2���� 5���� ���� ���� builder : " + builder); // �ε��� 2���� 5���� ���� ���� builder : abcabcdef
		
		System.out.println();
		
//		reverse() : ���ڿ� �Ųٷ� �ٲ���
		builder.reverse();
		System.out.println("reverse ���� builder : " + builder); // reverse ���� builder : fedcbacba
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		System.out.println(sb); //zcyyba
	} 
	
	public void method3() {
		String str = "Hello World";
		
//		1. charAt(int index) : char
//			String�� index��°  char ��ȯ
		char ch = str.charAt(4);
		System.out.println(ch); // o
		
//		2. concat(String str): String
//		�Ű������� ���� ���� ���� String�� ���� �̾���� ��(String)�� ��ȯ
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr); 
//		concatStr : Hello World!!!
		str += "!!!";
		System.out.println(str); // Hello World!!!
		
//		3. contentEquals() : boolean
		System.out.println("concat.equals(str) : " + concatStr.contentEquals(str)); // concat.equals(str) : true
		
//		4. substring(int beginIndex) : String
//			substring(int beginIndex, int endIndex): String
//		String�� �Ϻθ� ��ȯ - �Ű������� �ϳ���, �� �ε������� ������ ��ȯ
//						    �Ű������� �ΰ���, ���� �ε��� <= ���� < �� �ε���(�� �ε����� ���� ����)
		System.out.println("str.substring(6) : " + str.substring(6)); // str.substring(6) : World!!!
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5)); // str.substring(0, 5) : Hello
		
//		5. replace(char oldChar, char newChar): String
//		���� char�� ���ο� char�� ��ü�Ͽ� ��ȯ
		System.out.println("str.replace('e', 'E') : " + str.replace('e', 'E')); 
//		str.replace('e', 'E') : HEllo World!!!
		
//		6. toUpperCase()/toLowerCase(): String
//			��� �빮�ڷ� Ȥ�� �ҹ��ڷ� �ٲ� ��ȯ
		System.out.println("str.toUpperCase() : " + str.toUpperCase()); 
//		str.toUpperCase() : HELLO WORLD!!!
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
//		str.toLowerCase() : hello world!!!
		
//		7. equalsIgnoreCase() : boolean
//		��ҹ��� �������� �ʰ� ���Ͽ� �ܾ ������ true ��ȯ
		String str2 = "Wonderful";
		String str3 = "WonderFul";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
//		str2.equals(str3) : false
		System.out.println("str2.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
//		str2.equalsIgnoreCase(str3) : true
		
//		8. trim() : String
//		��/�ڿ� �ִ� ����(�� ����)�� ������ ���ڿ� ��ȯ
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "     Ja  va     ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim()); 
//		     Java| str4.trim() : Java
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
//		Java     | str5.trim() : Java
		System.out.println(str6 + "| str5.trim() : " + str6.trim());
//	     Ja  va     | str5.trim() : Ja  va -> ���ڰ� ������ ���ڿ� �ִ� ������ ����
		
//		9. split(String str) : String[]
//		���ڿ��� �и��Ͽ� �迭�� ��� ��ȯ
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framwork";
		String[] splitArr = splitStr.split(", ");
		System.out.println("�и��� ���ڿ� ����(split) : " + splitArr.length);
//		�и��� ���ڿ� ����(split) : 6
//		for(int i = 0; i < splitArr.length; i++) {
//			System.out.println(splitArr[i]);
//			Java
//			Oracle
//			JDBC
//			Front
//			Server
//			Framwork
//		}
		
//		���� for��(for-each��) : ���� ���� ���� ������ �ʿ�
		for(String s : splitArr) { // for���� ������ �����൵ ó������ ������ ��
//					   --------> ������ ���� ���(�迭�� ���� ���� �ƴϰ� �ݷ��ǵ� ��)
//			����ִ� String���� s�� �ӽ÷� ��� ���౸�� �����ϹǷ� ����� �ݺ� 
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
//		StringTokenizer Ŭ����
		String str = "Java, Oracle, JDBC, Front, Server, FramWork";
		StringTokenizer stObj = new StringTokenizer(str, ", ");
		System.out.println("�и��� ���ڿ� ���� : " + stObj.countTokens()); // 6
		
		while(stObj.hasMoreTokens()) { // ��ū�� �ִ��� Ȯ�� ������ ������ ��
			System.out.println(stObj.nextToken()); // �ִٰ� �ߴ� ��ū�� �� ����
		}
		System.out.println("���� ���� ���� ���ڿ� ���� : " + stObj.countTokens()); // ���� ���� ���� ���ڿ� ���� : 0 / ������ �� �������� ������ ����� 0
		
		System.out.println();
		
		String str2 = "Apple,Banana-Cream*,Dessert#Egg Fruits";
		StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		System.out.println("�и��� ���ڿ� ���� : " + stObj2.countTokens()); // �и��� ���ڿ� ���� : 6
		
		while(stObj2.hasMoreTokens()) {
			System.out.println(stObj2.nextToken());
//			Apple
//			Banana
//			Cream
//			Dessert
//			Egg
//			Fruits
		}
		
//		split()�� StringTokenizer�� ������
//		1. �и��� ���ڿ��� String[]�� ó���ϰ� ���� �� split()
//		   �и��� ���ڿ��� ��ü�� ó���ϰ� ���� �� StringTokenizerŬ����
//		2. split() �޼ҵ��� �����ڴ� 1��
//		   StringTokenizerŬ������ �����ڴ� ������ ����
	}
}

