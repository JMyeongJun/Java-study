package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 이름, 국 영 수 점수를 저장할 변수를 선언
		
		// 2. 1번에 변수에 값을 입력 받는다
		// 단, 국 영 수는 정수로 선언하며, 한줄에 세 점수를 모두 입력 받는다
		
		// 3. 결과는 아래와 같다
		// 결과)
		// 이름 : 홍길동
		// 성적 : 국 70, 영 80, 수 98
		// 합계 : 248 (= 82.67)
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sum;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("국 영 수 점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sum = kor + eng + math;
		
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, math);
		System.out.printf("합계 : %d (= %.2f)", sum, sum/3.0);
		
		sc.close();
	}
}
