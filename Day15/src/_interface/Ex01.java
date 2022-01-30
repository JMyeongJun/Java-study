package _interface;

// �������̽� : �߻�Ŭ���� ���� �Ѵܰ� �� �߻�ȭ�� ����
// - Ŭ������ �ƴϴ�. ���� Object Ŭ������ ��ӹ��� �ʴ´�
// - ���� ����� ��� �߻�ȭ�Ǿ� �ִ� -> �Ϲ� ����� ���� �� ����
// - �ڹٿ��� �����ϰ� ���� ����� �Ǵ� ����

// - �ַ� ��� Ŭ������ Ư�� ����� '����' ��Ű�� ���� ���
// ex) �񱳰� ������ Ŭ������ �ۼ��ϰ� ������

interface FlyAble {
	void fly();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
}

// Ŭ������ ����� 'Ȯ��' 		-> ��, ����� ������ ����
// �������̽��� ����� '����' 	-> ��, Ư�� ����� Ŭ���� ����� ���ؼ�

class Bird extends Animal implements FlyAble {
	@Override
	public void bark() {
		System.out.println("±±");
	}
	
	@Override
	public void fly() {
		System.out.println("�������� �ϸ� ���ư���~");
	}
}

class Airplain implements FlyAble {
	@Override
	public void fly() {
		System.out.println("���� �Ҹ��� ���� ���ư���~");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		
		// ������ �𿩶�~
		Animal[] ans = new Animal[] { dog, bird };
		
		for (int i = 0; i < ans.length; i++) {
			ans[i].bark();
			ans[i].eat("���");
		}
		System.out.println();
		
		
		// �������̽��� ���� �������� Ŭ������ ���� �� �ְ� ���ش�
		Airplain air = new Airplain();
		
		
		// �����ִ� ģ���� �𿩶�~
		FlyAble[] fa = new FlyAble[] { bird, air };
		
		for (int i = 0; i < fa.length; i++) {
			fa[i].fly();
		}
		
	}
}
