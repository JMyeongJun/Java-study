package variable;

public class Ex03 {
	public static void main(String[] args) {
		// ���� ������ ������ ����
		boolean bo = true;
		char ch = 'a';
		byte by = 127;
		short sh = 32767;
		int it = 2100000000;
		long lo = 3000000000L;
	
		// The literal 3000000000 of type int is out of range
		// ���ͷ� : ������ ������� ���� �����͸� �ǹ��ϰ�, �ѹ� ���̴� �ӽð��� �ǹ�
		// * ���ͷ��� �ش� �ڷ����� ��ǥ Ÿ������ �����ȴ�

		float fl = 3.141592F;
		double db = 6.123456789;
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("it = " + it);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
		
	}
}
