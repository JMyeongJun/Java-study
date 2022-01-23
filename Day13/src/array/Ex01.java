package array;

// �ν��Ͻ��� �迭�� ��� ���� ����

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��)\n", name, age);
	}
	
	String getName() {
		return name;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 1. ���� ������ �迭�� �ۼ��ϰų�
		Person p1 = new Person("ȫ�浿", 21);
		Person p2 = new Person("��浿", 17);
		Person p3 = new Person("�̱浿", 33);
		
		Person[] mem1 = new Person[] { p1, p2, p3 };
		//							    0   1   2
		
		mem1[0].showInfo();
		
		// 2. �迭�� �ٷ� �ν��Ͻ��� ����
		Person[] mem2 = new Person[] { 
				new Person("ȫ�浿", 45),		// 0
				new Person("��浿", 32),		// 1
				new Person("�̱浿", 15)		// 2
		};
		
		mem2[2].showInfo();
		
		
	}
}
