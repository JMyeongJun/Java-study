package wrapper;


class Point<T> {
	T x, y;
	
	Point(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Point p1 = new Point(5, 7);		// -> 제네릭을 지정하지 않음 == Object로 멤버를 생성
		
		Point<Integer> p2 = new Point<Integer>(5, 7);
		Point<Double> p3 = new Point<Double>(3.14, 5.3);
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		
		Person per1 = new Person("홍길동", 15);
		Person per2 = new Person("김길동", 31);
		
		Point<Person> p4 = new Point<Person>(per1, per2);
		
		System.out.println("p4 = " + p4);
		p4.x.eat("라면");
		
		
		// 자료형을 명시하지 않은 경우 -> 다운캐스팅이 자동 적용되지 않음
		Point p5 = new Point(per1, per2);
		
		System.out.println("\np5 = " + p5);
		((Person)p5.x).eat("짜장면");
	}
}
