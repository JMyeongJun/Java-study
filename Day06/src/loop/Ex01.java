package loop;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 불특정 횟수 반복은 '무한 반복'형태로도 구현 가능
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
			
			if(n==0) {
				break;	// 제어문을 '즉시' 탈출
			}
		}
		
		sc.close();
	}
}
