package variable;

public class Ex01 {
	public static void main(String[] args) {
		// 변수 : 데이터를 저장하는 공간. 변하는 수
		
		// 변수의 선언 : 변수를 생성하는 것
		// - 자료형과 같이 선언한다.
		
		int num = 10;	// =은 대입 연산자라고 해서 우변의 결과를 좌변의 변수에 할당(= 대입)
		
		System.out.println("num");
		System.out.println(num);	// 변수의 호출 : 변수에 저장된 값을 참조
		
		num = 20;
		
		System.out.println(num);
	}
}
