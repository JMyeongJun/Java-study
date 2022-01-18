package interaction;

// OOP는 객체 간의 상호작용을 구성된다

class Unit {
	String name;
	int hp, atk;
	
	Unit(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showInfo() {
		System.out.printf("%s (hp %d, atk %d)\n", name, hp, atk);
	}
	
	void attack(Unit tar) {	// this = war, tar = wiz
		tar.hp -= atk;
		
		System.out.printf("%s(이)가 %s(을)를 공격!!!\n", name, tar.name);
		
		tar.showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Unit war = new Unit("전사", 100, 10);
		Unit wiz = new Unit("마법사", 70, 13);
		
		war.showInfo();
		wiz.showInfo();
		System.out.println();
		
		
		war.attack(wiz);	// 전사가 마법사를 공격
		System.out.println();
		
		wiz.attack(war);
		
	}
}
