package wrapper;

public class Ex01 {
	public static void main(String[] args) {
		// Wrap : ���δ�
		// Wrapper Ŭ������ �Ϲ� �ڷ����� ��ü ����ϱ� ���� Ŭ������
		
		
		// �Ϲ� �ڷ���				Wrapper
		// --------------------------------
		// boolean				Boolean
		// char					Character
		// byte					Byte
		// short				Short
		// int					Integer
		// long					Long
		// float				Float
		// double				Double
		
		// �������)
		// 1. ���ڿ��� ����ȯ�� ���ؼ�
		// 2. ��ü ����� �ʿ��� ���. ex) ���׸�
		
		String str1 = "10";
		String str2 = "20";
		
		System.out.println(str1 + str2);
		
		// int n1 = (int)str1;
		// - �Ϲ� �ڷ����� Ŭ����(String) ������ ����ȯ�� �Ұ���
		
		
		int n1 = Integer.parseInt(str1);
		// int parseInt(String s)
		
		int n2 = Integer.parseInt(str2);
		
		System.out.println(n1 + n2);
		
		
		double d1 = Double.parseDouble("3.14");
		double d2 = Double.parseDouble(str1);
		
		System.out.println(d1 + d2);
		
		
		System.out.println("\nn1 = " + n1);
		System.out.println("n1 = " + Integer.toHexString(n1));
	}
}
