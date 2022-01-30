package poly;

// 다형성 : 다양한 형태를 띈다는 의미
// - 하나의 명령(코드)로 서로 다른 일을 수행할 수 있다
// ex) 공격 	-> 원거리 공격
//         	-> 근거리 공격
//   		-> 마법 공격

// 코드에서 다형성 구현 조건)
// 1. 상속 관계
// 2. 오버라이딩

class Figure {
	void draw() {
		System.out.println("도형을 그린다");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Figure fi = new Figure();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		Figure[] fg = new Figure[] { fi, tri, squ, cir };
		
		// 도형들아 그림(= draw) 그려라~
		for (int i = 0; i < fg.length; i++) {
			fg[i].draw();
		}
		
	}
}
