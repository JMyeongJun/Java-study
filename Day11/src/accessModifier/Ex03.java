package accessModifier;

import other.Human;

public class Ex03 {
	public static void main(String[] args) {
		Human h = new Human("ȫ�浿", 17, 165.5);
		
		// h.name = "��浿";
		// - ���� ������ �Ұ��� ������
		
		h.showInfo();
		// - �����Ǵ� �޼���� ���� ������ �����ϴ�~
		
	}
}
