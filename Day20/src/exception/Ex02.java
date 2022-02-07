package exception;

// ���� Ŭ������ ��� �޾Ƽ� ���� ���� Ŭ������ �ۼ��� ���� �ִ�~
class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}

public class Ex02 {
	// throws : ���ܸ� �����ϴ� ����
	// throw : ���ܸ� ������ �߻���Ű�� ����
	// - �ַ� ���� Ŭ������ ���� �ۼ��ϴ� ��� ����Ѵ�
	// - �ַ� ���ǹ��� �ɷ��ִ�~
	
	static void myMethod(int n) throws MyException {
		// ���� �ۼ��� �޼��忡�� �Ű������� ������ ���޵Ǹ� ���ܰ� �߻��ϰ� ������ �Ǵ�
		if (n < 0) {
			throw new MyException("���� ���� �߻���Ų ����");
		}
		
		System.out.println(n + "�� ��� �Դϴ�~");
	}
	
	public static void main(String[] args) {
		
		try {
			myMethod(-1);
		
		} catch(MyException e) {
			e.printStackTrace();
			
			System.err.println("\n���� �޼��� : " + e.getMessage());
		}
	}
}
