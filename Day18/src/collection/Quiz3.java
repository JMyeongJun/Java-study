package collection;

import java.util.List;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) throws InterruptedException {
		// 입력 받은 만큼 로또 장 수를 출력해 주자~
		Lotto lt = new Lotto();
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("로또 구매 개수? ");
		n = sc.nextInt();
		
		List<Integer> lotto;
		
		for (int i = 1; i <= n; i++) {
			lotto = lt.getNumber();
			
			System.out.println(i + "회차 : " + lotto);
			
			Thread.sleep(200);
		}
		
		sc.close();
	}
}
