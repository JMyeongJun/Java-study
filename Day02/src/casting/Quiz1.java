package casting;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. �̸� �� �� �� ������ ������ ������ �����Ѵ�
		// ��, �� �� ���� ���������� ����
		
		// 2. 1���� ������ ���� ä���
		
		// 3. ����� �Ʒ��� ����
		// ���)
		// �̸� : ȫ�浿
		// ���� : �� 70, �� 80, �� 98
		// �հ� : 248 (= 82.67)
		
		String name;
		int rnr, dud, tn;
		int sum;
		
		name = "ȫ�浿";
		rnr = 70; dud = 80; tn = 98;
		sum = rnr + dud + tn;
		
		System.out.println("�̸� : " + name);
		System.out.printf("���� : �� %d, �� %d, �� %d\n", rnr, dud, tn);
		System.out.printf("�հ� : %d (= %.2f)", sum, sum/3.0);
		System.out.println();
		
		// #�Ҽ��� ����
		// 1. ���� ����ȯ(����)
		double avg = sum / 3.0;	// 82.6666666..
		
//		avg = avg * 100;		// 8266.666666...
//		avg = (int)avg;			// 8266.0
//		avg = avg / 100;		// 82.66
		
		// ���ٷ�
		avg = (int)(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg);
		
		// 2. Math Ŭ���� ���(�ݿø�)
		avg = sum / 3.0;
		
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg);
	}
}
