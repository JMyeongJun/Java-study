package inheritance;

// 상속 : 물려주는 것. 클래스에는 기존의 클래스의 기능을 물려받아서 새로운 클래스를 작성하는 기법
// - 개발 속도 단축
// - 클래스의 관리 수월

// 상속을 해주는 클래스	: 상위, 부모, 슈퍼, 기반 클래스라고 한다
// 상속을 받는 클래스		: 하위, 자식, 서브, 파생 클래스라고 한다

class Super {
	String sup = "부모의 필드";
	
	void showSup() {
		System.out.println("부모의 메서드");
	}
}

// class 클래스 extends 상속 받을 클래스
// - extends : 확장 -> 즉, 상속은 물려 받기만 하는게 아니고 기능을 확장 시키기 위함
class Sub extends Super {
	String sub = "자식의 필드";
	
	void showSub() {
		System.out.println("자식의 메서드");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 부모의 인스턴스
		// - 부모 자신의 멤버만 있다
		Super sp = new Super();
		
		System.out.println(sp.sup);
		sp.showSup();
		
		// sp.showSub();
		// - 부모는 자식의 멤버를 모른다!!!
		
		
		// 자식의 인스턴스
		// - 부모의 멤버도 가지며 자식 본인의 멤버도 있다
		Sub sb = new Sub();
		
		System.out.println("\n" + sb.sup);
		sb.showSup();
		
		System.out.println(sb.sub);
		sb.showSub();
		
		
		
		
		
	}
}
