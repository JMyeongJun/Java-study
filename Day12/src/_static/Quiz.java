package _static;

// Math 클래스 처럼 어디서든 사용가능한 메서드를 작성해보자~

import other.Func;

public class Quiz {
	public static void main(String[] args) {
		// 예시)
		Func.printNumber(5);
		
		
		// 문제1 : 1 ~ n까지의 합계를 반환하는 메서드
		System.out.println("결과 : " + Func.total(5));
		
		// 문제2 : 절대값을 반환하는 메서드
		System.out.println("결과 : " + Func.abs(-5));
		
		// 문제3 : 거꾸로수를 반환하는 메서드
		System.out.println("결과 : " + Func.reverse(123));
		
		// 문제4 : Func의 인스턴스를 생성 불가능하게 바꿔보자
		// 답 : 생성자를 private 처리한다
		
		// Func f = new Func();

		
	}
}
