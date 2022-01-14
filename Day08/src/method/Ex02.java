package method;

public class Ex02 {
	
	// 매개변수(parameter) : 전달받은 값을 저장하는 변수
	static void hello(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Ex01의 hello() 메서드는 항상 5번만 출력 -> 유연하지 못하다
		
		hello(6);	// 전달인자(arguments) : 메서드 호출시 메서드에 전달하는 데이터
		
		hello(10);
		
		hello(1);
		
//		// # 메서드팁)
//		// - 메서드의 전달인자와 매개변수는 항상 개수 및 자료형을 일치시킨다
//		
//		hello();	// 전달인자 부족
//		hello(1,2);	// 전달인자 과다
//		hello(3.0); // 자료형 불일치
		
	}
}
