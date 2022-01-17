package method;

// �޼��� �����ε�(overloading) : ���� �̸��� �޼��带 ������ �ۼ��ϴ� ���
// overload : �����ϴ�, �������ϴ�
// ��, �ϳ��� �޼��忡 ��(= �ڵ�)�� ���� �شٴ� �ǹ�

// ��Ģ)
// 1. �޼����� �̸��� ���ƾ� �Ѵ�
// 2. �Ű������� ���°� �޶�� �Ѵ� (= ������ �ٸ��ų� �ڷ����� �ٸ��� ��

// # ��ȯ���� �����ε� ������ ���� �ʴ´�

// # ���߿� Ŭ������ �����ڶ�� �޼���� Ŭ������ �̸��� �����ϰ� ����ؾ� �Ѵ�
//  ��, �̸��� �ٲ� �� ���ٴ� �ǹ�

public class Ex05 {

	static int adder() {
		return 100 + 50;
	}

	static int adder(int n) {
		return n + 50;
	}
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}

	public static void main(String[] args) {
		System.out.println("adder() = " + adder());
		System.out.println("adder(10) = " + adder(10));
		System.out.println("adder(10, 5) = " + adder(10, 5));
		
		System.out.println("adder(10) = " + adder(10.0));
	}
}
