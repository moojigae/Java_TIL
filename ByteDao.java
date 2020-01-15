package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDao {
	public void fileOpen() {
		try {
			FileInputStream fis = new FileInputStream("a_byte.txt");
//			a_byte.txt 파일을 대상으로 객체 생성
					
//			쓰여진 값을 열어보기
//			while(fis.read() != -1) {	// 
//			read() 메소드는 더 이상 읽어들일 값이 없으면 -1을 반환 그래서 조건식에 -1이 아니면이 들어옴 
//				System.out.print((char)fis.read() + " ");
//			}
//			위의 while문의 조건으로 돌면 fis.read()에서 처음 값을 읽고 while문 안으로 들어옴
//			while문 안에선 그 다음값이 되므로 b가 찍힘 다시 while문으로 올라가고 while에선 c를 읽고 
//			안으로 들어가서 d를 읽음 위의 작업을 반복하므로 원하는 값이 출력이 안됨
			
			int value; // 조건식에서 돌 때 값을 담아 놓을 변수
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
//		catch문은 여러개 올 수 있고 올 때는 다형성 고려한 부모가 밑으로 간 순서로 작성해야 함. Exception하나로 에러 다 잡을 수도 있음
		} catch(FileNotFoundException e) {		 
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileSave() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt");
//			값을 덮어써서 a_byte.txt의 결과 값이 abcdefgcde로만 나옴 
//			fos = new FileOutputStream("a_byte.txt",true); 매개변수 뒤에 true가 오면
//			a_byte.txt의 결과 값이 abcdefgcdeabcdefgcdeabcdefgcde 이어 쓰여서 나옴 
			
//			write(int b):void
			fos.write(97);		// a
			
//			write(byte[] b):void
			byte[] bArr = {98,99,100,101,102,103};	// b c d e f g
			
			fos.write(bArr);
			
//			write(byte[] b, int off, int len):void
			fos.write(bArr, 1, 3);
//			1 index부터 3개 :cde
			
		}  catch(FileNotFoundException e) {
			e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();		// 스트림 닫기
//				IOException 발생 가능하고 스트림은 무조건 닫아줘야 하기 때문에 상위 try문에는 넣을 수 없음
//				fos.write(97);에서 에러가 발생하면 밑에 코드는 실행이 안되기 때문에 에러가 발생해도 무조건
//				닫아주기 위해 finally에 넣어주고 에러가 발생할 수 있는 fos.close(); 코드는 finally 안에서 처리  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}














