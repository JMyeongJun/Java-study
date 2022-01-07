package variable;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. main함수 생성
		// 2. 이름 나이 키 주소를 저장할 변수를 선언한다.
		// 3. 2번에 선언한 변수에 값을 채운다
		// 채운 결과는 아래와 같이 출력된다
		// 결과)
		// 이름 : 홍길동 (23세)
		// 신장 : 175.5cm
		// 주소 : 서울 특별시 종로구
		
		String name, addr;
		int age;
		double height;
		
		name = "홍길동";
		addr = "서울 특별시 종로구";
		age = 23;
		height = 175.5;
		
		System.out.println("이름 : " + name + "(" + age + "세)");
		System.out.println("신장 : " + height);
		System.out.println("주소 : " + addr);
				
		// # printf() : %s, %d, %f, %c 정도만 알아두자
		System.out.printf("이름 : %s (%d세)\n", name, age);
		System.out.printf("신장 : %f cm\n", height);
		System.out.printf("신장 : %.1f cm\n", height);
		System.out.printf("주소 : %s\n", addr);
	}
}
