package variable;

public class Ex04 {
	public static void main(String[] args) {
		// ���� �ڷ���
		// - �⺻ �ڷ����� ������ ��� Ÿ��
		// - �ַ� �ڿ� ��� Ŭ������ �ش�
		// - ���� ������ ������ ����Ű�� Ÿ��
		
		int num = 10;	// �⺻ �ڷ���
		int[] arr = new int[] {10,20,30,40,50};	// ���� �ڷ���
		
		int num2 = num;		// �⺻ �ڷ����� ���� ������ �����
		int[] arr2 = arr;	// ���� �ڷ����� ���� ������ ����Ű�� ����� ��ġ�� ����
		
		System.out.println("num = " + num);
		System.out.println("arr = " + arr);
		
	}
}
