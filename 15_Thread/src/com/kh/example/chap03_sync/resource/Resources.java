package com.kh.example.chap03_sync.resource;

public class Resources {
//	공유자원을 제공하는 클래스
	private int data;
	private boolean empty = true; // data에 값이 없을 때 true
	
	public synchronized void getData() {
		while(empty) {	// data 필드에 값이 없다면
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		System.out.println("소비자 : " + data + "번 상품을 소비하였습니다.");
		notify();
//		동기화됨 블록 안에서 호출한 객체 내부에 대기중인 모든 스레드를 깨움. 하지만 lock은 하나의 스레드만 얻을 수 있음
	}
	
	public synchronized void setData(int data) {
		while(!empty) {	//data필드에 값이 있다면
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		empty = false;
		System.out.println("생산자 : " + data + "상품을 생산하였습니다.");
		notify();
	}
}
