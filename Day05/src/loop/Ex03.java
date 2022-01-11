package loop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 반복의 종료
		// 1. 지정 횟수 반복 : 횟수가 있는 반복. ex) 10번, 3번
		// 2. 불특정 횟수 반복 : 마땅히 횟수가 없는 반복. ex) 종료를 누를때 까지

		Scanner sc = new Scanner(System.in);
		int n = 1;

		while (n != 0) {
			System.out.print("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}
