package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 다중 예외 처리
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			System.out.println("10 / " + n + " = " + 10 / n);
			
		} catch(ArithmeticException e) {
			// System.err.println("예외 발생 : 0으로 나누고 있습니다~");
			System.err.println("예외 발생 메세지 : " + e.getMessage());
			
		} catch(InputMismatchException e) {
			// System.err.println("예외 발생 : 정수가 아닙니다~");

			e.printStackTrace();
		}
		
		System.out.println("스캐너 해제~");
		sc.close();
		
		// 예외 처리 방법 팁)
		// 1. 그냥 작성하던대로 코드를 쓴다
		// 2. 실행하다가 예외가 발견되면 그때 예외 클래스를 파악하고 처리한다
		// 3. 예외 메세지는
		// 3-1. 직접 작성하거나
		// 3-2. getMessage()로 처리하거나
		// 3-3. printStackTrace() 중 하나로 처리한다
		
	}
}
