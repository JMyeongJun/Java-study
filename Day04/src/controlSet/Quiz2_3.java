package controlSet;

import java.util.Scanner;

public class Quiz2_3 {
	public static void main(String[] args) {

		// 3. ������ 10 ������ �̸��� ��� �� �� �̵� �ð��� 2�� �ҿ�Ǹ�,
		// 10 �������� ������ 4�� �ҿ�ȴ� .
		// ������ ���� �Է��ϸ� �ҿ�ð��� ����Ͽ� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);
		int station, time;
		String hour = "";

		System.out.print("������ �� : ");
		station = sc.nextInt();

		if (station >= 10) {
			time = station * 4;
		} else {
			time = station * 2;
		}

		if (time >= 60) {
			hour = Integer.toString(time / 60) + "�ð� ";
		}

		System.out.printf("�� �ҿ�ð��� %s%d�� �Դϴ�.", hour, time % 60);

		sc.close();
	}
}
