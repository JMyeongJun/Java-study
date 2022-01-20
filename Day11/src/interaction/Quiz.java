package interaction;

class Ball {
	String type;
	
	Ball(String type) {
		this.type = type;
	}
}

class Child {
	String name;
	Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		String isBall = (ball == null) ? "x" : ball.type;
		
		System.out.printf("%s (�� : %s)\n", name, isBall);
	}
	
	void getBall(Ball ball) {
		this.ball = ball;
		
		System.out.println("\n" + name + "�� " 
				+ ball.type + "�� �����");
		
		showInfo();
	}
	
	void throwBall(Child tar) {	// this = minsu, tar = jinho
		tar.ball = ball;
		ball = null;
		
		System.out.printf("\n%s�� %s���� %s�� ����\n", 
				name, tar.name, tar.ball.type);
		
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
		
		minsu.getBall(ball);	// �μ��� '�߱���'�� �����~
								// �μ� (�� : �߱���)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		
		minsu.throwBall(jinho);	// �μ��� ��ȣ���� '�߱���'�� ����
								// �μ� (�� : x)
								// ��ȣ (�� : �߱���)
		
	}
}
