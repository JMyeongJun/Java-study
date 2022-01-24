package inheritance;

import other.Person;

// ��� : ������ �ۼ��� Ŭ������ ���� �޾Ƽ� ���ο� Ŭ������ �ۼ��ϴ� ���

// Ŭ���� ���� ����ȯ
// - Ŭ���������� ���� ��� �����϶��� ����ȯ�� �����ϴ�

class Student extends Person {
	private int score;
	
	Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	void study(String sub) {
		System.out.println(sub + "(��)�� �����մϴ�");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person per = new Person("ȫ�浿", 20);
		Student stu = new Student("��浿", 17, 80);
		
		System.out.println("per = " + per.showInfo());
		System.out.println("stu = " + stu.showInfo());
		// - �ڽ��� �θ��� �����
		
		stu.study("Java");
		// - �ڽ��� ����� ��� ��� ����
		
		Person tmp = new Student("�̱浿", 15, 91);
		// - �θ��� ���� ������ �ڽ��� �ν��Ͻ��� ���� �� �� �ִ�
		// - �̸�, '��ĳ����(up-casting)'�̶�� �Ѵ�
		
		System.out.println("\ntmp = " + tmp.showInfo());
		// - ��ĳ���ý� �θ��� ����� ���� ���������� 
		
		// tmp.study("Python");
		// - �ڽ��� ����� ������ �� ���� �ȴ�
		
		// �� ���°�?
		// - ��ĳ������ �ڽ� Ŭ������ �ѹ��� ��� ó���ϱ� ����
		Person[] member = new Person[] { per, stu };
		
		System.out.println("member[0] = " + member[0].showInfo());
		System.out.println("member[1] = " + member[1].showInfo());
		
		
		// ���� �������� �ٽ� ���� Ŭ������ ����� ����ϰ� �ʹ�
		// - �ٽ� ������� ������ �Ѵٰ� �ؼ�, �ٿ�ĳ����(down-casting)�̶�� �Ѵ�
		// - �� �׳� �θ��� �ν��Ͻ��� �ڽ����� �����ϴ� ���� �ƴ϶� ��ĳ���õ� ��ü�� �ٽ� ������� ������ ��
		
		// member[1].study("C���");
		// - ��ĳ���� ���̶� �ڽ��� ����� ���� �Ұ���
		
		Student tmps = (Student)member[1];
		
		tmps.study("C���");
		// - �ٿ� ĳ������ �Ǹ� �ٽ� �ڽ��� ����� ����� �� �ִ�

		// �� ���� ���� ���� ����ϴ� ���
		((Student)member[1]).study("C++");
		
	}
}
