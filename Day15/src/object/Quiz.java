package object;

class Point {
	private int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}

public class Quiz {
	public static void main(String[] args) {
		// 아래코드가 동작하게 하라
		Point p1 = new Point(5, 2);
		Point p2 = new Point(2, 5);
		Point p3 = new Point(5, 2);
		
		
		System.out.println("p1 = " + p1);	// p1 = (5, 2)
		System.out.println("p2 = " + p2);	// p2 = (2, 5)
		System.out.println("p3 = " + p3);	// p3 = (5, 2)
		
		
		System.out.println("\np1 == p2 결과 : " + p1.equals(p2));		// false
		System.out.println("p1 == p3 결과 : " + p1.equals(p3));		// true
	
		
	}
}
