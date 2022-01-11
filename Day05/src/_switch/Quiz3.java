package _switch;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;

		System.out.print("국 영 수 점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		sum = kor + eng + mat;
		
		System.out.printf("합계 : %d, 평균 : %.1f, 등급 : ", sum, sum/3.0);
		
		switch ((sum / 3) / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		sc.close();
	}
}
