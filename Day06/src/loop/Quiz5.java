package loop;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// factorial ����
		// ex) �Է� : 5 -> ��� : 120

		Scanner sc = new Scanner(System.in);
		int n, result = 1;

		System.out.print("���� �Է� : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println(result);

		sc.close();
	}
}
