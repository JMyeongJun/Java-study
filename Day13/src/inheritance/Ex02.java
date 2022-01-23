package inheritance;

// 상속에서 생성자의 호출 방식)
// - 자식의 생성자는 부모의 생성자를 호출하게 되어있다!!!

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
	
	void eat(String food) {
		System.out.printf("%s(이)가 %s(을)를 먹는다\n", name, food);
	}
}

class Student extends Person {
	int score;
	
	Student(String name, int age, int score) {
		super(name, age);	// 부모의 멤버는 부모에게
		
		this.score = score;	// 자식의 멤버는 직접 초기화
	}
	
	// 부모에게서 물려받은 메서드는 필요하다면 '재정의'가 가능하다
	// 이를 '메서드 오버라이딩'이라고 한다
	void showInfo() {
		System.out.printf("%s (%d세, %d점)\n", name, age, score);
	}
	
	// ※ 오버로딩 VS 오버라이딩
	// - 오버로딩 		: 같은 이름의 메서드를 여러개 작성하는 것
	// - 오버라이딩 	: 부모의 메서드를 재정의 하는 것
	
	void study(String subject) {
		System.out.printf("%s(이)가 %s(을)를 공부 중...\n", name, subject);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 25);
		
		p1.showInfo();
		p1.eat("치킨");
		
		System.out.println();
		
		Student s1 = new Student("김길동", 17, 92);
		
		// 부모에게 물려받은 메서드
		s1.showInfo();			// 1. 재정의한 메서드
		s1.eat("엽떡");			// 2. 재정의 안한 메서드
		
		// 3. 자식의 메서드
		s1.study("Java");		
		
		
	}
}
