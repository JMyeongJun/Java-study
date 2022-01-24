package inheritance;

import other.Person;

// Ŭ������ ���⿡~
class Doctor extends Person {
	private String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	// �� ��ĳ���� �Ǵ��� �������̵�� �޼����
	//   �ڽ��� ���°� ����ȴ�
	@Override
	public String showInfo() {
		String result = "%s (%d��, %s)";
		
		result = String.format(result, name, age, major);
		
		return result;
	}
	
	
	// �Ű������� �θ� Ŭ������ �ۼ���
	// - �ش� Person ��ü �Ӹ� �ƴ϶� �ڽ��� ��ü�� ��� ���� �� �ִ�
	// - ��, '���'�� ġ���ϴ� �޼��尡 ��
	void cure(Person tar) {
		System.out.printf("%s(��)�� %s(��)�� �����մϴ�\n", 
				name, tar.getName());
	}
}

class Police extends Person {
	private String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	public String showInfo() {
		String result = "%s (%d��, %s)";
		result = String.format(result, name, age, rank);
		
		return result;
	}
	
	void patrol() {
		System.out.println("������ ���ϴ�~");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 �����ϰ� �϶�~
		Person[] member = new Person[] {
				new Person("ȫ�浿", 30),
				new Student("��浿", 15, 75),
				new Doctor("�̱浿", 37, "����"),
				new Police("�ڱ浿", 35, "�氨")
		};
		
		Student stu = new Student("��浿", 17, 90);
		
		// 1. �ݺ��� Ȱ���ؼ� ��� '�����'�� ������ ����϶�
		for (int i = 0; i < member.length; i++) {
			System.out.println("member[" + i + "] = " + member[i].showInfo());
		}
		
		// 2. �ڽ��� ���� ���(= �޼���)�� ����غ���
		((Student)member[1]).study("Java");
		((Doctor)member[2]).cure(stu);
		((Police)member[3]).patrol();	
		
		
	}
}
