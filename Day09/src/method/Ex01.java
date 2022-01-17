package method;

public class Ex01 {
	static void adder(int n1, int n2) {
		System.out.println("n1 = " + n1 + ", n2 = " + n2);

		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
	}

	public static void main(String[] args) {
		// 메서드 : 일정 길이의 코드를 이름이저 저장해서 사용하는 방식
		// - 코드의 중복 제거, 재사용성 증가

		adder(5, 2);

		adder(2, 5);

		adder(3, 3);
	}
}
