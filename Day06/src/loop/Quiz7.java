package loop;

public class Quiz7 {
	public static void main(String[] args) {
		// 첫날에는 1원예금, 다음날에는 전날의 2배금액을
		// 예금하는 방식으로 한달(30일)동안 저축한 금액을 출력
		int deposit = 0, cash = 1;
		
		for (int i = 1; i <= 30; i++) {
			deposit += cash;
			cash *= 2;
		}
		
		System.out.println(deposit + "원");
	}
}
