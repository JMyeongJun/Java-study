package oop;

class Person {
	// �ʵ� : ��ü�� �Ӽ��� ����, ��� ������� �Ѵ�
	String name;
	int age;
	double height;
	
	// �޼��� : ��ü�� ����� ����, ��� �Լ���� �Ѵ�
	void showInfo() {	// -> void showInfo(Person this)
		System.out.printf("%s (%d��, %.1fcm)\n", this.name, this.age, this.height);
		// this�� �ν��Ͻ��� �����ϱ� ���� �غ�� 0��° �Ű�����
		// ���� ������ ��� ����(�ʵ�)�� �̸� ��ġ�� ������ ��������
	}
	
	void eat(String food) {		// this = p1, food = "ġŲ"
		System.out.printf("%s(��)�� %s(��)�� �Դ´�. �ȳ�\n", this.name, food);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// �ۼ��� Ŭ������ �ڹٿ��� ���� �� �ִ� ���ο� �ڷ����� �ȴ�
		Person p1;
		
		p1 = new Person();		// new : �ν��Ͻ� ���� Ű����. ��, �޸𸮿� Ŭ������ ����
		
		System.out.println("p1 = " + p1);
		// ���� ������ �ٷ� ��½� �ؽ��ڵ��� ���� ��µȴ�
		
		// ����� �����Ҷ�, ���� ������ .(dot)�� ����Ѵ�
		p1.name = "ȫ�浿";	
		p1.age = 25;
		p1.height = 170.5;
		
		System.out.println("p1�� �̸� : " + p1.name);
		System.out.println("p1�� ���� : " + p1.age);
		System.out.println("p1�� ���� : " + p1.height + "\n");
		
		p1.showInfo();	// -> showInfo(p1);
		p1.eat("ġŲ");	// -> eat(p1, "ġŲ");
	}
}
