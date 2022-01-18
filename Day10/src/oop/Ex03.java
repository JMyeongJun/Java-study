package oop;

// 생성자 : 인스턴스의 초기화를 위해서 사용되는 메서드
// 규칙)
// 1. 클래스명과 동일해야 한다
// 2. 반환형을 작성하면 안된다
// 3. 생성자가 하나도 없으면 자바 컴파일러가 자동으로 하나 생성준다
//    (= 기본 생성자라고 한다)
// 4. 여러 타입의 초기화가 필요하면 오버로딩을 사용한다

class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human(String name) {
		this.name = name;
	}
	
	Human() {
		name = "무명";
		age = -1;
	}

	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new Human("김길동", 27);
		Human h3 = new Human("박길동");
		Human h4 = new Human();
		
		h1.showInfo();
		h2.showInfo();
		h3.showInfo();
		h4.showInfo();
	}
}
