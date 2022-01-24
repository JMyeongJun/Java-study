package inheritance;

import other.Person;

// 상속 : 기존에 작성된 클래스를 물려 받아서 새로운 클래스를 작성하는 방식

// 클래스 간의 형변환
// - 클래스에서는 서로 상속 관계일때만 형변환이 가능하다

class Student extends Person {
	private int score;
	
	Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	void study(String sub) {
		System.out.println(sub + "(을)를 공부합니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person per = new Person("홍길동", 20);
		Student stu = new Student("김길동", 17, 80);
		
		System.out.println("per = " + per.showInfo());
		System.out.println("stu = " + stu.showInfo());
		// - 자식은 부모의 멤버와
		
		stu.study("Java");
		// - 자신의 멤버를 모두 사용 가능
		
		Person tmp = new Student("이길동", 15, 91);
		// - 부모의 참조 변수는 자식의 인스턴스를 참조 할 수 있다
		// - 이를, '업캐스팅(up-casting)'이라고 한다
		
		System.out.println("\ntmp = " + tmp.showInfo());
		// - 업캐스팅시 부모의 멤버는 참조 가능하지만 
		
		// tmp.study("Python");
		// - 자식의 멤버는 참조할 수 없게 된다
		
		// 왜 쓰는가?
		// - 업캐스팅은 자식 클래스를 한번에 묶어서 처리하기 위함
		Person[] member = new Person[] { per, stu };
		
		System.out.println("member[0] = " + member[0].showInfo());
		System.out.println("member[1] = " + member[1].showInfo());
		
		
		// 저한 묶음에서 다시 하위 클래스의 기능을 사용하고 싶다
		// - 다시 원래대로 내려야 한다고 해서, 다운캐스팅(down-casting)이라고 한다
		// - ※ 그냥 부모의 인스턴스를 자식으로 참조하는 것이 아니라 업캐스팅된 객체를 다시 원래대로 돌리는 것
		
		// member[1].study("C언어");
		// - 업캐스팅 중이라 자식의 멤버를 참조 불가능
		
		Student tmps = (Student)member[1];
		
		tmps.study("C언어");
		// - 다운 캐스팅이 되면 다시 자식의 멤버를 사용할 수 있다

		// ※ 참조 변수 없이 사용하는 방법
		((Student)member[1]).study("C++");
		
	}
}
