package casting;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(10 / 3);
		System.out.println(10/ 3.0);
		System.out.println();
		
		int n1 = 10, n2 = 3;
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		System.out.println("n1 + n2 = " + n1 + n2);
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println();
		
		// 강제 형변환 : 해당 타입 앞에 (자료형) 형태로 사용
		
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1 / (double)n2);
		System.out.println();
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);	// 강제 형변환은 해당 위치에서 일시적으로 변화
	}
}
