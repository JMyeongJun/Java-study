package operator;

public class Ex03 {
	public static void main(String[] args) {
		// �� ������ : ��/������ �����Ѵ� ������
		// and(&&), or(||), not(!)
		
		// 1. and : �� �� ��� ���̸� ����� ��
		// - �ٸ� ���� ��(*)�����̶�� �Ѵ�
		System.out.println("true  and true  ��� : " + (true && true));
		System.out.println("true  and false ��� : " + (true && false));
		System.out.println("false and true  ��� : " + (false && true));
		System.out.println("false and false ��� : " + (false && false) + "\n");
		
		// 2. or : �� �� ��� �����̸� ����� ����
		// - �ٸ� ���� ��(+)�����̶�� �Ѵ�
		System.out.println("true  or true  ��� : " + (true || true));
		System.out.println("true  or false ��� : " + (true || false));
		System.out.println("false or true  ��� : " + (false || true));
		System.out.println("false or false ��� : " + (false || false) + "\n");
		
		// 3. not : ���� ��������, ������ ������
		// - �ٸ����� ���������̶�� �Ѵ�
		System.out.println("not true  ��� : " + !true);
		System.out.println("not false ��� : " + !false);
		
	}
}
