	package com.kh.example.chap01_thread.thread;
	
//	 ������ ����1: ThreadŬ���� ���
	public class Thread1 extends Thread{
		@Override
		public void run() {
			setName("�Ϳ��� ������");
//			setName() : �̸� �������ִ� �޼ҵ�
			for(int i = 0; i < 10; i++) {
				System.out.println(getName() + " ON...");
//				getName() : ������ �̸� ��ȯ
				
				try {
					Thread.sleep(500);
//					sleep() : �����带 ������Ű�� �޼ҵ�(1000 = 1s)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
