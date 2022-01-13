package loop2;

public class Ex02 {
	public static void main(String[] args) {
		// 아래 구문을 반복시켜서 2단 ~ 9단까지 출력되게 한다
		// 단, 각 단은 9단 까지만

//		for (int j = 1; j <= 9; j++) {
//			System.out.println(2 + " X " + j + " = " + 2 * j);
//		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
