package loop;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 1. 정수 입력 후 1 ~ n까지 일렬로 출력
		// ex) 입력 : -> 출력 : 1 2 3 4 5 6

		// 2. 정수 입력 후 약수를 모두 출력
		// ex) 입력 : 6 -> 출력 : 1 2 3 6
		// ex_ 입력 : 7 -> 출력 : 1 7

		// 3. 정수 입력 후 소수인지 판별
		// ex) 입력 : 6 -> 출력 : 소수 아님
		// ex) 입력 : 7 -> 출력 : 소수

		Scanner sc = new Scanner(System.in);
		int n;

		// 1.
		System.out.print("정수 입력 : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2.
		System.out.print("정수 입력 : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 3.
		boolean isPrime = false;
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		for(int i = 2; i<= Math.sqrt((double)n); i++){
			if(n%i ==0) {
				isPrime = true;
				break;
			}
		}

		if(isPrime = true) {
			System.out.println("소수 아님");
		}else {
			System.out.println("소수");
		}
		
		sc.close();
	}
}
