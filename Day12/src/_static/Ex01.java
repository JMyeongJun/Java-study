package _static;

// static : �ν��Ͻ��� �����ϴ� ��� (= Ŭ���� ��ü�� ������ �����)

class Person {
	// �Ϲ� ��� : �ν��Ͻ� ���� ���� ������ ���� (= �ν��Ͻ� ���)
	// - �ν��Ͻ��� �����Ǿ�� ��������� ����
	String name;
	int age;
	
	// ���� ��� : �ν��Ͻ��� �����ϴ� ���� (= Ŭ���� ���)
	// - �ν��Ͻ��� ������ �����Ǵ� ����
	static int eyes = 2;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��, %d��)\n", name, age, eyes);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// ��������� ��ü(= �ν��Ͻ�)�� ������ ��밡���ϴ�
		System.out.println("��� �� ���� : " + Person.eyes + "\n");
		
		// System.out.println("��� �̸� : " + Person.name);
		
		Person p1 = new Person("ȫ�浿", 17);
		Person p2 = new Person("��浿", 22);
		Person p3 = new Person("��浿", 40);
		
		// p2.eyes = 3;
		// - ���� ����� Ŭ���� ��ü�� ����̹Ƿ�
		
		Person.eyes = 3;
		// - Ŭ���������� �����ϴ� ���� �ùٸ���!!!
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}
}
