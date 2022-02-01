package _interface;

class Computer {
	
	void connect(USB tar) {
		tar.run();
	}
}

class MemoryStick implements USB {
	@Override
	public void run() {
		System.out.println("32GB 메모리 연결. E:\\ 에 연결됨");
	}
}

class Phone implements USB {
	@Override
	public void run() {
		System.out.println("81% 충전 중 ... 탐색기에 연결할까요? (Y/N)");
	}
}

class Remocon {
	public void run() {
		System.out.println("전원 ON/OFF");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		MemoryStick mem32GB = new MemoryStick();
		Phone iphone = new Phone();
		Remocon rm = new Remocon();
		
		
		com.connect(mem32GB);
		com.connect(iphone);
		// com.connect(rm);
		// - remocon은 USB를 구현하지 않아서 매개변수 받아지지 않는다
		// - 번역 : 리모콘은 USB 단자가 없는 제품이다~
		
		
		// 일반적인 방법으로면 추상화된 객체를 생성할 수 없다
		// - 이를 바로 구현하는 방식이 있는데 '익명 클래스'라고 한다
		// - 하나의 인스턴스에만 사용 가능한 '일회용 클래스'
		// - 주로 인터페이스의 메서드를 그자리에서 바로 구현하려고 할때 사용한다
		
		USB mem64GB = new USB() {
			
			@Override
			public void run() {
				System.out.println("64GB 메모리 연결. G:\\ 연결됨");
			}
		};
		
		com.connect(mem64GB);
		
		
		// ※ 람다식 : 간략화된 식. 익명 클래스를 구현할 때 사용가능하다
		// - 단, 함수형 인터페이스만 사용 가능
		
		USB phone = () -> {
			System.out.println("95% 충전중...");
		};
		
		com.connect(phone);
		
	}
}
