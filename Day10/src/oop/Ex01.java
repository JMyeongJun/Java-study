package oop;

class Person {
	// 필드 : 객체의 속성을 정의, 멤버 변수라고도 한다
	String name;
	int age;
	double height;
	
	// 메서드 : 객체의 기능을 정의, 멤버 함수라고도 한다
	void showInfo() {	// -> void showInfo(Person this)
		System.out.printf("%s (%d세, %.1fcm)\n", this.name, this.age, this.height);
		// this는 인스턴스를 구분하기 위해 준비된 0번째 매개변수
		// 지역 변수와 멤버 변수(필드)의 이름 겹치지 않으면 생략가능
	}
	
	void eat(String food) {		// this = p1, food = "치킨"
		System.out.printf("%s(이)가 %s(을)를 먹는다. 냠냠\n", this.name, food);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 작성한 클래스는 자바에서 사용될 수 있는 새로운 자료형이 된다
		Person p1;
		
		p1 = new Person();		// new : 인스턴스 생성 키워드. 즉, 메모리에 클래스를 생성
		
		System.out.println("p1 = " + p1);
		// 참조 변수를 바로 출력시 해시코드라는 값이 출력된다
		
		// 멤버를 접근할땐, 참조 변수와 .(dot)을 사용한다
		p1.name = "홍길동";	
		p1.age = 25;
		p1.height = 170.5;
		
		System.out.println("p1의 이름 : " + p1.name);
		System.out.println("p1의 나이 : " + p1.age);
		System.out.println("p1의 신장 : " + p1.height + "\n");
		
		p1.showInfo();	// -> showInfo(p1);
		p1.eat("치킨");	// -> eat(p1, "치킨");
	}
}
