package operator;

public class Ex01 {
	public static void main(String[] args) {
		// 증감 연산자 : 피연산자를 1증가 혹은 1감소
		
		int n = 10;
		
		n++;	// 후치 : 연산자가 뒤에 붙는 경우
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		
		++n;	// 전치 : 연산자가 앞에 붙는 경우
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n + "\n");
		
		// 일반적으로 전치와 후치는 차이가 없다
		// 단, 다른 연산과 같이 사용시 차이를 보인다
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;	// 전치 : 먼저 증감 후 다른 연산을 수행
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 = 10;	// 원래대로 돌림
		
		n3 = n1++;	// 후치 : 다른 연산 후 증감을 수행
		System.out.println("n1 = " + n1 + ", n3 = " + n3 + "\n");
		
		// 연습
		int a = 5, b = 3, c = 7, d;
		
		d = ++a + b-- + ++c;
		//    6 +3+8=17 d=17, a=6, b=2, c=8
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}
}
