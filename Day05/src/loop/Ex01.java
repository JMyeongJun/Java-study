package loop;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문 : 조건에 따라서 코드를 루프

		// while : 조건식이 참이면 종속문장을 수행. 종속문장이 끝나면 다시 조건으로 올라온다!!

		int i = 1;	 // 초기값

		while (i <= 5) { 	// 조건식
			System.out.println(i + " : Hello World!!!");

			i++; 	// 증감식
		}

		System.out.println("반복 후 i = " + i);	// 6
		System.out.println();
		i = 5;

		while (i >= 1) {
			System.out.println(i + " Hello World!!!");

			i--;
		}

		System.out.println("반복 후 i = " + i);
	}
}
