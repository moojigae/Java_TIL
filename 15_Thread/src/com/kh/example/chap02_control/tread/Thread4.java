package com.kh.example.chap02_control.tread;

public class Thread4 implements Runnable{
	@Override
	public void run() {
		int count = 0;
		
//		count가 10 미만이면서, 현재 스레드의 interrupted가 false인 경우 진행
//		isInterrupted() interrupted 상태면 true 반환
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
//		currentThread() 현재 실행되고 있는 스레드/ 현재 실행되고 있는 스레드가 interrupted 상황이면 true 반환
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {
//				InterruptedException 발생 시 일시정지를 벗어남	
//				sleep에서 잠들었다 일어났다 하는 작업을 반복하다 interrupt가 발생해서 1초에 카운트 종료가 뜸
//				InterruptedException은 발생해도 isInterrupted()를 다시 false로 초기화 시키기 때문에 
//				while문의 조건이 맞아서 초가 계속 출력 됨
//				catch문 안에 InterruptedException을 발생시키면 isInterrupted를 true로 만들면 됨
				System.out.println(count + "초에 카운트 종료");
				Thread.currentThread().interrupt();
//				catch문 안에서 InterruptedException 발생시키기
			}
		}
	}
}

//InterruptedException을 catch안에서 발생시키지 않았을 때 출력되는 상태
//값을 입력하면 isInterrupted() : true / 1초에 카운트 종료 후 초가 더 출력되지 않아야 하지만 계속 출력됨
//아무 값이나 입력하세요 : 1초
//5
//입력한 값 : 5
//isInterrupted() : true
//1초에 카운트 종료
//2초
//3초
//4초
//5초
//6초
//7초
//8초
//9초
//10초

