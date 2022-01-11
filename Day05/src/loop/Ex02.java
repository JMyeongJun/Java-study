package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 구구단 2단 출력
		// 2. 1번을 완료 후 입력 받은 구구단 수를 출력
		// 3. 역순으로도 출력해본다

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

		System.out.print("구구단 수 입력 : ");
		n = sc.nextInt();

		while (i <= 9) {
			System.out.printf("%d X %d = %d\n", n, i, n * i);

			i++;
		}
		System.out.println();
		
		// 3.
		System.out.println("역순 출력");
		
		while (i-- > 1) {
			System.out.printf("%d X %d = %d\n", n, i, n * i);
		}
		
		sc.close();
	}
}
