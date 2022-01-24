package inheritance;

import other.Person;

public class Ex03 {
	public static void main(String[] args) {
		Person[] member = new Person[] {
				new Person("ȫ�浿", 30),
				new Student("��浿", 15, 75),
				new Doctor("�̱浿", 37, "����"),
				new Police("�ڱ浿", 35, "�氨")
		};
		
		
		// �� �ٿ� ĳ���ý� ���� ����
		// - �׳� �� ����ȯ�� �ϰ� �Ǹ� ����ȯ ���ܰ� �߻�
		
		// Police tmp = (Police)member[1];
		// - �л��� ������ ��ȯ�ϰ� �ִ� -> ������ Ÿ�԰� ���� �ʾƼ� ���� �߻�
		
		// �׷�, �̸� Ȯ���ϴ� ����� ������?
		// instanceof �� ����Ѵ� -> ����� boolean Ÿ��
		
		System.out.println(member[1] instanceof Person);	// ��� �´�? -> true
		System.out.println(member[1] instanceof Student);	// �л� �´�? -> true
		System.out.println(member[1] instanceof Doctor);	// �ǻ� �´�? -> false
		System.out.println(member[1] instanceof Police);	// ���� �´�? -> false 
	}
}
