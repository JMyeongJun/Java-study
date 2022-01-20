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
		
		System.out.printf("%s (공 : %s)\n", name, isBall);
	}
	
	void getBall(Ball ball) {
		this.ball = ball;
		
		System.out.println("\n" + name + "가 " 
				+ ball.type + "을 얻었다");
		
		showInfo();
	}
	
	void throwBall(Child tar) {	// this = minsu, tar = jinho
		tar.ball = ball;
		ball = null;
		
		System.out.printf("\n%s가 %s에게 %s을 던짐\n", 
				name, tar.name, tar.ball.type);
		
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
		
		minsu.getBall(ball);	// 민수가 '야구공'을 얻었다~
								// 민수 (공 : 야구공)
		jinho.showInfo();		// 진호 (공 : x)
		
		
		minsu.throwBall(jinho);	// 민수가 진호에게 '야구공'을 던짐
								// 민수 (공 : x)
								// 진호 (공 : 야구공)
		
	}
}
