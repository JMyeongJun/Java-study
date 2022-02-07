package exception;

// try ~ catch : 예외를 직접 처리하는 구문
// throws : 예외를 메서드를 호출하는 쪽으로 전가하는 구문

// 예외를 전가하는 이유
// - 발생하는 예외를 특정 위치에 모아서 처리하기 위함 -> 유지보수 향상

public class Ex01 {
	
	static void timer(int n) {
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "초");
			
			try {
				// 예외를 직접 처리 -> 더 이상 예외가 발생하지 않음
				Thread.sleep(1000);
			
			} catch(InterruptedException e) {
				System.out.println("예외 발생 : " + e.getMessage());
				
			}
		}
	}
	
	
	static void timer2(int n) throws InterruptedException {
		// 1. 예외를 호출한 쪽으로 전가 -> main으로 넘어간다
		
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		
		timer(5);
		
		// 2. 예외가 떠넘겨져 왔다 -> 직접 처리 혹은 전가 
		try {
			timer2(5);
		
		} catch(InterruptedException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			
		}
	}
}
