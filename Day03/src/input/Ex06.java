package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// next() : ����� ���͸� �����ڷ� �ν�, ������ ����� ���͸� �˾Ƽ� ������
		// nextLine() : ���͸� �����ڷ� �ν�, ������ ���͸� ������ ���Ѵ�
		
		Scanner sc = new Scanner(System.in);
		String str1;
		
		System.out.print("���ڿ� �Է� : ");
		str1 = sc.next();
		
		System.out.println("str1 = " + str1 + "\n");
		
		sc.nextLine();
		
		String str2;
		
		System.out.print("���� ���� : ");
		str2 = sc.nextLine();
		
		System.out.println("str2 = " + str2);
		
		sc.close();
	}
}
