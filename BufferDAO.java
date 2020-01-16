package com.kh.example.chap03_assist.part01_buffer.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDAO {
	public void output() {
		try(FileWriter fw = new FileWriter("c_buffer.txt");BufferedWriter bw = new BufferedWriter(fw)) { // FileWriter : 문자기반이면서 출력
//			이 자체로도 데이터를 출력(저장)할 수 있음 ; /보조 스트림 적용 시 보조 스트림이 기반 스트림을 감싸줘야하기 때문에 기반을 먼저 만들고 보조로 감싸줌 / 매개변수로 기반 스트림 받아옴 
//			하지만 여기에 성능향상을 시키고 싶어서 보조스트림을 달 예정임
//			성능향상과 관련된 보조스트림은 Bufferedxxxx인데
//			종류가 4개
//			1. BufferedInputStream
//			2. BufferedReader
//			3. BufferedOutputStream
//			4. BufferedWriter : 문자기반이면서 출력
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("저리가세요\n");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void input() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
//			밑에 두 줄 한줄로
//			FileReader fr = new FileReader("c_buffer.txt")
//			BufferedReader br = new BufferedReader(fr);
			
			String value;
			while((value = br.readLine()) != null ){
			System.out.println(value);
			}			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		  catch(IOException e) {
			e.printStackTrace();
		}
	}
}
