package collection;

import java.util.List;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) throws InterruptedException {
		// �Է� ���� ��ŭ �ζ� �� ���� ����� ����~
		Lotto lt = new Lotto();
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("�ζ� ���� ����? ");
		n = sc.nextInt();
		
		List<Integer> lotto;
		
		for (int i = 1; i <= n; i++) {
			lotto = lt.getNumber();
			
			System.out.println(i + "ȸ�� : " + lotto);
			
			Thread.sleep(200);
		}
		
		sc.close();
	}
}
