package com.kh.variable;

public class E_PrintMethod {
	// �������� : Ŭ���� �ȿ� ������ �����ϸ� �޼ҵ� �ȿ��� ��� ����
	String str1 = "�ȳ��ϼ���";
	String str2 = "�ݰ����ϴ�";
	public void printExample() {
//		 print �޼ҵ�� ���� ���� ������ ���� ��µ�
		
// 		�������� : �޼ҵ� �ȿ��� ������ ������ ���� �޼ҵ� �ȿ����� ��� ����	

//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�";
		
		System.out.print(str1);
		System.out.print(str2);  // �ȳ��ϼ���ݰ����ϴ�
	}
	public void printlnExample() {
//		println �޼ҵ�� �ڵ����� �ٹٲ����Ͽ� ���
		
//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�";
		
		System.out.println(str1);
		System.out.println(str2);
		// �ȳ��ϼ��� 
		// �ݰ����ϴ�
	}
	public void printfExample() {
//		printf�� ������ �ִ� ���Ŀ� ���� �� ���Ŀ� �´� ��(����)�� �ٹٲ� ���� ���
//		 printf("", ) �⺻ ����
//		 ""�ȿ��� ���� ������ �ۼ�
//		printf ���ĵ�
//		- %d : ������, %o : 8����, %x : 16����
//		- %c : ����, %s : ���ڿ�
//		- %f : �Ǽ�(�Ҽ��� �Ʒ� 6�ڸ�), %e : ��������ǥ��, %g : ���� �� �״��, %A : 16���� �Ǽ�
//		- %b : ����
//		���Ĺ��
//		%5d : ��� ��ġ�� 5ĭ�� Ȯ���ϰ� ������ ����
//		%-5d : ��� ��ġ�� 5ĭ�� Ȯ���ϰ� ���� ����
//		%.2f : �Ҽ��� �Ʒ� 2�ڸ� ������ ǥ��

		System.out.printf("%s,���������Դϴ�. %s.", str1, str2);
		// �ȳ��ϼ���, ���������Դϴ�. �ݰ����ϴ�.
		
		
		System.out.printf("%s,ģ�ϰ� ������.",str2); // �ݰ����ϴ�, ģ�ϰ� ������.
		
		System.out.println();
		
		// �̴� ����
		int age = 20;
		String name = "�ڽſ�";
		String job = "����";
		
		System.out.printf("%s, ����  %d�� %s %s�Դϴ�. ������ %s.", str1, age, name, job, str2);
		// �ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		
	}
}
