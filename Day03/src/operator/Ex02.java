package operator;

public class Ex02 {
	public static void main(String[] args) {
		// ��(=����) ������ : �������� ��� ���踦 ���ϴ� ������
		// <, >, <=, >=, ==, !=
		
		// ���� ����� boolean. ��, ��/�������� �������
		
		int n = 10;
		
		System.out.println("n < 20 ��� : " + (n < 20));
		System.out.println("n > 20 ��� : " + (n > 20));

		System.out.println("n < 10 ��� : " + (n < 10));
		System.out.println("n <= 20 ��� : " + (n <= 10) + "\n");
		
		System.out.println("n == 10 ��� : " + (n == 10));
		// ������ ��, �ٸ��� ����

		System.out.println("n != 10 ��� : " + (n != 10) + "\n");
		// ������ ����, �ٸ��� ��
		
		//���� ����� ��/�����̱� ������ boolean Ÿ�Կ� ���� ����
		boolean result = 10 < 15;
		
		System.out.println("result = " + result);
		
	}
}
