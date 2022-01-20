package accessModifier;

import other.Human;

public class Ex03 {
	public static void main(String[] args) {
		Human h = new Human("홍길동", 17, 165.5);
		
		// h.name = "김길동";
		// - 직접 접근은 불가능 하지만
		
		h.showInfo();
		// - 제공되는 메서드로 간접 접근은 가능하다~
		
	}
}
