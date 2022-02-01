package _interface;

// 인터페이스의 멤버 특징)
// 1. 필드는 자동으로 public static final 속성이 지정됨
// 2. 메서드는 자동으로 public abstract 속성이 지정된다

// 즉, 모든 멤버가 추상화 되어있음 -> 구현된게 하나도 없음

@FunctionalInterface
public interface USB {
	String type = "C타입";
	
	// interface에 메서드가 하나만 있는 것을
	// '함수형 인터페이스'라고 한다
	void run();
}
