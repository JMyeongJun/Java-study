package other;


// package 클래스
// - 같은 패키지에서만 사용 가능
// - 파일명(.java)과 같을 필요 없다
class Animal {
	
}


// public 클래스
// - 어디서든 사용가능한 클래스
// - 단, 파일명과 클래스명이 일치해야 한다
public class People {
	public String name;
	int age;
	private double height;
	
	// 메서드도 멤버이므로 접근 제어 지시자가 붙는다
	public People(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n", 
				name, age, height);
	}
}