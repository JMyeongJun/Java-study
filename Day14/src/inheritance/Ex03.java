package inheritance;

import other.Person;

public class Ex03 {
	public static void main(String[] args) {
		Person[] member = new Person[] {
				new Person("홍길동", 30),
				new Student("김길동", 15, 75),
				new Doctor("이길동", 37, "내과"),
				new Police("박길동", 35, "경감")
		};
		
		
		// ※ 다운 캐스팅시 주의 사항
		// - 그냥 막 형변환을 하게 되면 형변환 예외가 발생
		
		// Police tmp = (Police)member[1];
		// - 학생을 경찰로 변환하고 있다 -> 원래의 타입과 맞지 않아서 예외 발생
		
		// 그럼, 이를 확인하는 방법이 없을까?
		// instanceof 를 사용한다 -> 결과가 boolean 타입
		
		System.out.println(member[1] instanceof Person);	// 사람 맞니? -> true
		System.out.println(member[1] instanceof Student);	// 학생 맞니? -> true
		System.out.println(member[1] instanceof Doctor);	// 의사 맞니? -> false
		System.out.println(member[1] instanceof Police);	// 경찰 맞니? -> false 
	}
}
