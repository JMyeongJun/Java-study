package method;

public class Ex02 {
	
	// �Ű�����(parameter) : ���޹��� ���� �����ϴ� ����
	static void hello(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Ex01�� hello() �޼���� �׻� 5���� ��� -> �������� ���ϴ�
		
		hello(6);	// ��������(arguments) : �޼��� ȣ��� �޼��忡 �����ϴ� ������
		
		hello(10);
		
		hello(1);
		
//		// # �޼�����)
//		// - �޼����� �������ڿ� �Ű������� �׻� ���� �� �ڷ����� ��ġ��Ų��
//		
//		hello();	// �������� ����
//		hello(1,2);	// �������� ����
//		hello(3.0); // �ڷ��� ����ġ
		
	}
}
