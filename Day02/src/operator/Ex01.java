package operator;

// ������ : �����͸� �����Ͽ� ���ο� �����͸� ��� ��ȣ��
// - ���, ����, ����, ��, ��, ���� ��

public class Ex01 {
	public static void main(String[] args) {
		// ��� ������ : ��Ģ������ ����
		// +, -, *, /, %
		
		System.out.println("10 + 3 = " + 10 + 3);
		System.out.println(10 + 3 + " = 10 + 3");
		System.out.println();

		System.out.println("10 + 3 = " + (10 + 3));
		System.out.println("10 - 3 = " + (10 - 3));
		System.out.println("10 * 3 = " + 10 * 3);
		System.out.println("10 / 3 = " + 10 / 3);
		System.out.println("10 / 3.0 = " + 10 / 3.0);
		System.out.println("10 % 6 = " + 10 % 6);
		System.out.println();
		
		// ������ ���ó
		// 1. ��� ����
		// 2. �ڸ��� ����
		// 3. ���� ����
		
		System.out.println("10 % 2 = " + 10 % 2);
		System.out.println("10 % 3 = " + 10 % 3);
		System.out.println();
		// �������� ���� -> ���
		// �������� �ִ� -> ��� �ƴ�
		
		System.out.println("99 % 100 = " + 99 % 100);
		System.out.println("100 % 100 = " + 100 % 100);
		System.out.println("101 % 100 = " + 101 % 100);
		System.out.println();
		// n % 100 -> 0 ~ 99
		
		// 10�� �¼��� �ڸ����� ���� ����
		int n = 123456;
		
		System.out.println("n % 10 = " + n % 10);
		System.out.println("n / 100000 = " + n / 100000);
		System.out.println("n % 10000 / 1000 = " + n % 10000 / 1000);
		System.out.println();
		
		// ����)
		int birth = 991230;
		System.out.println("���� : " + birth / 10000);		//99
		System.out.println("���� : " + birth % 10000 / 100);	//12
		System.out.println("���� : " + birth % 100);			//30
	}
}
