package exception;

// 오류 : 프로그램에서 발생하는 비정상 코드
// - 에러 : 시스템 레벨의 오류. 개발자가 처리하는 부분이 아니다
// - 예외 : 개발자의 논리적 오류나, 사용자의 잘못된 입력으로 발생하는 오류
//		  미리 예상하고 처리가 가능한다

// 예외 처리 : 예외를 감지하고 처리하는 과정
// 1. 프로그램의 실행 흐름을 바로 잡거나
// 2. 예외를 처리하지 않으면 사용 불가능한 메서드가 있기 때문

public class Ex01 {
	public static void main(String[] args) {
		// try : 예외를 탐지하는 구문
		// - 예외 발생시 catch문으로 예외를 '던진다' 
		try {
			System.out.println(10 / 0);
			
			System.out.println("예외 발생시 실행 안됨~");
		
		} catch(ArithmeticException e) {
			// catch : 발생한 예외를 처리하는 구문
			// - 예외가 발생하지 않으면 실행되지 않는다
			System.err.println("e : " + e.getMessage());
		}
		
		System.out.println("여기는 실행이 됩니까?");
	}
}
