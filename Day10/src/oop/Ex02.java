package oop;

//class Person {
//	// The type Person is already defined
//	// - 같은 패키지 내에서는 클래스가 공유된다
//}

class People {
	String name;
	int age;
	double height;
	
	// 이번에는 메서드에 this를 모두 생략~
	void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n", name, age, height);
	}
	
	void eat(String food) {
		System.out.printf("%s(이)가 %s(을)를 먹는다~\n", name, food);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		People p1 = new People();
		People p2 = new People();
		
		p1.name = "홍길동";
		p1.age = 20;
		p1.height = 175.3;
		
		p2.name = "김길동";
		p2.age = 17;
		p2.height = 180.5;
		
		p1.showInfo();	// showInfo(p1);
		p2.showInfo();	// showInfo(p2);
		
		p1.eat("국밥");
		p2.eat("컵밥");
	}
}
