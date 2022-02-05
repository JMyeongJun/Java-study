package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
		
		} catch(InputMismatchException e) {
			System.err.println("예외 발생 프로그램을 종료합니다~");
			
			return;
			// 메서드를 종료하면 나머지 아래 구문들이 실행되지 않는다
		
		} finally {
			// 예외 발생여부나 메서드 종료에 상관없이 '무조건' 실행된다
			// - 주로 할당받은 자원을 반납하는 코드를 작성한다
			
			System.out.println("스캐너 해제~");
			sc.close();		// 즉, Scanner 해제가 안됨
		}
		
		System.out.println("여기는 예외 발생시 실행 안됩니다~");
	}
}
