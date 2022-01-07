package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 비교(=관계) 연산자 : 데이터의 대소 관계를 비교하는 연산자
		// <, >, <=, >=, ==, !=
		
		// 비교의 결과는 boolean. 즉, 참/거짓으로 얻어진다
		
		int n = 10;
		
		System.out.println("n < 20 결과 : " + (n < 20));
		System.out.println("n > 20 결과 : " + (n > 20));

		System.out.println("n < 10 결과 : " + (n < 10));
		System.out.println("n <= 20 결과 : " + (n <= 10) + "\n");
		
		System.out.println("n == 10 결과 : " + (n == 10));
		// 같으면 참, 다르면 거짓

		System.out.println("n != 10 결과 : " + (n != 10) + "\n");
		// 같으면 거짓, 다르면 참
		
		//비교의 결과는 참/거짓이기 때문에 boolean 타입에 저장 가능
		boolean result = 10 < 15;
		
		System.out.println("result = " + result);
		
	}
}
