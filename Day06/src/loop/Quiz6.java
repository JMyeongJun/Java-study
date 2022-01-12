package loop;

public class Quiz6 {
	public static void main(String[] args) {
		// 1 ~ 1000까지의 합을 구하시오
		// (단, 3의 배수는 제외, 3의 배수이면서 5의 배수는 포함)
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				continue;
			}
			sum += i;
			
			//디버깅 코드
			//System.out.printf("i = %d, total = %d\n", i, sum);
		}
		System.out.println(sum);
	}
}
