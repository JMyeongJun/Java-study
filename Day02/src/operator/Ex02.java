package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 대입 연산자 : 값을 할당하는 연산자
		
		// 특징)
		// 1. 대입 연산자의 좌변은 '공간', 우변은 '결과값'
		// 2. 대입 연산은 항상 우변부터 처리한다
		// 3. 대입 연산자의 양변의 자료형은 일치 시킨다
		
		int n = 10 + 2;
		
		System.out.println("n = " + n);
		
		int n1, n2, n3;
		
		n1 = n2 = n3 = 10;
		
		System.out.println("n1 =" + n1);
		System.out.println("n2 =" + n2);
		System.out.println("n3 =" + n3 + "\n");
		
		// 복합 대입 연산자 : 산술 + 대입
		// +=, -=, *=, /=, %=
		
		int num = 10;
		
		System.out.println("num + 5 = " + (num + 5));
		System.out.println("num = " + num + "\n");
		// 산술 연산은 변수에 영향을 주지 않는다
		
		num += 3;	// num = num + 3;
		System.out.println("num = " + num);
		
		num -= 5;
		System.out.println("num = " + num);
		
		num *= 2;
		System.out.println("num = " + num);
		
		num /= 4;
		System.out.println("num = " + num);
		
		num %= 6;
		System.out.println("num = " + num + "\n");
		
		///////////숙제
		int a = 7, b = 3, c = 2;
		
		a += b -= c *= 2;
		// a = a+b, b = b-c, c = c*2
		
		//1. c = c*2 = 2*2 = 4
		//2. b = b-c = 3-4 = -1
		//3. a = a+b = 7+(-1) = 6
		System.out.println("a = " + a);		//?
		System.out.println("b = " + b);		//?
		System.out.println("c = " + c);		//?
		
	}
}
