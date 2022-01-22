package _static;

// static : 인스턴스가 공유하는 멤버 (= 클래스 자체가 가지는 멤버다)

class Person {
	// 일반 멤버 : 인스턴스 마다 따로 가지는 공간 (= 인스턴스 멤버)
	// - 인스턴스가 생성되어야 만들어지는 공간
	String name;
	int age;
	
	// 정적 멤버 : 인스턴스가 공유하는 공간 (= 클래스 멤버)
	// - 인스턴스가 없더라도 생성되는 공간
	static int eyes = 2;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세, %d개)\n", name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 정적멤버는 객체(= 인스턴스)가 없더라도 사용가능하다
		System.out.println("사람 눈 개수 : " + Person.eyes + "\n");
		
		// System.out.println("사람 이름 : " + Person.name);
		
		Person p1 = new Person("홍길동", 17);
		Person p2 = new Person("김길동", 22);
		Person p3 = new Person("고길동", 40);
		
		// p2.eyes = 3;
		// - 정적 멤버는 클래스 자체의 멤버이므로
		
		Person.eyes = 3;
		// - 클래스명으로 접근하는 것이 올바르다!!!
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}
}
