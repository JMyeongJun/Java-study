package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 2. ������ �Է� �޾Ƽ� 1 ~ n������ �հ踦 ���
		// ex) �Է� : 5 -> ��� : 15
		
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();

		while (true) {
			sum += n;
			n--;

			if (n == 0) {
				System.out.println(sum);
				break;
			}
		}
		
		sc.close();
	}
}
