package _switch;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sw;
		
		System.out.print("�� �� ����ġ�� �����ðڽ��ϱ�? (1,2,3) : ");
		sw = sc.nextInt();
		
		switch (sw) {
		case 1:
			System.out.println("����ON");
			break;
		case 2:
			System.out.println("����OFF");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		default:
			System.out.println("���� �޴� ��ȣ");
		}
		
		sc.close();
	}
}
