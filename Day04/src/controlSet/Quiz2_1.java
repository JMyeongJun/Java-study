package controlSet;

import java.util.Scanner;

public class Quiz2_1 {
	public static void main(String[] args) {

		// 1. ������ �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ� ��� ���� ����ϼ���.
		// 90�̻� A���
		// 80�̻� A���
		// 70�̻� A���
		// 60�̻� A���
		// �� �Ʒ� F���

		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum, avg;
		String grade;

		System.out.print("�� �� �� ���� �Է� : ");
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

		System.out.println(grade + "���");

		sc.close();
	}
}
