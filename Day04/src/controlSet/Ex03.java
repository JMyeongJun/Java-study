package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ��ø ���ǹ� : ���ǹ� �ȿ� �� ���ǹ��� �����ϴ� ���
		// - ���� ���� �Ǻ��� �ʿ��� �� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		if(n % 2 ==0) {
			System.out.println("¦��");
			
			if(n % 3 ==0) {
				System.out.println("¦���̸� 3�� ���");
			}else {
				System.out.println("¦�������� 3�� ����� �ƴ�~");
			}
		}else {
			System.out.println("Ȧ��");
			
			// Ȧ���̸� 3�� ����� �ƴ� ���� �����ؼ� ���
			if (n%3 ==0) {
				System.out.println("Ȧ���̸� 3�� ���~");
			}else {
				System.out.println("Ȧ�������� 3�� ����� �ƴ�~");
			}
		}
		
		sc.close();
	}
}
