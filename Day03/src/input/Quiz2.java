package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. �̸�, �� �� �� ������ ������ ������ ����
		
		// 2. 1���� ������ ���� �Է� �޴´�
		// ��, �� �� ���� ������ �����ϸ�, ���ٿ� �� ������ ��� �Է� �޴´�
		
		// 3. ����� �Ʒ��� ����
		// ���)
		// �̸� : ȫ�浿
		// ���� : �� 70, �� 80, �� 98
		// �հ� : 248 (= 82.67)
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sum;
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		
		System.out.print("�� �� �� ���� �Է� : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sum = kor + eng + math;
		
		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.printf("���� : �� %d, �� %d, �� %d\n", kor, eng, math);
		System.out.printf("�հ� : %d (= %.2f)", sum, sum/3.0);
		
		sc.close();
	}
}
