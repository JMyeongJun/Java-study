package loop2;

public class Ex01 {
	public static void main(String[] args) {
		// ��ø �ݺ��� : �ݺ��� �ȿ� �� �ݺ����� �����ϴ� ���

		for (int i = 1; i <= 3; i++) {
			System.out.print(i + " : ");
			
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
