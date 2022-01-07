package input;

import java.lang.System;	// lang은 기본 자동 import가 된다

import java.util.Scanner;	// lang을 제외한 나머지 package는 import가 필수

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();		// next자료형() 형태로 입력 가능
		
		System.out.println("n = " + n);
		System.out.println("n + 10 = " + (n + 10));
		
		
		sc.close();
	}
}
