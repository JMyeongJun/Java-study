package method;

// �޼����� ����
// 1. ��ȯ���� ���� �޼��� : void�� �޼���
// 2. ��ȯ���� �ִ� �޼��� : void�� ������ ��� �ڷ���

public class Ex02 {
	// �ڷ����� void -> ��ȯ�� ���� ����!! �� �˸�
	static void adder1(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}
	
	// �ڷ����� int -> ��ȯ�� ���� ������!! �� �˸�
	static int adder2(int n1, int n2) {
		// This method must return a result of type int!
		int result = n1 + n2;
		
		return result;
		// return �� : �޼��带 ȣ���� ��ġ�� ������� �����ش�
		// - ��, �޼����� �ڷ���(= ��ȯ��)�̶� �ڷ����� ���ƾ� �Ѵ�
	}
	
	public static void main(String[] args) {
		// void�� �޼���� ������� �����Ƿ� �׳� '�̸��� ȣ��' �ؼ� ���
		adder1(10, 7);
		
		// ��ȯ���� �ִ� �޼���� ����� ������ ���Ƿ� ��! ������ ����ްų� �ٷ� ����� ������
		int result = adder2(10, 7);
		// 		   = 17;
		
		System.out.println("result = " + result + "\n");
		
		System.out.println("adder2(5, 6) = " + adder2(5, 6));
		//				  ("adder2(5, 6) = " + 11);
		
		// �޼���� ���� ���ʺ��� �����ϸ� ���� ��ġ�� �޼���� ���ʺ��� �����Ѵ�
		result = adder2(adder2(5,2), adder2(7,3));
		
		System.out.println("result = " + result);
	}
}
