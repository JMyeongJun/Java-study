package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// # ��� ������ '���� ������'�� ��� (if ~ else �ƴ�)
		
		Scanner sc = new Scanner(System.in);
		int result;
		
		// 1. ������ �ϳ� �Է� �޾Ƽ� 3�� ������� �Ǻ�
		// ex1) �Է� : 6 --> ��� : 3�� ���
		// ex2) �Է� : 5 --> ��� : 3�� ��� x
		
		int a;
		String str;
		a = sc.nextInt();
		str = (a%3 == 0) ? "" : "x";
		System.out.println("3�� ��� " + str);
		
		
		// 2. �� ������ �Է� �޾Ƽ� ū ���� ���
		// ��, ���� ���� �ƹ��ų� ���
		// ex1) �Է� : 5 7 -> ��� : ū ���� 7
		
		int b, c;
		b = sc.nextInt();
		c = sc.nextInt();
		result = (b >= c) ? b : c;
		System.out.println("ū ���� " + result);
		
		
		// 3. ������ �ϳ� �Է� �޾Ƽ� ���밪�� ���
		// ex1) �Է� : 5 -> ��� : 5
		// ex2) �Է� : -5 -> ��� : 5
		
		int e;
		e = sc.nextInt();
		result = (e > 0) ? e : -e;
		// n = Math.abs(n);
		// - Java�� Math��� Ŭ������ �̹� ���밪 �Լ��� �ִ�.
		System.out.println(result);
		
		sc.close();
	}
}
