package method;

// 함수(function) : 일정 길이의 코드를 이름지어서 저장하는 방식
// 메서드(method) : 클래스 안에 작성된 함수를 의미(= 객체 지향 개념이 포함된 함수)

public class Ex01 {
	// 메서드 선언 : 메서드를 생성한것
	static void hello() {
		for (int i = 1; i<= 5; i++) {
			System.out.println(i + " : Hello World!!");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		hello();	// 메서드 호출 : 작성한 메서드를 사용하는 것
		
		hello();	// 재사용성 : 한번 작성한 메서드는 몇번이건 사용가능
		
		// 메서드의 호출 순서)
		// 1. 호출시 먼저 현재 위치를 기억하고 실제 메서드로 이동한다
		// 2. 메서드로 이동 후 내부 종속문장을 수행한다
		// 3. 종속문장이 끝난 후 1번에서 기억한 위치로 되돌아와 남은 코드를 이어서 수행
	}
}
