package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// ���� ���� ó��
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("���� �Է� : ");
			n = sc.nextInt();
			
			System.out.println("10 / " + n + " = " + 10 / n);
			
		} catch(ArithmeticException e) {
			// System.err.println("���� �߻� : 0���� ������ �ֽ��ϴ�~");
			System.err.println("���� �߻� �޼��� : " + e.getMessage());
			
		} catch(InputMismatchException e) {
			// System.err.println("���� �߻� : ������ �ƴմϴ�~");

			e.printStackTrace();
		}
		
		System.out.println("��ĳ�� ����~");
		sc.close();
		
		// ���� ó�� ��� ��)
		// 1. �׳� �ۼ��ϴ���� �ڵ带 ����
		// 2. �����ϴٰ� ���ܰ� �߰ߵǸ� �׶� ���� Ŭ������ �ľ��ϰ� ó���Ѵ�
		// 3. ���� �޼�����
		// 3-1. ���� �ۼ��ϰų�
		// 3-2. getMessage()�� ó���ϰų�
		// 3-3. printStackTrace() �� �ϳ��� ó���Ѵ�
		
	}
}
