package com.kh.example.chap04_io.model.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
//		1. 클라이언트와 통신 할 서버 포트번호 생성
		int port = 8500;
//		2. 서버 소켓 객체 생성
		try {
			ServerSocket server = new ServerSocket(port);
//			3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			System.out.println("클라이언트 요청을 기다리는 중..");
//			4. 요청이 오면 accept()로 요청 수락 후 클라이언트용 Socket 생성
			Socket client = server.accept();
			
//			5. 입출력 스트림 생성
//			6. 보조스트림을 통한 성능 향상
			InputStream in = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(in);
			
//			7. 읽고 쓰기
			Person message = null;
			while(true) {
				message = (Person)ois.readObject();
				
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메세지 : " + message);
				} else {
					break;
				}
			}
//			8. 통신 종료
			ois.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
