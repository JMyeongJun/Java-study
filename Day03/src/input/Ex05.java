package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// ���� �׽�Ʈ
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("�� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		sc.nextLine(); // ���ۿ��� ���ͱ��� ������ �����´�
		
		int n3, n4;
		
		System.out.print("�ٽ� �� ���� �Է� : ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.println("n3 = " + n3 + ", n4 = " + n4);
		
		sc.close();
	}
}
