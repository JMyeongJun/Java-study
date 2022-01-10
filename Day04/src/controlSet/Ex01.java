package controlSet;

import java.util.Scanner;

// 제어문 : 프로그램의 흐름을 제어하는 굼누
// 1. 조건문 : 조건에 따라서 코드의 흐름을 분기
// 2. 반복문 : 조건에 따라서 코드를 루프
// 3. 보조 제어문 : 위의 두 구문을 보조하는 구문

public class Ex01 {
	public static void main(String[] args) {
		// 조건문 if : 조건식이 참이면 종속문장을 수행
		// # 종속문장 : 특정 구문에 속해있는 구문을 의미 (보통 중괄호 안에 들어있다)
		
		// if문은 '단독'으로 사용가능!!!
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.print("성인");
		}else {		// else : 위의 조건이 거짓이면 수행하는 구문
			System.out.print("미성년자");
		}
		
		System.out.println("입니다~");
		
		sc.close();
		
		// (if_1)->(if_2) vs (if ~ else)
		// 흐름
		// 1. (if_1) -> (if_2) -> 다음 구문
		// 2. (if ~ else) -> 다음 구문
	}
}
