package loop;

public class Ex03 {
	public static void main(String[] args) {
		// ���� ��� : ����� �����ϴ� ����

		// 1. break : ����� ��� 'Ż��' == ����
		for (int i = 1; i <= 5; i++) {
			if (i == 5) {
				break;
			}

			System.out.print(i + " ");
		}
		System.out.println();

		// 2. continue : ����� ��� ó������ == �ٽ� �ݺ�
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}

			System.out.print(i + " ");
		}
		System.out.println();
		
		// # return : �Լ��� ��� ���� (main �Լ��� ����� ���α׷� ����)
		for (int i = 1; i <= 5; i++) {
			if (i == 5) {
				return;		// ���(for)�� �ɸ��°� �ƴ϶� main�Լ��� �ɸ���!!!
			}

			System.out.print(i + " ");
		}
		
		System.out.println("\n����� ������ �ǳ���???");
	}
}
