package oop;

// ������ : �ν��Ͻ��� �ʱ�ȭ�� ���ؼ� ���Ǵ� �޼���
// ��Ģ)
// 1. Ŭ������� �����ؾ� �Ѵ�
// 2. ��ȯ���� �ۼ��ϸ� �ȵȴ�
// 3. �����ڰ� �ϳ��� ������ �ڹ� �����Ϸ��� �ڵ����� �ϳ� �����ش�
//    (= �⺻ �����ڶ�� �Ѵ�)
// 4. ���� Ÿ���� �ʱ�ȭ�� �ʿ��ϸ� �����ε��� ����Ѵ�

class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human(String name) {
		this.name = name;
	}
	
	Human() {
		name = "����";
		age = -1;
	}

	void showInfo() {
		System.out.printf("%s (%d��)\n", name, age);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Human h1 = new Human("ȫ�浿", 30);
		Human h2 = new Human("��浿", 27);
		Human h3 = new Human("�ڱ浿");
		Human h4 = new Human();
		
		h1.showInfo();
		h2.showInfo();
		h3.showInfo();
		h4.showInfo();
	}
}
