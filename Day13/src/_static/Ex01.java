package _static;

class Player {
	private String name;
	private int hp, atk;
	
	Player(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showInfo() {
		System.out.printf("%s (hp : %d, 공 : %d)\n", name, hp, atk);
	}
	
	void attack(Monster tar) {
		// tar.hp -= atk;	// 가능하게 고친다
		tar.setHp(tar.getHp() - atk);
		
		System.out.println("\n" + tar.getName() + "을 공격!!!");
		System.out.println(atk + "만큼의 피해를 입혔다");
	}
}

class Monster {
	private static String name = "잡몹";
	private int hp = 10;			// hp가 static이면 다 같이 체력이 빠진다
	private static int atk = 3;
	
	void showInfo() {
		System.out.printf("%s (hp : %d, 공 : %d)\n", name, hp, atk);
	}
	
	void attackUp(int n) {
		atk += n;
		
		System.out.println("공격력 " + n + "강화!!!");
	}
	
	int getHp() {
		return hp;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
	
	String getName() {
		return name;
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Player p = new Player("캐릭터1", 100, 5);
		
		Monster m1 = new Monster();
		Monster m2 = new Monster();
		Monster m3 = new Monster();
		
		p.showInfo();
		
		m1.attackUp(3);
		
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
		
		p.attack(m1);
		
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
	}
}
