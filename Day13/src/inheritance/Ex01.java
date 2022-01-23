package inheritance;

// ��� : �����ִ� ��. Ŭ�������� ������ Ŭ������ ����� �����޾Ƽ� ���ο� Ŭ������ �ۼ��ϴ� ���
// - ���� �ӵ� ����
// - Ŭ������ ���� ����

// ����� ���ִ� Ŭ����	: ����, �θ�, ����, ��� Ŭ������� �Ѵ�
// ����� �޴� Ŭ����		: ����, �ڽ�, ����, �Ļ� Ŭ������� �Ѵ�

class Super {
	String sup = "�θ��� �ʵ�";
	
	void showSup() {
		System.out.println("�θ��� �޼���");
	}
}

// class Ŭ���� extends ��� ���� Ŭ����
// - extends : Ȯ�� -> ��, ����� ���� �ޱ⸸ �ϴ°� �ƴϰ� ����� Ȯ�� ��Ű�� ����
class Sub extends Super {
	String sub = "�ڽ��� �ʵ�";
	
	void showSub() {
		System.out.println("�ڽ��� �޼���");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// �θ��� �ν��Ͻ�
		// - �θ� �ڽ��� ����� �ִ�
		Super sp = new Super();
		
		System.out.println(sp.sup);
		sp.showSup();
		
		// sp.showSub();
		// - �θ�� �ڽ��� ����� �𸥴�!!!
		
		
		// �ڽ��� �ν��Ͻ�
		// - �θ��� ����� ������ �ڽ� ������ ����� �ִ�
		Sub sb = new Sub();
		
		System.out.println("\n" + sb.sup);
		sb.showSup();
		
		System.out.println(sb.sub);
		sb.showSub();
		
		
		
		
		
	}
}
