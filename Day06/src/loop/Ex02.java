package loop;

public class Ex02 {
	public static void main(String[] args) {
		// for�� : �ʱⰪ, ���ǽ�, �������� �Ѱ��� ���ִ� ����
		// - ����, �ݺ� Ƚ�� �ľ��� �����ϴ�

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();

		// System.out.println("�ݺ� �� i = " + i);
		// - i�� for���� '���� ����'
		// - ���� ������ �ش� ���������� ��밡���ϴ�

		for (int i = 5; i >= 1; i--) {
			System.out.println(i + " : Hello World!!!");
		}

		// for�� ���� ����
		// �ʱⰪ -> ���ǽ� -> ���ӹ��� -> ������ -> ���ǽ� -> ���� ���� -> ������ ...
	}
}
