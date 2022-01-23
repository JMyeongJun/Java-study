package inheritance;

class Police extends Person {
	String rank;
	
	Police(String name, int age, String rank) {
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	void showInfo() {
		System.out.printf("%s (%d세, %s)\n", name, age, rank);
	}
	
	void patrol() {
		System.out.printf("%s(%s)이 순찰을 돕니다\n", name, rank);
	}
}

class Doctor extends Person {
	String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	void showInfo() {
		System.out.printf("%s (%d세, %s)\n", name, age, major);
	}
	
	void cure() {
		System.out.printf("%s(%s)이 진료를 봅니다\n", name, major); 
	}
}


public class Quiz {
	public static void main(String[] args) {
		// Ex02의 Person을 상속 받아서 아래코드가 동작하게 한다
		Police po = new Police("홍길동", 27, "순경");	// 직급 추가
		Doctor dt = new Doctor("김길동", 35, "외과");	// 전공 추가
		
		po.showInfo();	// 홍길동 (27세, 순경)
		dt.showInfo();	// 김길동 (35세, 내과의)
		
		po.eat("빵");
		dt.eat("스파게티");
		
		po.patrol();	// 홍길동(순경)이 순찰을 돕니다
		dt.cure();		// 김김동(내과의)이 진료를 봅니다
		
		
	}
}
