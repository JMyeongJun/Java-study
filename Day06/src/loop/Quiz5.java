package loop;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// factorial 구현
		// ex) 입력 : 5 -> 출력 : 120

		Scanner sc = new Scanner(System.in);
		int n, result = 1;

		System.out.print("정수 입력 : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println(result);

		sc.close();
	}
}
