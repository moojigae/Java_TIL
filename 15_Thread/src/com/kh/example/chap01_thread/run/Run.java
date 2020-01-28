package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
//		thread1.run();
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		---------------main end!

//		thread1.start();		// start()는 main()이 끝나도 남아있는 스레드가 있으면 끝나지 않고 스레드가 다 없어졌을 때 종료 됨
//		---------------main end!
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
//		Thread-0 ON...
		
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2); 
//		thread2.start();
		
		
		Thread3 thread3 = new Thread3();
//		thread3.start();
		
//		thread1.start();
//		java.lang.IllegalThreadStateException : 한 번 종료된 스레드는 다시 호출 불가하기 때문에 에러
		
		System.out.println("t1 우선순위 : " + thread1.getPriority()); 	// t1 우선순위 : 5
		System.out.println("t2 우선순위 : " + thread2.getPriority()); 	// t2 우선순위 : 5
		System.out.println("t3 우선순위 : " + thread3.getPriority()); 	// t3 우선순위 : 5

		
		thread1.setPriority(3);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("t1 우선순위 : " + thread1.getPriority()); 	// t1 우선순위 : 3
		System.out.println("t2 우선순위 : " + thread2.getPriority()); 	// t2 우선순위 : 10
		System.out.println("t3 우선순위 : " + thread3.getPriority()); 	// t3 우선순위 : 1
		
		thread1.start();
		thread2.start();
		thread3.start();
//		우선순위를 줘도 pc사양이 좋아져서 눈에 보이게 티가 나지 않음
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
//			자신(main thread)이 하던 작업을 잠시 멈추고 다른 스레드(thread1, thread2, thread3)가 지정된 시간동안 실행되도록 함
//			내가 지금 실행되고 있는 위치로 확인 가능
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------main end!");
	}
}
