package method;

// 메서드 오버로딩(overloading) : 같은 이름의 메서드를 여러개 작성하는 방식
// overload : 과적하다, 과부하하다
// 즉, 하나의 메서드에 일(= 코드)을 많이 준다는 의미

// 규칙)
// 1. 메서드의 이름이 같아야 한다
// 2. 매개변수의 형태가 달라야 한다 (= 개수가 다르거나 자료형이 다르면 됨

// # 반환형은 오버로딩 영향을 주지 않는다

// # 나중에 클래스에 생성자라는 메서드는 클래스와 이름을 동일하게 사용해야 한다
//  즉, 이름을 바꿀 수 없다는 의미

public class Ex05 {

	static int adder() {
		return 100 + 50;
	}

	static int adder(int n) {
		return n + 50;
	}
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}

	public static void main(String[] args) {
		System.out.println("adder() = " + adder());
		System.out.println("adder(10) = " + adder(10));
		System.out.println("adder(10, 5) = " + adder(10, 5));
		
		System.out.println("adder(10) = " + adder(10.0));
	}
}
