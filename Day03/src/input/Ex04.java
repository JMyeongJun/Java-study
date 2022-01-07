package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 문자열과 문자도 입력해보자~
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자열 입력: ");
		str = sc.next();
		
		System.out.println("str = " + str);
		
		System.out.println("str[0] = " + str.charAt(0) + "\n");
		
		char ch;
		
		System.out.print("문자 하나 : ");
		ch = sc.next().charAt(0);
		
		System.out.println("ch = " + ch);
		
		sc.close();
		
	}
}
