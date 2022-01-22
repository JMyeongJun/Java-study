package accessModifier;

class Ball {
	private String type;
	
	Ball(String type) {
		this.type = type;
	}

	String getType() {
		return type;
	}
}

class Child {
	private String name;
	private Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		String isBall = (ball == null) ?  "x" : ball.getType();
		// The field Ball.type is not visible
		
		System.out.printf("%s (�� : %s)\n", 
				name, isBall);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		
		System.out.printf("\n%s�� %s�� �����~\n", name, ball.getType());
		
		showInfo();
	}
	
	void throwBall(Child tar) {
		tar.ball = ball;
		
		System.out.printf("\n%s�� %s���� %s�� ������~\n", 
				name, tar.name, tar.ball.getType());
		
		showInfo();
		tar.showInfo();
		
		
	}
}

public class Quiz {
	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 �����ϰ� Ŭ������ ����
		Child minsu = new Child("�μ�");		// ��� : �̸�, ��(= ��ü) 
		Child jinho = new Child("��ȣ");
		
		Ball ball = new Ball("�߱���");
		
		minsu.showInfo(); 		// �μ� (�� : x)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		minsu.takeBall(ball);	// �μ��� '�߱���'�� �����~
								// �μ� (�� : �߱���)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		
		minsu.throwBall(jinho);	// �μ��� ��ȣ���� '�߱���'�� ����
								// �μ� (�� : x)
								// ��ȣ (�� : �߱���)

	}
}
