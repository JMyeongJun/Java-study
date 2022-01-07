package input;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름, 나이, 키, 주소, 성별을 입력 받을 변수를 선언한다
		
		// 2. 입력문으로 1번의 변수에 값을 입력 받는다
		
		// 3. 결과는 아래와 같다
		// 결과)
		// 이름 : 홍길동 (31세, 남)
		// 신장 : 181.3cm
		// 주소 : 부산 광역시 해운대구 센텀로
		
		Scanner sc = new Scanner(System.in);
		
		String name, addr;
		int age;
		double height;
		char sex;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("성별 : ");
		sex = sc.next().charAt(0);
		
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		addr = sc.nextLine();
		
		System.out.println();
		System.out.printf("이름 : %s (%d세, %c)\n", name, age, sex);
		System.out.printf("신장 : %.1fcm\n", height);
		System.out.println("주소 : " + addr);
		
		sc.close();
	}
}
