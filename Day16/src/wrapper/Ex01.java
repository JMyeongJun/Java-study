package wrapper;

public class Ex01 {
	public static void main(String[] args) {
		// Wrap : 감싸다
		// Wrapper 클래스는 일반 자료형을 객체 취급하기 위한 클래스들
		
		
		// 일반 자료형				Wrapper
		// --------------------------------
		// boolean				Boolean
		// char					Character
		// byte					Byte
		// short				Short
		// int					Integer
		// long					Long
		// float				Float
		// double				Double
		
		// 사용이유)
		// 1. 문자열과 형변환을 위해서
		// 2. 객체 취급이 필요한 경우. ex) 제네릭
		
		String str1 = "10";
		String str2 = "20";
		
		System.out.println(str1 + str2);
		
		// int n1 = (int)str1;
		// - 일반 자료형과 클래스(String) 간에는 형변환이 불가능
		
		
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
