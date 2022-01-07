package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// next() : 띄어쓰기와 엔터를 구분자로 인식, 이전의 띄어쓰기와 엔터를 알아서 버린다
		// nextLine() : 엔터만 구분자로 인식, 이전의 엔터를 버리지 못한다
		
		Scanner sc = new Scanner(System.in);
		String str1;
		
		System.out.print("문자열 입력 : ");
		str1 = sc.next();
		
		System.out.println("str1 = " + str1 + "\n");
		
		sc.nextLine();
		
		String str2;
		
		System.out.print("띄어쓰기 포함 : ");
		str2 = sc.nextLine();
		
		System.out.println("str2 = " + str2);
		
		sc.close();
	}
}
