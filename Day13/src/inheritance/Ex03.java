package inheritance;

import other.Point;

class Point3D extends Point {
	private int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// �������̵� ���� �����ڵ� ��ġ���Ѿ� �ȴ�!!!
	@Override
	public String showPo() {
		return super.showPo() + ", " + z;
	}
	
	Point3D add(Point3D p) {
		int x = this.x + p.x;
		int y = this.y + p.y;
		int z = this.z + p.z;
		
		Point3D tmp = new Point3D(x, y, z);
		
		return tmp;	
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Point p1 = new Point(5, 7);
		
		System.out.printf("p1 = (%s)\n", p1.showPo());
		
		
		Point3D p2 = new Point3D(5, 7, 1);
		Point3D p3 = new Point3D(1, 2, 3);
		
		System.out.printf("p2 = (%s)\n", p2.showPo());
		System.out.printf("p3 = (%s)\n", p3.showPo());
		
		// System.out.println("p2�� x =" + p2.x);
		// - protected�� �� ��� ���� Ŭ����������!!!
		
		Point3D ps = p2.add(p3);
		
		System.out.println("ps = " + ps.showPo());
	}
}
