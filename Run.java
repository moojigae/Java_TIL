package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account(); // �ν��Ͻ�ȭ
		
//		���� �ܾ� ��ȸ
		a.displayBalance(); // �ڽſ���� ���¿� �ܾ��� 0���Դϴ�.
		
		a.deposit(1000000); // �ڽſ���� ���¿� 1000000���� �ԱݵǾ����ϴ�.
		a.displayBalance(); // �ڽſ���� ���¿� �ܾ��� 1000000���Դϴ�.
		
		a.deposit(1500000);	// �ڽſ���� ���¿� 1500000���� �ԱݵǾ����ϴ�.
		a.displayBalance(); // �ڽſ���� ���¿� �ܾ��� 2500000���Դϴ�.
		
		a.withdraw(500000); // �ڽſ���� ���¿��� 500000���� ��ݵǾ����ϴ�.
		a.displayBalance(); // �ڽſ���� ���¿� �ܾ��� 2000000���Դϴ�.
		// �Լ�(�޼ҵ�)�� ����
		
//		a.balance -= 2000000;
		// ������ ����
//		The field Account.balance is not visible
//		private�� �� �ڽ�(Account)������ �� �� �ְ� �������ֱ� ������ 
//		�ܺο��� ������ �ʾ� ���� ��
		a.withdraw(500000); // �ڽſ���� ���¿��� 500000���� ��ݵǾ����ϴ�.
		a.displayBalance(); // �ڽſ���� ���¿� �ܾ��� 1500000���Դϴ�.
	}
}
