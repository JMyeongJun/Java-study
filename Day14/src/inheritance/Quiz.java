package inheritance;

import other.Person;

class Airplain {
	private Person[] member = new Person[10];
	
	void takeOn(Person tar) {
		for (int i = 0; i < member.length; i++) {
			if (member[i] == null) {
				member[i] = tar;
				
				System.out.println(member[i].getName() + "���� ž��~");
				return;
			}
		}
		
		System.out.println("���� �¼��� �����ϴ�~");
	}
	
	void list() {
		System.out.println("\n�¼� ���)");
		
		for (int i = 0; i < member.length; i++) {
			System.out.print(i + 1 + "�¼� : ");
			
			if (member[i] != null) {
				System.out.println(member[i].showInfo());
			}
			else {
				System.out.println("-- ���¼� --");
			}
		}
	}
	
	void emergency(Person tar) {
		System.out.println("\n��޻�Ȳ!!! �⳻���� �ǻ縦 ã���ϴ�!!!");
		
		for (int i = 0; i < member.length; i++) {
			if (member[i] instanceof Doctor) {
				System.out.println("�ǻ�߰�!!!\n");
				
				Doctor doc = (Doctor)member[i];
				
				doc.cure(tar);
				return;
			}
		}
		
		System.out.println("�⳻�� �ǻ簡 �����ϴ�...");
	}
}

public class Quiz {
	public static void main(String[] args) {
		// �Ʒ��ڵ尡 �����ϰ� �϶�~
		Person per = new Person("ȫ�浿", 25);
		Student stu = new Student("��浿", 15, 75);
		Police pol = new Police("�̱浿", 27, "����");
		Doctor doc = new Doctor("�ڱ浿", 40, "����");
		
		Airplain air = new Airplain();
		
		air.takeOn(per);	// ����⿡ '���'�� �¿�� �޼���
		air.takeOn(stu);	// �ڸ��� ������ ž�� �Ұ����ϰ� �Ѵ� 
		air.takeOn(pol);
		air.takeOn(doc);	
		
		air.list();			// �°� ����� ����ϴ� �޼���
		
		
		air.emergency(stu);	// ��� ��Ȳ �߻� �޼���
							// - �⳻���� �ǻ縦 ã��, ���޵� '���'�� ġ���ϰ� �Ѵ�
							// - �ǻ簡 ���ٸ�, �⳻���� �ǻ簡 ���ٶ�� ����Ѵ�
	
	}
}
