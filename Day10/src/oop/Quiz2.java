package oop;

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPo() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	Point addPo(Point p) {	// this = p1, p = p2
		int x = this.x + p.x;
		int y = this.y + p.y;
		
		Point tmp = new Point(x, y);
		
		return tmp;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Point p1 = new Point(5, 3);
		Point p2 = new Point(2, 6);
		Point p3;
		
		p1.showPo();		// (5, 3)
		p2.showPo();		// (2, 6)
		
		
		p3 = p1.addPo(p2);	// p1 + p2
		
		p3.showPo();		// (7, 9)
		
		
	}
}
