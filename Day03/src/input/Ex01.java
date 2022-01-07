package input;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// System 클래스는 표준 입출력을 처리하는 클래스
		// 1. out은 출력에 관한 처리
		// 2. in은 입력에 관한 처리
		
		System.out.println("정수 입력 : ");
		
		int n = System.in.read();
		
		System.out.println("n = " + n);
		
		// System.in은 단독으로 사용시
		// 1. 예외 처리를 해야한다 -> 뒤에 배움
		// 2. 키값을 하나 밖에 읽지 못ㅎ나다 -> 버퍼라는 개념을 알아야 한다
		
		// 결론 : 써먹기 번거롭다~
	}
}
