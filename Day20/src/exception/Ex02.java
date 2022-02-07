package exception;

// 예외 클래스를 상속 받아서 직접 예외 클래스를 작성할 수도 있다~
class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}

public class Ex02 {
	// throws : 예외를 전가하는 구문
	// throw : 예외를 강제로 발생시키는 구문
	// - 주로 예외 클래스를 직접 작성하는 경우 사용한다
	// - 주로 조건문이 걸려있다~
	
	static void myMethod(int n) throws MyException {
		// 내가 작성한 메서드에서 매개변수에 음수가 전달되면 예외가 발생하게 조건을 건다
		if (n < 0) {
			throw new MyException("내가 직접 발생시킨 예외");
		}
		
		System.out.println(n + "은 양수 입니다~");
	}
	
	public static void main(String[] args) {
		
		try {
			myMethod(-1);
		
		} catch(MyException e) {
			e.printStackTrace();
			
			System.err.println("\n예외 메세지 : " + e.getMessage());
		}
	}
}
