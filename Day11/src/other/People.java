package other;


// package Ŭ����
// - ���� ��Ű�������� ��� ����
// - ���ϸ�(.java)�� ���� �ʿ� ����
class Animal {
	
}


// public Ŭ����
// - ��𼭵� ��밡���� Ŭ����
// - ��, ���ϸ�� Ŭ�������� ��ġ�ؾ� �Ѵ�
public class People {
	public String name;
	int age;
	private double height;
	
	// �޼��嵵 ����̹Ƿ� ���� ���� �����ڰ� �ٴ´�
	public People(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d��, %.1fcm)\n", 
				name, age, height);
	}
}