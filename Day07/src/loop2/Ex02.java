package loop2;

public class Ex02 {
	public static void main(String[] args) {
		// �Ʒ� ������ �ݺ����Ѽ� 2�� ~ 9�ܱ��� ��µǰ� �Ѵ�
		// ��, �� ���� 9�� ������

//		for (int j = 1; j <= 9; j++) {
//			System.out.println(2 + " X " + j + " = " + 2 * j);
//		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
