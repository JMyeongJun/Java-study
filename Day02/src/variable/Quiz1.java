package variable;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. main�Լ� ����
		// 2. �̸� ���� Ű �ּҸ� ������ ������ �����Ѵ�.
		// 3. 2���� ������ ������ ���� ä���
		// ä�� ����� �Ʒ��� ���� ��µȴ�
		// ���)
		// �̸� : ȫ�浿 (23��)
		// ���� : 175.5cm
		// �ּ� : ���� Ư���� ���α�
		
		String name, addr;
		int age;
		double height;
		
		name = "ȫ�浿";
		addr = "���� Ư���� ���α�";
		age = 23;
		height = 175.5;
		
		System.out.println("�̸� : " + name + "(" + age + "��)");
		System.out.println("���� : " + height);
		System.out.println("�ּ� : " + addr);
				
		// # printf() : %s, %d, %f, %c ������ �˾Ƶ���
		System.out.printf("�̸� : %s (%d��)\n", name, age);
		System.out.printf("���� : %f cm\n", height);
		System.out.printf("���� : %.1f cm\n", height);
		System.out.printf("�ּ� : %s\n", addr);
	}
}
