package _final;

// final : ��������

// ���ó)
// 1. ������ ���	: ������ ���ȭ
// 2. �޼��忡 ���	: �ڽĿ��� �������̵� ����
// 3. Ŭ������ ���	: �� �̻� ����� �Ұ����� Ŭ����

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		final int fn = 20;
		
		System.out.println("n = " + n + ", fn = " + fn);
		
		n = 100;
		// fn = 200;
		// - �� �̻� ���� ������ �Ұ���
		
		System.out.println("n = " + n + ", fn = " + fn + "\n");
		
		// �� ���� ��ȭ��Ű�� ��� �����ڰ� �Ұ���
		// ex) =, +=, ++ ��
		
		// fn += 3;		// fn = fn + 3;
		// fn++;
		
		System.out.println("fn + 3 = " + (fn + 3));
		System.out.println("fn > n ��� : " + (fn > n) + "\n");
		
		
		// �ʱ�ȭ ���� ������ ���� �ѹ��� ���� �Ҵ��� �����ϴ�
		final int fn2;
		
		fn2 = 200;
		
		System.out.println("fn2 = " + fn2);
		
	}
}
