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
		System.out.printf("%s (hp : %d, �� : %d)\n", name, hp, atk);
	}
	
	void attack(Monster tar) {
		// tar.hp -= atk;	// �����ϰ� ��ģ��
		tar.setHp(tar.getHp() - atk);
		
		System.out.println("\n" + tar.getName() + "�� ����!!!");
		System.out.println(atk + "��ŭ�� ���ظ� ������");
	}
}

class Monster {
	private static String name = "���";
	private int hp = 10;			// hp�� static�̸� �� ���� ü���� ������
	private static int atk = 3;
	
	void showInfo() {
		System.out.printf("%s (hp : %d, �� : %d)\n", name, hp, atk);
	}
	
	void attackUp(int n) {
		atk += n;
		
		System.out.println("���ݷ� " + n + "��ȭ!!!");
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
		Player p = new Player("ĳ����1", 100, 5);
		
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
