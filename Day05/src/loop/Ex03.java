package loop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// �ݺ��� ����
		// 1. ���� Ƚ�� �ݺ� : Ƚ���� �ִ� �ݺ�. ex) 10��, 3��
		// 2. ��Ư�� Ƚ�� �ݺ� : ������ Ƚ���� ���� �ݺ�. ex) ���Ḧ ������ ����

		Scanner sc = new Scanner(System.in);
		int n = 1;

		while (n != 0) {
			System.out.print("���� �Է�(0 : ����) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}
