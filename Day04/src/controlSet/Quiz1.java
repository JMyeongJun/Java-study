package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. �� ������ �Է� �޾Ƽ� ū ���� ���
		// ��, ���� ���� '����' ��� ��� �Ѵ�
		int a, b;
		System.out.print("�� ���� �Է� : ");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("����");
		}

		// 2. ������ �Է� �޾Ƽ� 3�� 8�� ������̸� ����Ѵ�
		int c;
		System.out.print("���� �Է� : ");
		c = sc.nextInt();
		if (c % 3 == 0 && c % 8 == 0) {
			System.out.println(c + "�� 3�� 8�� �����");
		}

		// 3. ������ �Է� �޾Ƽ� ���밪�� ����Ѵ�
		int d;
		System.out.print("���� �Է� : ");
		d = sc.nextInt();
		if (d < 0) {
			d *= -1;
		}
		System.out.println(d);

		// 4. �� ������ �Է� �޾Ƽ� ���� ū ���� ����Ѵ�
		int n1, n2, n3, max, min;
		System.out.print("�� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		// �ִ밪
		max = n1;
		
		if (max < n2) { max = n2;}
		if (max < n3) { max = n3;}
		
		System.out.println(max);
		
		// �ּҰ�
		min = n1;
		
		if (min > n2) { min = n2;}
		if (min > n3) { min = n3;}
		

		sc.close();
	}
}
