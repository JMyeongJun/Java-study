package input;

import java.lang.System;	// lang�� �⺻ �ڵ� import�� �ȴ�

import java.util.Scanner;	// lang�� ������ ������ package�� import�� �ʼ�

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();		// next�ڷ���() ���·� �Է� ����
		
		System.out.println("n = " + n);
		System.out.println("n + 10 = " + (n + 10));
		
		
		sc.close();
	}
}
