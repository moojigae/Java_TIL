package com.kh.example.chap04_io.run;

import com.kh.example.chap04_io.model.controller.ServerController;

public class ServerRun {
	public static void main(String[] args) {
		new ServerController().startServer();
	}
}

//클라이언트 요청을 기다리는 중..
//192.168.10.157가 보낸 메세지 : 박신우 20
//192.168.10.157가 보낸 메세지 : 강건강 30
//192.168.10.157가 보낸 메세지 : 남나눔 25
