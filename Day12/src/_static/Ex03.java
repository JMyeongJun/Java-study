package _static;

class People {
	private String name;
	private int age;
	
	private static int eyes = 2;
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��, %d��)\n", name, age, eyes);
	}

	static int getEyes() {
		return eyes;
	}

	static void setEyes(int eyes) {
		People.eyes = eyes;
		
		// this.eyes = eyes;
		// - this�� �ν��Ͻ��� �����ϱ� ���� �ִ� ����
		// - ��, �ν��Ͻ� ���� ��밡���� static �޼��忡���� ��� �Ұ���!!!
		
		// System.out.println(name);
		// - ���������� ���� �޼��忡�� �Ϲ� ����� ���� �Ұ���~
	}
}

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("����� �� ���� : " + People.getEyes());
		 
		People p1 = new People("ȫ�浿", 30);
		People p2 = new People("��浿", 17);
		People p3 = new People("�̱浿", 25);
		
		People.setEyes(3);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
	}
}
