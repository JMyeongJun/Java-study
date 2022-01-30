package poly;

// ������ : �پ��� ���¸� ��ٴ� �ǹ�
// - �ϳ��� ���(�ڵ�)�� ���� �ٸ� ���� ������ �� �ִ�
// ex) ���� 	-> ���Ÿ� ����
//         	-> �ٰŸ� ����
//   		-> ���� ����

// �ڵ忡�� ������ ���� ����)
// 1. ��� ����
// 2. �������̵�

class Figure {
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("�簢���� �׸���");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("���� �׸���");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Figure fi = new Figure();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		Figure[] fg = new Figure[] { fi, tri, squ, cir };
		
		// ������� �׸�(= draw) �׷���~
		for (int i = 0; i < fg.length; i++) {
			fg[i].draw();
		}
		
	}
}
