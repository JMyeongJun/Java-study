package other;

public class Human {
	// 필드는 대부분 private로 세팅
	private String name;
	private int age;
	private double height;
	
	// 메서드는 대부분 클래스의 지시자로 세팅
	public Human(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n",
				name, age, height);
	}
	
}
