package controlSet;

import java.util.Scanner;

// ��� : ���α׷��� �帧�� �����ϴ� ����
// 1. ���ǹ� : ���ǿ� ���� �ڵ��� �帧�� �б�
// 2. �ݺ��� : ���ǿ� ���� �ڵ带 ����
// 3. ���� ��� : ���� �� ������ �����ϴ� ����

public class Ex01 {
	public static void main(String[] args) {
		// ���ǹ� if : ���ǽ��� ���̸� ���ӹ����� ����
		// # ���ӹ��� : Ư�� ������ �����ִ� ������ �ǹ� (���� �߰�ȣ �ȿ� ����ִ�)
		
		// if���� '�ܵ�'���� ��밡��!!!
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.print("����");
		}else {		// else : ���� ������ �����̸� �����ϴ� ����
			System.out.print("�̼�����");
		}
		
		System.out.println("�Դϴ�~");
		
		sc.close();
		
		// (if_1)->(if_2) vs (if ~ else)
		// �帧
		// 1. (if_1) -> (if_2) -> ���� ����
		// 2. (if ~ else) -> ���� ����
	}
}
