package _abstract;

abstract class Animal {
	
	abstract void bark();
	
	final void eat(String food) {
		System.out.println(food + "(��)�� �Դ´�. �ȳ�");
	}
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("�۸��ϰ� ¢�´�");
	}
}

class Cat extends Animal {
	
	@Override
	void bark() {
		System.out.println("�߿˾߿��ϰ� ���");
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.bark();
		dog.eat("���");
		System.out.println();
		
		Cat cat = new Cat();
		
		cat.bark();
		cat.eat("��");
		System.out.println();
		
		
		// ��Ƽ� ó�� -> ���� �̸���~
		Animal[] ans = new Animal[] { dog, cat };
		
		// �ֵ�� ���~
		for(int i = 0; i < ans.length; i++) {
			ans[i].bark();
		}
		System.out.println();
		
		// ���� �����~
		for (int i = 0; i < ans.length; i++) {
			ans[i].eat("���");
		}
		
	}
}
