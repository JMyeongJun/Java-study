package accessModifier;

import other.People;

// import other.Animal;
// - package 클래스는 외부에서 import 불가능~

public class Ex02 {
	public static void main(String[] args) {
		People p = new People("홍길동", 23, 170.3);
		
		System.out.println("p의 이름 : " + p.name);
		// System.out.println("p의 나이 : " + p.age);
		// System.out.println("p의 신장 : " + p.height);
		
		// package 속성은 외부에서 접근 불가능!!!
		
		p.showInfo();
	}
}
