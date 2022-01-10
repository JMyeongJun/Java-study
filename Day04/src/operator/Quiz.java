package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// # 모든 문제는 '조건 연산자'를 사용 (if ~ else 아님)
		
		Scanner sc = new Scanner(System.in);
		int result;
		
		// 1. 정수를 하나 입력 받아서 3의 배수인지 판별
		// ex1) 입력 : 6 --> 출력 : 3의 배수
		// ex2) 입력 : 5 --> 출력 : 3의 배수 x
		
		int a;
		String str;
		a = sc.nextInt();
		str = (a%3 == 0) ? "" : "x";
		System.out.println("3의 배수 " + str);
		
		
		// 2. 두 정수를 입력 받아서 큰 수를 출력
		// 단, 같은 경우는 아무거나 출력
		// ex1) 입력 : 5 7 -> 출력 : 큰 수는 7
		
		int b, c;
		b = sc.nextInt();
		c = sc.nextInt();
		result = (b >= c) ? b : c;
		System.out.println("큰 수는 " + result);
		
		
		// 3. 정수를 하나 입력 받아서 절대값을 출력
		// ex1) 입력 : 5 -> 출력 : 5
		// ex2) 입력 : -5 -> 출력 : 5
		
		int e;
		e = sc.nextInt();
		result = (e > 0) ? e : -e;
		// n = Math.abs(n);
		// - Java는 Math라는 클래스에 이미 절대값 함수가 있다.
		System.out.println(result);
		
		sc.close();
	}
}
