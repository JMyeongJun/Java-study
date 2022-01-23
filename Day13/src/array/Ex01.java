package array;

// 인스턴스도 배열로 묶어서 관리 가능

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
	
	String getName() {
		return name;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 1. 참조 변수를 배열로 작성하거나
		Person p1 = new Person("홍길동", 21);
		Person p2 = new Person("김길동", 17);
		Person p3 = new Person("이길동", 33);
		
		Person[] mem1 = new Person[] { p1, p2, p3 };
		//							    0   1   2
		
		mem1[0].showInfo();
		
		// 2. 배열에 바로 인스턴스를 생성
		Person[] mem2 = new Person[] { 
				new Person("홍길동", 45),		// 0
				new Person("김길동", 32),		// 1
				new Person("이길동", 15)		// 2
		};
		
		mem2[2].showInfo();
		
		
	}
}
