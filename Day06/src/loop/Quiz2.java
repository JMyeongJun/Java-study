package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 2. 정수를 입력 받아서 1 ~ n까지의 합계를 출력
		// ex) 입력 : 5 -> 출력 : 15
		
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();

		while (true) {
			sum += n;
			n--;

			if (n == 0) {
				System.out.println(sum);
				break;
			}
		}
		
		sc.close();
	}
}
