package _final;

class Super {
	
	final void show() {
		System.out.println("부보 메서드 입니다~");
	}
}

final class Sub extends Super {

//  - final 메서드는 재정의가 불가능하다 -> 부모가 준대로 써야함
	
//	@Override
//	void show() {
//		System.out.println("자식에서 재정의 했어요~");
//	}
	
}

// - final 클래스는 상속이 불가능하다 -> 더 이상의 확장이 불가능하다

//class SSub extends Sub {
//	// The type SSub cannot subclass the final class Sub
//}


// 대표적인 final 클래스 : System, Math 등
//class MySystem extends System {
//	
//}


public class Ex02 {
	public static void main(String[] args) {
		Super sup = new Super();
		Sub sub = new Sub();
		
		sup.show();
		sub.show();
		
	}
}
