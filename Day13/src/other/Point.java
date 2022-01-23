package other;

public class Point {
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String showPo() {
		return x + ", " + y;
	}
}
