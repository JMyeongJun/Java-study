package wrapper;

public class Ex02 {
	public static void main(String[] args) {
		// ���ڿ� -> ���� (= parseInt())
		
		// ���� -> ���ڿ���?
		int n1 = 10;
		double n2 = 3.14;
		
		System.out.println(n1 + n2);
		
		// String str1 = (String)n1;
		// - �Ϲ� �ڷ����� Ŭ���� ���� ����ȯ �Ұ���
		
		String str1 = Integer.toString(n1);
		String str2 = Double.toString(n2);
		
		System.out.println(str1 + str2);
		
		// �� �ļ� : �ڵ� ����ȯ�� Ȱ���Ѵ� 
		String str3 = "" + n1;
		String str4 = n2 + "";
		
		System.out.println(str3 + str4);
		
		String str5 = n1 + n2 + "";		// int + double + String
		String str6 = "" + n1 + n2;		// String + int + double
		
		System.out.println("\nstr5 = " + str5);
		System.out.println("str6 = " + str6);
		
	}
}
