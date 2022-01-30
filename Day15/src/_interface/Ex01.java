package _interface;

// 인터페이스 : 추상클래스 보다 한단계 더 추상화된 형태
// - 클래스가 아니다. 따라서 Object 클래스를 상속받지 않는다
// - 내부 멤버는 모두 추상화되어 있다 -> 일반 멤버를 가질 수 없음
// - 자바에서 유일하게 다중 상속이 되는 형태

// - 주로 어떠한 클래스에 특정 기능을 '구현' 시키기 위해 사용
// ex) 비교가 가능한 클래스로 작성하고 싶을때

interface FlyAble {
	void fly();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

// 클래스의 상속은 '확장' 		-> 즉, 기능을 넓히기 위함
// 인터페이스의 상속은 '구현' 	-> 즉, 특정 기능을 클래스 만들기 위해서

class Bird extends Animal implements FlyAble {
	@Override
	public void bark() {
		System.out.println("짹짹");
	}
	
	@Override
	public void fly() {
		System.out.println("날개짓을 하며 날아간다~");
	}
}

class Airplain implements FlyAble {
	@Override
	public void fly() {
		System.out.println("엔진 소리를 내며 날아간다~");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		
		// 동물들 모여라~
		Animal[] ans = new Animal[] { dog, bird };
		
		for (int i = 0; i < ans.length; i++) {
			ans[i].bark();
			ans[i].eat("사료");
		}
		System.out.println();
		
		
		// 인터페이스는 서로 연관없는 클래스도 묶을 수 있게 해준다
		Airplain air = new Airplain();
		
		
		// 날수있는 친구들 모여라~
		FlyAble[] fa = new FlyAble[] { bird, air };
		
		for (int i = 0; i < fa.length; i++) {
			fa[i].fly();
		}
		
	}
}
