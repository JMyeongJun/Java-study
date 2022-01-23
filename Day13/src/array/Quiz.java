package array;

class Airplain {
	// �°��� �¼� -> ����� �迭
	Person[] sits = new Person[5];
	
	void takeOn(Person p) {
		for (int i = 0; i < sits.length; i++) {
			if (sits[i] == null) {
				sits[i] = p;
				
				System.out.println(p.getName() + "(��)�� ž��~");
				return;
			}
		}
		
		System.out.println("�� �¼��� �����ϴ�!!!");
	}
	
	void list() {
		System.out.println("\n�¼� ��Ȳ)");
		
		for (int i = 0; i < sits.length; i++) {
			System.out.print(i + 1 + "�¼� : ");
			
			if (sits[i] != null) {
				sits[i].showInfo();
			}
			else {
				System.out.println("-- ���¼� -- ");
			}
		}
	}
}

public class Quiz {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 22);
		Person p2 = new Person("��浿", 27);
		Person p3 = new Person("�ڱ浿", 15);
		Person p4 = new Person("��浿", 37);
		
		Airplain air = new Airplain();
		
		air.takeOn(p1);		// ����⿡ ����� ž���ϴ� �޼���
		air.takeOn(p2);		// �¼�(= �迭) ���� ĭ(= null)�� ������
		air.takeOn(p3);		// �ش� �°��� ����(= ����) ��Ų��
		air.takeOn(p4);
							// ��, �¼��� ���̸� ž�� �Ұ���
		
		air.list();			// ž������ �°��� ��� ���
		
		
		
		
	}
}
