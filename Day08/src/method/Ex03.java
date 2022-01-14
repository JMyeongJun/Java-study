package method;

public class Ex03 {
	static void adder(int n1, int n2) {
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
	}

	public static void main(String[] args) {
		// 메서드 팁)
		// - 메서드의 전달인자와 매개변수는 개수 및 자료형을 일치시킨다
		// - 매개변수에는 전달인자가 순서대로 채워진다

		adder(5, 10);
		adder(10, 5);
		
//		// 잘못된 형식)
//		adder(5);			//개수 부족
//		adder(5, 10, 15);	//개수 과다
//		adder(5, 10.5); 	// 자료형 불일치

	}
}
