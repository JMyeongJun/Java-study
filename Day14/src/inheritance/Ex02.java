package inheritance;

import other.Person;

// 클래스는 여기에~
class Doctor extends Person {
	private String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	// ※ 업캐스팅 되더라도 오버라이드된 메서드는
	//   자식의 형태가 실행된다
	@Override
	public String showInfo() {
		String result = "%s (%d세, %s)";
		
		result = String.format(result, name, age, major);
		
		return result;
	}
	
	
	// 매개변수를 부모 클래스로 작성시
	// - 해당 Person 객체 뿐만 아니라 자식의 객체를 모두 받을 수 있다
	// - 즉, '사람'을 치료하는 메서드가 됨
	void cure(Person tar) {
		System.out.printf("%s(이)가 %s(을)를 진료합니다\n", 
				name, tar.getName());
	}
}

class Police extends Person {
	private String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	public String showInfo() {
		String result = "%s (%d세, %s)";
		result = String.format(result, name, age, rank);
		
		return result;
	}
	
	void patrol() {
		System.out.println("순찰을 돕니다~");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 하라~
		Person[] member = new Person[] {
				new Person("홍길동", 30),
				new Student("김길동", 15, 75),
				new Doctor("이길동", 37, "내과"),
				new Police("박길동", 35, "경감")
		};
		
		Student stu = new Student("장길동", 17, 90);
		
		// 1. 반복을 활용해서 모든 '사람들'의 정보를 출려하라
		for (int i = 0; i < member.length; i++) {
			System.out.println("member[" + i + "] = " + member[i].showInfo());
		}
		
		// 2. 자식의 고유 기능(= 메서드)를 사용해보자
		((Student)member[1]).study("Java");
		((Doctor)member[2]).cure(stu);
		((Police)member[3]).patrol();	
		
		
	}
}
