package operator;

public class Ex01 {
	public static void main(String[] args) {
		// ���� ������ : �ǿ����ڸ� 1���� Ȥ�� 1����
		
		int n = 10;
		
		n++;	// ��ġ : �����ڰ� �ڿ� �ٴ� ���
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		
		++n;	// ��ġ : �����ڰ� �տ� �ٴ� ���
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n + "\n");
		
		// �Ϲ������� ��ġ�� ��ġ�� ���̰� ����
		// ��, �ٸ� ����� ���� ���� ���̸� ���δ�
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;	// ��ġ : ���� ���� �� �ٸ� ������ ����
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 = 10;	// ������� ����
		
		n3 = n1++;	// ��ġ : �ٸ� ���� �� ������ ����
		System.out.println("n1 = " + n1 + ", n3 = " + n3 + "\n");
		
		// ����
		int a = 5, b = 3, c = 7, d;
		
		d = ++a + b-- + ++c;
		//    6 +3+8=17 d=17, a=6, b=2, c=8
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}
}
