package _final;

class Super {
	
	final void show() {
		System.out.println("�κ� �޼��� �Դϴ�~");
	}
}

final class Sub extends Super {

//  - final �޼���� �����ǰ� �Ұ����ϴ� -> �θ� �ش�� �����
	
//	@Override
//	void show() {
//		System.out.println("�ڽĿ��� ������ �߾��~");
//	}
	
}

// - final Ŭ������ ����� �Ұ����ϴ� -> �� �̻��� Ȯ���� �Ұ����ϴ�

//class SSub extends Sub {
//	// The type SSub cannot subclass the final class Sub
//}


// ��ǥ���� final Ŭ���� : System, Math ��
//class MySystem extends System {
//	
//}


public class Ex02 {
	public static void main(String[] args) {
		Super sup = new Super();
		Sub sub = new Sub();
		
		sup.show();
		sub.show();
		
	}
}
