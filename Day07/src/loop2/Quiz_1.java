package loop2;

import java.util.Scanner;

public class Quiz_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("�Է� : ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();
	}
}
