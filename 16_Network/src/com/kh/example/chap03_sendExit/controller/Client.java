package com.kh.example.chap03_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
//		1. 서버의 포트번호와 IP주소를 매개변수로 해서 클라이언트용 소켓 객체 생성
		int port = 8500;
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port); 	// 연결 실패 시 null 반환
			
			if(socket != null) {
//			2. 입출력 스트림 생성
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
//				3. 보조 스트림으로 성능 개성
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do {
//					4. 읽고 쓰고
					System.out.println("대화 입력 : ");
					String message = sc.nextLine();
					
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
					String receiveMessage = br.readLine();
					System.out.println(receiveMessage);
					
				}while(true);
				
//				5.통신 종료
				br.close();
				pw.close();
				socket.close();
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
