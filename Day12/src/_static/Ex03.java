package _static;

class People {
	private String name;
	private int age;
	
	private static int eyes = 2;
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세, %d개)\n", name, age, eyes);
	}

	static int getEyes() {
		return eyes;
	}

	static void setEyes(int eyes) {
		People.eyes = eyes;
		
		// this.eyes = eyes;
		// - this는 인스턴스를 구분하기 위해 있는 변수
		// - 즉, 인스턴스 없이 사용가능한 static 메서드에서는 사용 불가능!!!
		
		// System.out.println(name);
		// - 마찬가지로 정적 메서드에서 일반 멤버를 참조 불가능~
	}
}

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("사람의 눈 개수 : " + People.getEyes());
		 
		People p1 = new People("홍길동", 30);
		People p2 = new People("김길동", 17);
		People p3 = new People("이길동", 25);
		
		People.setEyes(3);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
	}
}
