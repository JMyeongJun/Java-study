package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ���ڿ��� ���ڵ� �Է��غ���~
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("���ڿ� �Է�: ");
		str = sc.next();
		
		System.out.println("str = " + str);
		
		System.out.println("str[0] = " + str.charAt(0) + "\n");
		
		char ch;
		
		System.out.print("���� �ϳ� : ");
		ch = sc.next().charAt(0);
		
		System.out.println("ch = " + ch);
		
		sc.close();
		
	}
}
