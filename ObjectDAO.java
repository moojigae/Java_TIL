package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
//		Member 객체배열 3개짜리 만들기
//		user01 pass01 홍길동 hong777@kh.org 25 '남' 1250.7
//		user02 pass02 유관순 you31@kh.org 17 '여' 1221.6
//		user03 pass03 이순신 lee888@kh.org 22 '남' 1234.6
		
		Member[] mArr = new Member[3];
		mArr[0] = new Member("user01", "pass01", "홍길동", "hong777@kh.org",25,'남',1250.7); 
		mArr[1] = new Member("user02", "pass02", "유관순", "you31@kh.org",17,'여',1221.6); 
		mArr[2] = new Member("user03", "pass03", "이순신", "lee888@kh.org",22,'남',1234.7); 
	
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object_member.txt"));){
		
		for(int i = 0; i < mArr.length;i++) {
			oos.writeObject(mArr[i]); // ObjectOutputStream의 writeObject 메소드/ 스트림으부터 객체로 쓰여질 때 사용 됨
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
	
	public void fileOpen() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object_member.txt"));){
		
			Member[] mar = new Member[3];
			
			for(int i = 0; i < mar.length;i++) {
				mar[i] = (Member)ois.readObject(); // 객체로 되어 있는 데이터를 Member형으로 형변환 / readObject() : 스트림으로부터 객체의 값을 읽어들이는 메소드 
			}
			
			for(Member m : mar) {
				System.out.println(m); // 값 출력
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//	user01 null 홍길동 hong777@kh.org 25 남 1250.7
//	user02 null 유관순 you31@kh.org 17 여 1221.6
//	user03 null 이순신 lee888@kh.org 22 남 1234.7
}

//흐름 이해하기 
//1. 입력인지 출력인지 먼저 정함
//2. 어떤 것에 대한 것을 입력이나 출력할 것인지 대상을 정함
//3. 파일인경우 파일에 대한 스트림으로 진행
//4. 파일안에 객체가 들어 있는 경우 기반 스트림으로는 객체를 입출력 할 수 없기 때문에 객체를 입력이나 출력할 수 있는 보조 스트림 필요하기 때문에 사용할 수 있는 종류 확인 후 사용