package casting;

// ����ȯ(casting) : ������ Ÿ��. ��, �ڷ����� ��ȯ
// 1. �ڵ� ����ȯ : ����� �߻��ϸ�, ���� �ʿ��� ū������ ��ȭ
// 2. ���� ����ȯ : �����ڰ� ���� Ÿ���� ����ؼ� ����

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("10" + "20");	// ���ڿ� + ������ �̾���̱�
		System.out.println(10 + 20);		// ���� + ������ ����
		System.out.println();
		
		System.out.println("10" + 20);	// "10" + 20 -> "10" + "20"
										// String + int -> String + String
		
		System.out.println(10 + 3.14);	// 10 + 3.14 -> 10.0 + 3.14 = 13.14	
										// int + double -> double + double
		
		int num = 10;
		double pi = 3.141592;
		
		System.out.println("num = " + num);
		// "num = " +10 -> "num = " + "10" = "num = 10"
		
		System.out.println("pi = " + pi);
		
	}
}
