package input;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. �̸�, ����, Ű, �ּ�, ������ �Է� ���� ������ �����Ѵ�
		
		// 2. �Է¹����� 1���� ������ ���� �Է� �޴´�
		
		// 3. ����� �Ʒ��� ����
		// ���)
		// �̸� : ȫ�浿 (31��, ��)
		// ���� : 181.3cm
		// �ּ� : �λ� ������ �ؿ�뱸 ���ҷ�
		
		Scanner sc = new Scanner(System.in);
		
		String name, addr;
		int age;
		double height;
		char sex;
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("���� : ");
		sex = sc.next().charAt(0);
		
		System.out.print("���� : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("�ּ� : ");
		addr = sc.nextLine();
		
		System.out.println();
		System.out.printf("�̸� : %s (%d��, %c)\n", name, age, sex);
		System.out.printf("���� : %.1fcm\n", height);
		System.out.println("�ּ� : " + addr);
		
		sc.close();
	}
}
