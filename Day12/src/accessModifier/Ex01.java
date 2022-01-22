package accessModifier;

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// access �޼���
	// - private ����� ���������� �����ϱ� ���ؼ� �ۼ��� �޼���
	// - getter, setter��� �Ѵ�
	
	// ��� ����)
	// - ����� �ٷ� public���� �����ϸ� ��� ���������ϸ� ������ ����������
	// - �̶� getter, setter�� ����ϸ� ����� �� �� �������� ȯ�濡�� ��������
	// - getter�� ����ϸ� ������ �����ϰ�, setter�� �����ϸ� ������ �����ϴ�~
	

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		
		p1.setName("��浿");
		p1.setAge(30);
		
		System.out.println("p1�� �̸� : " + p1.getName());
		System.out.println("p1�� ���� : " + p1.getAge());
	}
}
