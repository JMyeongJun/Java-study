package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// ����)
		// ����ڿ��� ������ �Է� �޾Ƽ� �Է� ���� ������ ������ش�
		
		// ��, �Ǽ��� ���ڿ��� �ԷµǸ� ���ܰ� �߻��Ǿ� ���α׷��� ����ȴ�
		// �̶�, ���� �帧�� �ùٸ��� �ٽ� ��Ƽ� ��뿡�� �ٽ� �Է� ���� �� �ְ� �Ѵ�
		
		// �� �� : ���۰� ������?
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
		
			try {
			
				System.out.print("���� �Է� : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				break;
				
			} catch(InputMismatchException e) {
				System.err.println("������ �ƴմϴ�. �ٽ� �Է��� �ּ���~\n");
				
				sc.nextLine();	// �߸� �Էµ� ���� ���ۿ� ������ ���� ������ ������
								// ����, ���۸� ��� �ʿ䰡 �ִ�~
			}
			
		}
		
		sc.close();
	}
}
