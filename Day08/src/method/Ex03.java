package method;

public class Ex03 {
	static void adder(int n1, int n2) {
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
	}

	public static void main(String[] args) {
		// �޼��� ��)
		// - �޼����� �������ڿ� �Ű������� ���� �� �ڷ����� ��ġ��Ų��
		// - �Ű��������� �������ڰ� ������� ä������

		adder(5, 10);
		adder(10, 5);
		
//		// �߸��� ����)
//		adder(5);			//���� ����
//		adder(5, 10, 15);	//���� ����
//		adder(5, 10.5); 	// �ڷ��� ����ġ

	}
}
