package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			System.out.println("n = " + n);
		
		} catch(InputMismatchException e) {
			System.err.println("���� �߻� ���α׷��� �����մϴ�~");
			
			return;
			// �޼��带 �����ϸ� ������ �Ʒ� �������� ������� �ʴ´�
		
		} finally {
			// ���� �߻����γ� �޼��� ���ῡ ������� '������' ����ȴ�
			// - �ַ� �Ҵ���� �ڿ��� �ݳ��ϴ� �ڵ带 �ۼ��Ѵ�
			
			System.out.println("��ĳ�� ����~");
			sc.close();		// ��, Scanner ������ �ȵ�
		}
		
		System.out.println("����� ���� �߻��� ���� �ȵ˴ϴ�~");
	}
}
