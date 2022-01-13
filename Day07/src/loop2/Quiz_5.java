package loop2;

import java.util.Scanner;

public class Quiz_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("ют╥б : ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();
	}
}
