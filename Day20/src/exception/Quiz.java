package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 문제)
		// 사용자에게 정수를 입력 받아서 입력 받은 정수를 출력해준다
		
		// 단, 실수나 문자열이 입력되면 예외가 발생되어 프로그램이 종료된다
		// 이때, 실행 흐름을 올바르게 다시 잡아서 사용에게 다시 입력 받을 수 있게 한다
		
		// ※ 팁 : 버퍼가 뭐였나?
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
		
			try {
			
				System.out.print("정수 입력 : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				break;
				
			} catch(InputMismatchException e) {
				System.err.println("정수가 아닙니다. 다시 입력해 주세요~\n");
				
				sc.nextLine();	// 잘못 입력된 값이 버퍼에 남으면 무한 루프에 빠진다
								// 따라서, 버퍼를 비울 필요가 있다~
			}
			
		}
		
		sc.close();
	}
}
