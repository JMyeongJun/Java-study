package controlSet;

import java.util.Scanner;

public class Quiz2_2 {
	public static void main(String[] args) {

		// 2. USB �� ���� 5000�� �Ѵ�. �׷��� �ѹ��� 10�� �̻��� �����ϸ� ��ü�� 10%�� �������ش�.
		// 100�� �̻��� ��ü�� 12%�� �������ش�. n���� USB�� ����� �󸶰� �־�� �ϴ°�

		Scanner sc = new Scanner(System.in);
		int price = 5000, n, pay;

		System.out.print("���� ���� : ");
		n = sc.nextInt();

		pay = price * n;

		if (n >= 100) {
			pay = (int) (n * price * 0.88);	// ����ȯ �ʿ� --> pay *= 0.88;	// ����ȯ �ʿ����!!
		} else if (n >= 10) {
			pay *= 0.9;	// ����ȯ �ʿ����!!
		} else {
			pay = n * price;
		}

		System.out.printf("���� �ݾ� : %d��", pay);

		sc.close();
	}
}
