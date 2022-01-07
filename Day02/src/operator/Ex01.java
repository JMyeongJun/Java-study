package operator;

// 연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
// - 산술, 대입, 증감, 비교, 논리, 조건 등

public class Ex01 {
	public static void main(String[] args) {
		// 산살 연산자 : 사칙연산을 수행
		// +, -, *, /, %
		
		System.out.println("10 + 3 = " + 10 + 3);
		System.out.println(10 + 3 + " = 10 + 3");
		System.out.println();

		System.out.println("10 + 3 = " + (10 + 3));
		System.out.println("10 - 3 = " + (10 - 3));
		System.out.println("10 * 3 = " + 10 * 3);
		System.out.println("10 / 3 = " + 10 / 3);
		System.out.println("10 / 3.0 = " + 10 / 3.0);
		System.out.println("10 % 6 = " + 10 % 6);
		System.out.println();
		
		// 나머지 사용처
		// 1. 배수 구분
		// 2. 자리수 추출
		// 3. 범위 제한
		
		System.out.println("10 % 2 = " + 10 % 2);
		System.out.println("10 % 3 = " + 10 % 3);
		System.out.println();
		// 나머지가 없다 -> 배수
		// 나머지가 있다 -> 배수 아님
		
		System.out.println("99 % 100 = " + 99 % 100);
		System.out.println("100 % 100 = " + 100 % 100);
		System.out.println("101 % 100 = " + 101 % 100);
		System.out.println();
		// n % 100 -> 0 ~ 99
		
		// 10의 승수로 자리수를 추출 가능
		int n = 123456;
		
		System.out.println("n % 10 = " + n % 10);
		System.out.println("n / 100000 = " + n / 100000);
		System.out.println("n % 10000 / 1000 = " + n % 10000 / 1000);
		System.out.println();
		
		// 연습)
		int birth = 991230;
		System.out.println("생년 : " + birth / 10000);		//99
		System.out.println("생월 : " + birth % 10000 / 100);	//12
		System.out.println("생일 : " + birth % 100);			//30
	}
}
