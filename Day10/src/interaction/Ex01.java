package interaction;

// OOP�� ��ü ���� ��ȣ�ۿ��� �����ȴ�

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
		
		System.out.printf("%s(��)�� %s(��)�� ����!!!\n", name, tar.name);
		
		tar.showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Unit war = new Unit("����", 100, 10);
		Unit wiz = new Unit("������", 70, 13);
		
		war.showInfo();
		wiz.showInfo();
		System.out.println();
		
		
		war.attack(wiz);	// ���簡 �����縦 ����
		System.out.println();
		
		wiz.attack(war);
		
	}
}
