package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// switch���� ���� ����ó���� ��ٷӴ�

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("���� �Է�(1 ~ 10)");
		n = sc.nextInt();

		switch (n) {
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("Ȧ��");
			break;
		case 2: case 4: case 6: case 8: case 10:
			System.out.println("¦��");
			break;
		default:
			System.out.println("������ �Ѿ!!!");
		}

		sc.close();
	}
}
