package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 논리 연산자 : 참/거짓을 연산한는 연산자
		// and(&&), or(||), not(!)
		
		// 1. and : 양 쪽 모두 참이면 결과가 참
		// - 다른 말로 곱(*)연산이라고 한다
		System.out.println("true  and true  결과 : " + (true && true));
		System.out.println("true  and false 결과 : " + (true && false));
		System.out.println("false and true  결과 : " + (false && true));
		System.out.println("false and false 결과 : " + (false && false) + "\n");
		
		// 2. or : 양 쪽 모두 거짓이면 결과가 거짓
		// - 다른 말로 합(+)연산이라고 한다
		System.out.println("true  or true  결과 : " + (true || true));
		System.out.println("true  or false 결과 : " + (true || false));
		System.out.println("false or true  결과 : " + (false || true));
		System.out.println("false or false 결과 : " + (false || false) + "\n");
		
		// 3. not : 참을 거짓으로, 거짓을 참으로
		// - 다른말로 반전연산이라고 한다
		System.out.println("not true  결과 : " + !true);
		System.out.println("not false 결과 : " + !false);
		
	}
}
