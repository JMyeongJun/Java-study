package method;

public class Ex03 {
	static int square(int n1, int n2) {
		return n1 * n2;
	}
	
	static double circle(double r) {
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		// �������� : ��ȯ���� ���� �ľ��ؼ� �ۼ�����~

		// 1. �� ������ �����Ͽ� �簢�� ���̸� ��ȯ�ϴ� �޼���
		int width = square(5, 7);

		System.out.println("���� : " + width);

		// 2. �Ǽ� ����(= ������)�� �����ؼ� �� ���̸� ��ȯ�ϴ� �޼���
		// ��, pi = 3.141592�� Ǯ�� �Ѵ�. �Ҽ����� 2�ڸ� ����
		double result = circle(3.3);
		
		System.out.printf("�� ���� : %.2f", result);

	}

}
