package _abstract;

// abstract : �߻�����

// �߻� Ŭ���� : �߻����� ������ ��ü�� ǥ���� �� ����ϴ� Ŭ����
// 1. �߻����� ������ ���°� ���� -> ��, �ν��Ͻ��� ������ �� ����
// 2. �߻� �޼��带 ���� �� �ִ�(��)

// �߻� �޼��� : �����ڵ尡 ���� �޼���. ������
// 1. �ڽ� Ŭ������ ������ �������̵��� �����Ѵ� -> ������ ����
// 2. �޼��尡 ���¸� �ֱ� ������ ������ ������ ����� �� �ִ�

abstract class Figure {
	// �߻� �޼���� �߻� Ŭ������ ���� �� �ִ�
	// �� �߻� Ŭ������ �Ϲ� �޼��带 ���� �� ����
	abstract void draw();
	
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
		// Figure fi = new Figure();
		// - �߻� Ŭ������ �ν��Ͻ� ���� �Ұ��� -> ����� ���ؼ� ���
		
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		Figure[] fs = new Figure[] { tri, squ, cir };
		
		for (int i = 0; i < fs.length; i++) {
			fs[i].draw();
		}
		
		
	}
}
