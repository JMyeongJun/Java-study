package wrapper;

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = 20;
		
		// int�� Integer ���̴� ���굵 �����ϰ�
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		System.out.println("n1 + n2 = " + (n1 + n2));
		
		
		// ����ȯ�� �ٷ� �����ϴ�
		int n3 = n2;
		
		System.out.println("n3 = " + n3);
		
		// int���� Integer�� ���̴� -> ��� �����ϱ�~
		// ���) 
		// �ܼ��� ������ ���常 �ʿ�� -> �Ϲ� �ڷ���
		// ��Ÿ ���� ����� �ʿ��ϰų� �Ϲ� �ڷ����� ��� �Ұ��� -> Wrapper
	}
}