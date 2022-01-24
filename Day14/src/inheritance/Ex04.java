package inheritance;

// Object 클래스 : 자바의 최상위 클래스
// - 자바에서 작성한 모든 클래스는 예외없이 이 클래스를 상속받고 있다 (자동)

class People {
	private String name;
	private int age;
	private double height;
	
	People(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString() {
		String result = "%s (%d세, %.1fcm)";
		result = String.format(result, name, age, height);
		
		return result;
	}

	// hashCode : 객체가 같은 데이터인지 확인하기 위한 수
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// equals : 데이터 같은지 비교하는 메서드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		People other = (People) obj;
		
		if (age != other.age)
			return false;
		
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
			
		} 
		
		else if (!name.equals(other.name))
			return false;
		
		return true;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		People p1 = new People("홍길동", 20, 170.5);
		People p2 = new People("홍길동", 20, 170.5);
		People p3 = p1;
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString() + "\n");
		// - 참조변수를 출력에서 호출하면 -> toString()이 호출되게 되어있다
		// - 즉, 이를 오버라이딩 하면 참조변수를 원하는 형태로 출력할 수 있다
		
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		// 객체의 비교
		// - 참조변수의 비교연산은 참조 대상이 같은 비교 (= 같은 방향을 바라보는지 비교)
		// - 결론) 실제 데이터를 비교하는 것이 아니다라는 점
		System.out.println("p1 == p2 결과 : " + (p1 == p2));
		System.out.println("p1 == p3 결과 : " + (p1 == p3) + "\n");
		
		
		System.out.println("p1.equals(p2) 결과 : " + p1.equals(p2));
		System.out.println("p1.equals(p3) 결과 : " + p1.equals(p3));
	}
}
