package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. ������ �Է� �޾Ƽ� 1 ~ n���� �Ϸķ� ���
		// ex) �Է� : 5 -> ��� : 1 2 3 4 5

		Scanner sc = new Scanner(System.in);
		int n;

		// 1.
		System.out.print("���� �Է� : ");
		n = sc.nextInt();

		int i = 1;
		while (true) {
			System.out.print(i + " ");
			i++;

			if (i == n + 1) {
				break;
			}
		}
		System.out.println();

		sc.close();
	}
}
