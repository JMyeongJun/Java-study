package loop;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// ��Ư�� Ƚ�� �ݺ��� '���� �ݺ�'���·ε� ���� ����
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("���� �Է�(0 : ����) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
			
			if(n==0) {
				break;	// ����� '���' Ż��
			}
		}
		
		sc.close();
	}
}
