package loop;

public class Quiz7 {
	public static void main(String[] args) {
		// ù������ 1������, ���������� ������ 2��ݾ���
		// �����ϴ� ������� �Ѵ�(30��)���� ������ �ݾ��� ���
		int deposit = 0, cash = 1;
		
		for (int i = 1; i <= 30; i++) {
			deposit += cash;
			cash *= 2;
		}
		
		System.out.println(deposit + "��");
	}
}
