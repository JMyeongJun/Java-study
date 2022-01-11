package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case 문 : 조건문의 일종으로 정확히는 '선택문'이라고 한다
		// - 조건이 아닌 값으로 코드를 분기
		// - ex) 1버튼, 2버튼
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("메뉴(1 ~ 3) ");
		menu = sc.nextInt();
		
		switch (menu) {	// switch의 값으로 오로지 정수와 문자열만 가능!!!!!
		case 1:
			System.out.println("1번 메뉴~");
			break;
		case 2:
			System.out.println("2번 메뉴~");
			break;
		case 3:
			System.out.println("3번 메뉴~");
			break;

		default:
			System.out.println("없는 메뉴!!!");
		}
		
		sc.close();
	}
}
