package operator;

// ���� ������ : ���� ex) a++
// ���� ������ : ���, ����, ��, �� ex) a + b
// ���� ������ : ���� ex) ���� ? true : false

public class Ex04 {
	public static void main(String[] args) {
		// ���� ������ : ���ǿ� ���� ���� '����'�ϴ� �����
		// - ���� �����ڶ�� �Ѵ�
		
		// ����)
		// ���� ? �� : ����
		
		int n = 10;
		
		String even = (n % 2 == 0) ? "¦��" : "Ȧ��";
		
		System.out.println(n + "�� " + even);
		
	}
}
