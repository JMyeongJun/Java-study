package _abstract;

// abstract : 추상적인

// 추상 클래스 : 추상적인 개념의 객체를 표현할 때 사용하는 클래스
// 1. 추상적인 개념은 형태가 없다 -> 즉, 인스턴스를 생성할 수 없다
// 2. 추상 메서드를 가질 수 있다(★)

// 추상 메서드 : 실행코드가 없는 메서드. 껍데기
// 1. 자식 클래스에 무조건 오버라이딩을 강제한다 -> 다형성 강제
// 2. 메서드가 형태만 있기 때문에 다형성 구현에 사용할 수 있다

abstract class Figure {
	// 추상 메서드는 추상 클래스만 가질 수 있다
	// ※ 추상 클래스도 일반 메서드를 가질 수 있음
	abstract void draw();
	
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
		// Figure fi = new Figure();
		// - 추상 클래스는 인스턴스 생성 불가능 -> 상속을 위해서 사용
		
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		Figure[] fs = new Figure[] { tri, squ, cir };
		
		for (int i = 0; i < fs.length; i++) {
			fs[i].draw();
		}
		
		
	}
}
