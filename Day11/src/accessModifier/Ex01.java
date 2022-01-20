package accessModifier;

// ���� ���� ������ : Ŭ������ ����� �����ϴ� ������ �����ϴ� Ű����
// 1. private		: Ŭ���� '����'���� ���� ����
// 2. package		: ���� + '���� ��Ű��'���� ���� ����
// 3. protected		: ���� + ���� ��Ű�� + '��ӹ��� �ڽ� Ŭ����'���� ���� ����
// 4. public		: ���� + ���� ��Ű�� + ��� + �ܺ�. ��, ��𼭵� ���� ����

class Person {
	// ���� �����ڴ� �ڷ��� �տ� �ٴ´�~
	public String name;
	int age;
	private double height;
	
	Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��, %.1fcm)\n", name, age, height);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", 25, 167.3);
		
		System.out.println("p�� �̸� : " + p.name);
		System.out.println("p�� ���� : " + p.age);
		// System.out.println("p�� ���� : " + p.height);
		// - private�� ���� Ŭ���� ���ο����� ���� ����
		
		p.showInfo();
	}
}
