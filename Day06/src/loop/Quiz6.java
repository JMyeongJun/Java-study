package loop;

public class Quiz6 {
	public static void main(String[] args) {
		// 1 ~ 1000������ ���� ���Ͻÿ�
		// (��, 3�� ����� ����, 3�� ����̸鼭 5�� ����� ����)
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				continue;
			}
			sum += i;
			
			//����� �ڵ�
			//System.out.printf("i = %d, total = %d\n", i, sum);
		}
		System.out.println(sum);
	}
}
