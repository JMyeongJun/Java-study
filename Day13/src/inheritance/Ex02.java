package inheritance;

// ��ӿ��� �������� ȣ�� ���)
// - �ڽ��� �����ڴ� �θ��� �����ڸ� ȣ���ϰ� �Ǿ��ִ�!!!

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��)\n", name, age);
	}
	
	void eat(String food) {
		System.out.printf("%s(��)�� %s(��)�� �Դ´�\n", name, food);
	}
}

class Student extends Person {
	int score;
	
	Student(String name, int age, int score) {
		super(name, age);	// �θ��� ����� �θ𿡰�
		
		this.score = score;	// �ڽ��� ����� ���� �ʱ�ȭ
	}
	
	// �θ𿡰Լ� �������� �޼���� �ʿ��ϴٸ� '������'�� �����ϴ�
	// �̸� '�޼��� �������̵�'�̶�� �Ѵ�
	void showInfo() {
		System.out.printf("%s (%d��, %d��)\n", name, age, score);
	}
	
	// �� �����ε� VS �������̵�
	// - �����ε� 		: ���� �̸��� �޼��带 ������ �ۼ��ϴ� ��
	// - �������̵� 	: �θ��� �޼��带 ������ �ϴ� ��
	
	void study(String subject) {
		System.out.printf("%s(��)�� %s(��)�� ���� ��...\n", name, subject);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 25);
		
		p1.showInfo();
		p1.eat("ġŲ");
		
		System.out.println();
		
		Student s1 = new Student("��浿", 17, 92);
		
		// �θ𿡰� �������� �޼���
		s1.showInfo();			// 1. �������� �޼���
		s1.eat("����");			// 2. ������ ���� �޼���
		
		// 3. �ڽ��� �޼���
		s1.study("Java");		
		
		
	}
}
