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
		
		System.out.printf("%s (공 : %s)\n", 
				name, isBall);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		
		System.out.printf("\n%s가 %s를 얻었다~\n", name, ball.getType());
		
		showInfo();
	}
	
	void throwBall(Child tar) {
		tar.ball = ball;
		
		System.out.printf("\n%s가 %s에게 %s를 던졌다~\n", 
				name, tar.name, tar.ball.getType());
		
		showInfo();
		tar.showInfo();
		
		
	}
}

public class Quiz {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 구성
		Child minsu = new Child("민수");		// 멤버 : 이름, 공(= 객체) 
		Child jinho = new Child("진호");
		
		Ball ball = new Ball("야구공");
		
		minsu.showInfo(); 		// 민수 (공 : x)
		jinho.showInfo();		// 진호 (공 : x)
		
		minsu.takeBall(ball);	// 민수가 '야구공'을 얻었다~
								// 민수 (공 : 야구공)
		jinho.showInfo();		// 진호 (공 : x)
		
		
		minsu.throwBall(jinho);	// 민수가 진호에게 '야구공'을 던짐
								// 민수 (공 : x)
								// 진호 (공 : 야구공)

	}
}
