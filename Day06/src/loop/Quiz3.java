package loop;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 3. ������ �Է� �޾Ƽ� ���� �Ųٷ� ���
		// ex) �Է� : 123 -> ��� : 321
		// ex) �Է� : 12345 -> ��� : 54321

		Scanner sc = new Scanner(System.in);
		int n;

		// �ٷ� ���
		System.out.print("���� �Է� : ");
		n = sc.nextInt();

		while (n != 0) {
			System.out.print(n % 10);
			n /= 10;
		}
		System.out.println();

		// ������ ����ڡڡڡڡ�
		System.out.println("�ٽ� �Է� : ");
		n = sc.nextInt();

		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}

		System.out.println("rev = " + rev);
		System.out.println("rev + 111 = " + (rev + 111));
		sc.close();
	}
}
