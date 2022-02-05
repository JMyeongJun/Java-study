package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// �Ʒ� �ۼ��� �ڵ忡�� ���ܸ� ã�Ƽ� ó���϶�
		// ��, try�� �ѹ��� �� �� �ִ� 
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		int[] arr = new int[] {10,20,30,40,50};
		System.out.println("arr = " + Arrays.toString(arr));
		
		try {
			System.out.print("index �Է� : ");
			n = sc.nextInt();
			
			
			System.out.println("arr[" + n + "] = " + arr[n]);
		
		} catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.err.println("���� �޼��� : " + e.getMessage());
			System.err.println("���� Ŭ���� : " + e.getClass().getName());
			// �� Class Ŭ���� : Ŭ���� ���� �޼��尡 �ִ� -> �ַ� �̸��� �ľ��ϰų�, �ܺ� Ŭ������ �ҷ��ö� ����ϱ⵵ ��
			
			
		} catch(Exception e) {
			// Exception Ŭ���� : ������ �ֻ��� Ŭ����. ��, ��� ���ܸ� �� �޾Ƽ� ó�� ����
			// - �ַ� �𸣴� ���ܸ� �����ϰ� �ۼ��ϴ� ����
			System.err.println("���� �߻� : " + e.getMessage());
		
		} 
		
		System.out.println("Scanner ����~");	// ����� ���� �߻� ���ο� ������� ������ ����ǰ�~
		sc.close();
		
	}
}
