package loop;

public class Ex01 {
	public static void main(String[] args) {
		// �ݺ��� : ���ǿ� ���� �ڵ带 ����

		// while : ���ǽ��� ���̸� ���ӹ����� ����. ���ӹ����� ������ �ٽ� �������� �ö�´�!!

		int i = 1;	 // �ʱⰪ

		while (i <= 5) { 	// ���ǽ�
			System.out.println(i + " : Hello World!!!");

			i++; 	// ������
		}

		System.out.println("�ݺ� �� i = " + i);	// 6
		System.out.println();
		i = 5;

		while (i >= 1) {
			System.out.println(i + " Hello World!!!");

			i--;
		}

		System.out.println("�ݺ� �� i = " + i);
	}
}
