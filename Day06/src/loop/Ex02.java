package loop;

public class Ex02 {
	public static void main(String[] args) {
		// for문 : 초기값, 조건식, 증감식이 한곳에 모여있는 구문
		// - 따라서, 반복 횟수 파악이 용이하다

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();

		// System.out.println("반복 후 i = " + i);
		// - i는 for문의 '지역 변수'
		// - 지역 변수는 해당 영역에서만 사용가능하다

		for (int i = 5; i >= 1; i--) {
			System.out.println(i + " : Hello World!!!");
		}

		// for문 동작 순서
		// 초기값 -> 조건식 -> 종속문장 -> 증감식 -> 조건식 -> 종속 문장 -> 증감식 ...
	}
}
