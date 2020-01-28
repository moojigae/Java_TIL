package com.kh.example.chap02_control.tread;

public class Thread4 implements Runnable{
	@Override
	public void run() {
		int count = 0;
		
//		count�� 10 �̸��̸鼭, ���� �������� interrupted�� false�� ��� ����
//		isInterrupted() interrupted ���¸� true ��ȯ
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
//		currentThread() ���� ����ǰ� �ִ� ������/ ���� ����ǰ� �ִ� �����尡 interrupted ��Ȳ�̸� true ��ȯ
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {
//				InterruptedException �߻� �� �Ͻ������� ���	
//				sleep���� ������ �Ͼ�� �ϴ� �۾��� �ݺ��ϴ� interrupt�� �߻��ؼ� 1�ʿ� ī��Ʈ ���ᰡ ��
//				InterruptedException�� �߻��ص� isInterrupted()�� �ٽ� false�� �ʱ�ȭ ��Ű�� ������ 
//				while���� ������ �¾Ƽ� �ʰ� ��� ��� ��
//				catch�� �ȿ� InterruptedException�� �߻���Ű�� isInterrupted�� true�� ����� ��
				System.out.println(count + "�ʿ� ī��Ʈ ����");
				Thread.currentThread().interrupt();
//				catch�� �ȿ��� InterruptedException �߻���Ű��
			}
		}
	}
}

//InterruptedException�� catch�ȿ��� �߻���Ű�� �ʾ��� �� ��µǴ� ����
//���� �Է��ϸ� isInterrupted() : true / 1�ʿ� ī��Ʈ ���� �� �ʰ� �� ��µ��� �ʾƾ� ������ ��� ��µ�
//�ƹ� ���̳� �Է��ϼ��� : 1��
//5
//�Է��� �� : 5
//isInterrupted() : true
//1�ʿ� ī��Ʈ ����
//2��
//3��
//4��
//5��
//6��
//7��
//8��
//9��
//10��

