package loop;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 3. 정수를 입력 받아서 수를 거꾸로 출력
		// ex) 입력 : 123 -> 출력 : 321
		// ex) 입력 : 12345 -> 출력 : 54321

		Scanner sc = new Scanner(System.in);
		int n;

		// 바로 출력
		System.out.print("정수 입력 : ");
		n = sc.nextInt();

		while (n != 0) {
			System.out.print(n % 10);
			n /= 10;
		}
		System.out.println();

		// 변수에 저장★★★★★
		System.out.println("다시 입력 : ");
		n = sc.nextInt();

		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}

		System.out.println("rev = " + rev);
		System.out.println("rev + 111 = " + (rev + 111));
		sc.close();
	}
}
