package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case �� : ���ǹ��� �������� ��Ȯ���� '���ù�'�̶�� �Ѵ�
		// - ������ �ƴ� ������ �ڵ带 �б�
		// - ex) 1��ư, 2��ư
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("�޴�(1 ~ 3) ");
		menu = sc.nextInt();
		
		switch (menu) {	// switch�� ������ ������ ������ ���ڿ��� ����!!!!!
		case 1:
			System.out.println("1�� �޴�~");
			break;
		case 2:
			System.out.println("2�� �޴�~");
			break;
		case 3:
			System.out.println("3�� �޴�~");
			break;

		default:
			System.out.println("���� �޴�!!!");
		}
		
		sc.close();
	}
}
