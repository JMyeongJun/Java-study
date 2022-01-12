package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
		// ex) 입력 : 5 -> 출력 : 1 2 3 4 5

		Scanner sc = new Scanner(System.in);
		int n;

		// 1.
		System.out.print("정수 입력 : ");
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
