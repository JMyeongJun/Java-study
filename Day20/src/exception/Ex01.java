package exception;

// try ~ catch : ���ܸ� ���� ó���ϴ� ����
// throws : ���ܸ� �޼��带 ȣ���ϴ� ������ �����ϴ� ����

// ���ܸ� �����ϴ� ����
// - �߻��ϴ� ���ܸ� Ư�� ��ġ�� ��Ƽ� ó���ϱ� ���� -> �������� ���

public class Ex01 {
	
	static void timer(int n) {
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "��");
			
			try {
				// ���ܸ� ���� ó�� -> �� �̻� ���ܰ� �߻����� ����
				Thread.sleep(1000);
			
			} catch(InterruptedException e) {
				System.out.println("���� �߻� : " + e.getMessage());
				
			}
		}
	}
	
	
	static void timer2(int n) throws InterruptedException {
		// 1. ���ܸ� ȣ���� ������ ���� -> main���� �Ѿ��
		
		for (int i = n; i >= 1; i--) {
			System.out.println(i + "��");
			
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		
		timer(5);
		
		// 2. ���ܰ� ���Ѱ��� �Դ� -> ���� ó�� Ȥ�� ���� 
		try {
			timer2(5);
		
		} catch(InterruptedException e) {
			System.out.println("���� �߻� : " + e.getMessage());
			
		}
	}
}
