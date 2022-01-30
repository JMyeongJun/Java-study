package _abstract;

abstract class Animal {
	
	abstract void bark();
	
	final void eat(String food) {
		System.out.println(food + "(À»)¸¦ ¸Ô´Â´Ù. ³È³È");
	}
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("¸Û¸ÛÇÏ°í Â¢´Â´Ù");
	}
}

class Cat extends Animal {
	
	@Override
	void bark() {
		System.out.println("¾ß¿Ë¾ß¿ËÇÏ°í ¿î´Ù");
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.bark();
		dog.eat("»ç·á");
		System.out.println();
		
		Cat cat = new Cat();
		
		cat.bark();
		cat.eat("Ãò¸£");
		System.out.println();
		
		
		// ¸ð¾Æ¼­ Ã³¸® -> ¾êµé¾Æ ÀÌ¸®¿Í~
		Animal[] ans = new Animal[] { dog, cat };
		
		// ¾Öµé¾Æ Àç·Õ~
		for(int i = 0; i < ans.length; i++) {
			ans[i].bark();
		}
		System.out.println();
		
		// ¾êµé¾Æ ¹ä¸ÔÀÚ~
		for (int i = 0; i < ans.length; i++) {
			ans[i].eat("»ç·á");
		}
		
	}
}
