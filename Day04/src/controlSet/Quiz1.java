package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 두 정수를 입력 받아서 큰 수를 출력
		// 단, 같은 경우는 '같다' 라고 출력 한다
		int a, b;
		System.out.print("두 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("같다");
		}

		// 2. 정수를 입력 받아서 3과 8의 공배수이면 출력한다
		int c;
		System.out.print("정수 입력 : ");
		c = sc.nextInt();
		if (c % 3 == 0 && c % 8 == 0) {
			System.out.println(c + "는 3과 8의 공배수");
		}

		// 3. 정수를 입력 받아서 절대값을 출력한다
		int d;
		System.out.print("정수 입력 : ");
		d = sc.nextInt();
		if (d < 0) {
			d *= -1;
		}
		System.out.println(d);

		// 4. 세 정수를 입력 받아서 가장 큰 값을 출력한다
		int n1, n2, n3, max, min;
		System.out.print("세 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		// 최대값
		max = n1;
		
		if (max < n2) { max = n2;}
		if (max < n3) { max = n3;}
		
		System.out.println(max);
		
		// 최소값
		min = n1;
		
		if (min > n2) { min = n2;}
		if (min > n3) { min = n3;}
		

		sc.close();
	}
}
