package inheritance;

class Police extends Person {
	String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	void showInfo() {
		System.out.printf("%s (%d��, %s)\n", name, age, rank);
	}
	
	void patrol() {
		System.out.printf("%s(%s)�� ������ ���ϴ�\n", name, rank);
	}
}

class Doctor extends Person {
	String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	void showInfo() {
		System.out.printf("%s (%d��, %s)\n", name, age, major);
	}
	
	void cure() {
		System.out.printf("%s(%s)�� ���Ḧ ���ϴ�\n", name, major); 
	}
}


public class Quiz {
	public static void main(String[] args) {
		// Ex02�� Person�� ��� �޾Ƽ� �Ʒ��ڵ尡 �����ϰ� �Ѵ�
		Police po = new Police("ȫ�浿", 27, "����");	// ���� �߰�
		Doctor dt = new Doctor("��浿", 35, "�ܰ�");	// ���� �߰�
		
		po.showInfo();	// ȫ�浿 (27��, ����)
		dt.showInfo();	// ��浿 (35��, ������)
		
		po.eat("��");
		dt.eat("���İ�Ƽ");
		
		po.patrol();	// ȫ�浿(����)�� ������ ���ϴ�
		dt.cure();		// ��赿(������)�� ���Ḧ ���ϴ�
		
		
	}
}
