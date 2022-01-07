package casting;

// 형변환(casting) : 데이터 타입. 즉, 자료형을 변환
// 1. 자동 형변환 : 연산시 발생하며, 작은 쪽에서 큰쪽으로 변화
// 2. 강제 형변환 : 개발자가 직접 타입을 명시해서 변경

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("10" + "20");	// 문자열 + 연산은 이어붙이기
		System.out.println(10 + 20);		// 정수 + 연산은 덧셈
		System.out.println();
		
		System.out.println("10" + 20);	// "10" + 20 -> "10" + "20"
										// String + int -> String + String
		
		System.out.println(10 + 3.14);	// 10 + 3.14 -> 10.0 + 3.14 = 13.14	
										// int + double -> double + double
		
		int num = 10;
		double pi = 3.141592;
		
		System.out.println("num = " + num);
		// "num = " +10 -> "num = " + "10" = "num = 10"
		
		System.out.println("pi = " + pi);
		
	}
}
