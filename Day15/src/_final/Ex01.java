package _final;

// final : 마지막의

// 사용처)
// 1. 변수에 사용	: 변수를 상수화
// 2. 메서드에 사용	: 자식에서 오버라이딩 방지
// 3. 클래스에 사용	: 더 이상 상속이 불가능한 클래스

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		final int fn = 20;
		
		System.out.println("n = " + n + ", fn = " + fn);
		
		n = 100;
		// fn = 200;
		// - 더 이상 값의 변경이 불가능
		
		System.out.println("n = " + n + ", fn = " + fn + "\n");
		
		// ※ 값을 변화시키는 모든 연산자가 불가능
		// ex) =, +=, ++ 등
		
		// fn += 3;		// fn = fn + 3;
		// fn++;
		
		System.out.println("fn + 3 = " + (fn + 3));
		System.out.println("fn > n 결과 : " + (fn > n) + "\n");
		
		
		// 초기화 하지 않으면 최초 한번은 값의 할당이 가능하다
		final int fn2;
		
		fn2 = 200;
		
		System.out.println("fn2 = " + fn2);
		
	}
}
