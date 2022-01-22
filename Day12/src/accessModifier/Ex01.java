package accessModifier;

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// access 메서드
	// - private 멤버를 간접적으로 접근하기 위해서 작성한 메서드
	// - getter, setter라고 한다
	
	// 사용 이유)
	// - 멤버를 바로 public으로 공개하면 모두 수정가능하며 참조도 가능해진다
	// - 이때 getter, setter를 사용하면 멤버를 좀 더 제한적인 환경에서 제공가능
	// - getter만 사용하면 참조만 가능하고, setter만 제공하면 수정만 가능하다~
	

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 22);
		
		p1.setName("김길동");
		p1.setAge(30);
		
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 나이 : " + p1.getAge());
	}
}
