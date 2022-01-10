package controlSet;

import java.util.Scanner;

public class Quiz2_1 {
	public static void main(String[] args) {

		// 1. 국영수 세 과목의 성적을 입력 받아 합계와 평균을 구하고 등급 컷을 출력하세요.
		// 90이상 A등급
		// 80이상 A등급
		// 70이상 A등급
		// 60이상 A등급
		// 그 아래 F등급

		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum, avg;
		String grade;

		System.out.print("국 영 수 점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println(grade + "등급");

		sc.close();
	}
}
