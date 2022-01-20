package accessModifier;

// 접근 제어 지시자 : 클래스의 멤버에 접근하는 정도를 지정하는 키워드
// 1. private		: 클래스 '내부'에서 접근 가능
// 2. package		: 내부 + '같은 패키지'에서 접근 가능
// 3. protected		: 내부 + 같은 패키지 + '상속받은 자식 클래스'에서 접근 가능
// 4. public		: 내부 + 같은 패키지 + 상속 + 외부. 즉, 어디서든 접근 가능

class Person {
	// 접근 지시자는 자료형 앞에 붙는다~
	public String name;
	int age;
	private double height;
	
	Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n", name, age, height);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 25, 167.3);
		
		System.out.println("p의 이름 : " + p.name);
		System.out.println("p의 나이 : " + p.age);
		// System.out.println("p의 신장 : " + p.height);
		// - private는 같은 클래스 내부에서만 접근 가능
		
		p.showInfo();
	}
}
