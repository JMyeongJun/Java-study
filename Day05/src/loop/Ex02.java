package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 1. ������ 2�� ���
		// 2. 1���� �Ϸ� �� �Է� ���� ������ ���� ���
		// 3. �������ε� ����غ���

		// 1.
		int i = 1;

		while (i <= 9) {
			System.out.printf("2 X %d = %d\n", i, 2 * i);

			i++;
		}
		System.out.println();

		// 2.
		Scanner sc = new Scanner(System.in);
		int n;
		i = 1;

		System.out.print("������ �� �Է� : ");
		n = sc.nextInt();

		while (i <= 9) {
			System.out.printf("%d X %d = %d\n", n, i, n * i);

			i++;
		}
		System.out.println();
		
		// 3.
		System.out.println("���� ���");
		
		while (i-- > 1) {
			System.out.printf("%d X %d = %d\n", n, i, n * i);
		}
		
		sc.close();
	}
}
