package operator;

// 일항 연산자 : 증감 ex) a++
// 이항 연산자 : 산술, 대입, 비교, 논리 ex) a + b
// 삼항 연산자 : 조건 ex) 조건 ? true : false

public class Ex04 {
	public static void main(String[] args) {
		// 조건 연산자 : 조건에 따라서 값을 '선택'하는 연산다
		// - 삼항 연산자라고도 한다
		
		// 형태)
		// 조건 ? 참 : 거짓
		
		int n = 10;
		
		String even = (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(n + "는 " + even);
		
	}
}
