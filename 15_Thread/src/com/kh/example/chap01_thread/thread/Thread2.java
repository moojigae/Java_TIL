	package com.kh.example.chap01_thread.thread;
	
//	스레드 생성방법2 : Runnable implements하기
	public class Thread2 implements Runnable {
		
		@Override
		public void run() {
			
			for(int i = 0; i < 10 ;i++) {
				System.out.println(Thread.currentThread().getName() + "ON...");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
