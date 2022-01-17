package method;

// 메서드의 종류
// 1. 반환값이 없는 메서드 : void형 메서드
// 2. 반환값이 있는 메서드 : void를 제외한 모든 자료형

public class Ex02 {
	// 자료형이 void -> 반환할 값이 없다!! 를 알림
	static void adder1(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}
	
	// 자료형이 int -> 반환할 값이 정수다!! 를 알림
	static int adder2(int n1, int n2) {
		// This method must return a result of type int!
		int result = n1 + n2;
		
		return result;
		// return 값 : 메서드를 호출한 위치로 결과값을 돌려준다
		// - 단, 메서드의 자료형(= 반환형)이랑 자료형이 같아야 한다
	}
	
	public static void main(String[] args) {
		// void형 메서드는 결과값이 없으므로 그냥 '이름만 호출' 해서 사용
		adder1(10, 7);
		
		// 반환형이 있는 메서드는 결과가 돌려져 오므로 꼭! 변수에 저장받거나 바로 사용해 버린다
		int result = adder2(10, 7);
		// 		   = 17;
		
		System.out.println("result = " + result + "\n");
		
		System.out.println("adder2(5, 6) = " + adder2(5, 6));
		//				  ("adder2(5, 6) = " + 11);
		
		// 메서드는 가장 안쪽부터 수행하며 같은 위치의 메서드는 왼쪽부터 실행한다
		result = adder2(adder2(5,2), adder2(7,3));
		
		System.out.println("result = " + result);
	}
}
