package loop;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 1. ���� �Է� �� 1 ~ n���� �Ϸķ� ���
		// ex) �Է� : -> ��� : 1 2 3 4 5 6

		// 2. ���� �Է� �� ����� ��� ���
		// ex) �Է� : 6 -> ��� : 1 2 3 6
		// ex_ �Է� : 7 -> ��� : 1 7

		// 3. ���� �Է� �� �Ҽ����� �Ǻ�
		// ex) �Է� : 6 -> ��� : �Ҽ� �ƴ�
		// ex) �Է� : 7 -> ��� : �Ҽ�

		Scanner sc = new Scanner(System.in);
		int n;

		// 1.
		System.out.print("���� �Է� : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2.
		System.out.print("���� �Է� : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 3.
		boolean isPrime = false;
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		for(int i = 2; i<= Math.sqrt((double)n); i++){
			if(n%i ==0) {
				isPrime = true;
				break;
			}
		}

		if(isPrime = true) {
			System.out.println("�Ҽ� �ƴ�");
		}else {
			System.out.println("�Ҽ�");
		}
		
		sc.close();
	}
}
