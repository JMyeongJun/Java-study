package controlSet;

import java.util.Scanner;

public class Quiz2_2 {
	public static void main(String[] args) {

		// 2. USB �� ���� 5000�� �Ѵ�. �׷��� �ѹ��� 10�� �̻��� �����ϸ� ��ü�� 10%�� �������ش�.
		// 100�� �̻��� ��ü�� 12%�� �������ش�. n���� USB�� ����� �󸶰� �־�� �ϴ°�

		Scanner sc = new Scanner(System.in);
		int price = 5000, n;
		double pay;

		System.out.print("���� ���� : ");
		n = sc.nextInt();

		if (n >= 100) {
			pay = n * price * 0.88;
		} else if (n >= 10) {
			pay = n * price * 0.9;
		} else {
			pay = n * price;
		}

		System.out.printf("���� �ݾ� : %.0f��", pay);

		sc.close();
	}
}
