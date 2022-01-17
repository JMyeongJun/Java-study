package method;

public class Ex03 {
	static int square(int n1, int n2) {
		return n1 * n2;
	}
	
	static double circle(double r) {
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		// 연습문제 : 반환형을 직접 파악해서 작성하자~

		// 1. 두 정수를 전달하여 사각형 넓이를 반환하는 메서드
		int width = square(5, 7);

		System.out.println("넓이 : " + width);

		// 2. 실수 하자(= 반지름)를 전달해서 원 넓이를 반환하는 메서드
		// 단, pi = 3.141592로 풀이 한다. 소수점은 2자리 까지
		double result = circle(3.3);
		
		System.out.printf("원 넓이 : %.2f", result);

	}

}
