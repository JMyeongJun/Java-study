package other;

public class Human {
	// �ʵ�� ��κ� private�� ����
	private String name;
	private int age;
	private double height;
	
	// �޼���� ��κ� Ŭ������ �����ڷ� ����
	public Human(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d��, %.1fcm)\n",
				name, age, height);
	}
	
}
