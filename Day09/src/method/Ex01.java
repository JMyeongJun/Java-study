package method;

public class Ex01 {
	static void adder(int n1, int n2) {
		System.out.println("n1 = " + n1 + ", n2 = " + n2);

		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
	}

	public static void main(String[] args) {
		// �޼��� : ���� ������ �ڵ带 �̸����� �����ؼ� ����ϴ� ���
		// - �ڵ��� �ߺ� ����, ���뼺 ����

		adder(5, 2);

		adder(2, 5);

		adder(3, 3);
	}
}
