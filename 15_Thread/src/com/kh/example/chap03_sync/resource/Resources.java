package com.kh.example.chap03_sync.resource;

public class Resources {
//	�����ڿ��� �����ϴ� Ŭ����
	private int data;
	private boolean empty = true; // data�� ���� ���� �� true
	
	public synchronized void getData() {
		while(empty) {	// data �ʵ忡 ���� ���ٸ�
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		System.out.println("�Һ��� : " + data + "�� ��ǰ�� �Һ��Ͽ����ϴ�.");
		notify();
//		����ȭ�� ���� �ȿ��� ȣ���� ��ü ���ο� ������� ��� �����带 ����. ������ lock�� �ϳ��� �����常 ���� �� ����
	}
	
	public synchronized void setData(int data) {
		while(!empty) {	//data�ʵ忡 ���� �ִٸ�
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		empty = false;
		System.out.println("������ : " + data + "��ǰ�� �����Ͽ����ϴ�.");
		notify();
	}
}