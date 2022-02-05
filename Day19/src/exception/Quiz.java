package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 아래 작성한 코드에서 예외를 찾아서 처리하라
		// 단, try는 한번만 쓸 수 있다 
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		int[] arr = new int[] {10,20,30,40,50};
		System.out.println("arr = " + Arrays.toString(arr));
		
		try {
			System.out.print("index 입력 : ");
			n = sc.nextInt();
			
			
			System.out.println("arr[" + n + "] = " + arr[n]);
		
		} catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.err.println("예외 메세지 : " + e.getMessage());
			System.err.println("예외 클래스 : " + e.getClass().getName());
			// ※ Class 클래스 : 클래스 관련 메서드가 있다 -> 주로 이름을 파악하거나, 외부 클래스를 불러올때 사용하기도 함
			
			
		} catch(Exception e) {
			// Exception 클래스 : 예외의 최상위 클래스. 즉, 모든 예외를 다 받아서 처리 가능
			// - 주로 모르는 예외를 염두하고 작성하는 구문
			System.err.println("예외 발생 : " + e.getMessage());
		
		} 
		
		System.out.println("Scanner 해제~");	// 여기는 예외 발생 여부에 상관없이 무조건 실행되게~
		sc.close();
		
	}
}
