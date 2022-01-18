package oop;

//class Person {
//	// The type Person is already defined
//	// - ���� ��Ű�� �������� Ŭ������ �����ȴ�
//}

class People {
	String name;
	int age;
	double height;
	
	// �̹����� �޼��忡 this�� ��� ����~
	void showInfo() {
		System.out.printf("%s (%d��, %.1fcm)\n", name, age, height);
	}
	
	void eat(String food) {
		System.out.printf("%s(��)�� %s(��)�� �Դ´�~\n", name, food);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		People p1 = new People();
		People p2 = new People();
		
		p1.name = "ȫ�浿";
		p1.age = 20;
		p1.height = 175.3;
		
		p2.name = "��浿";
		p2.age = 17;
		p2.height = 180.5;
		
		p1.showInfo();	// showInfo(p1);
		p2.showInfo();	// showInfo(p2);
		
		p1.eat("����");
		p2.eat("�Ź�");
	}
}
