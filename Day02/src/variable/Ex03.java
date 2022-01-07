package variable;

public class Ex03 {
	public static void main(String[] args) {
		// 직접 변수를 생성해 본다
		boolean bo = true;
		char ch = 'a';
		byte by = 127;
		short sh = 32767;
		int it = 2100000000;
		long lo = 3000000000L;
	
		// The literal 3000000000 of type int is out of range
		// 리터럴 : 변수에 저장되지 않은 데이터를 의미하고, 한번 쓰이는 임시값을 의미
		// * 리터럴은 해당 자료형의 대표 타입으로 설정된다

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
