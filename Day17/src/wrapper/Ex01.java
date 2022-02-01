package wrapper;

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = 20;
		
		// int와 Integer 사이는 연산도 가능하고
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		System.out.println("n1 + n2 = " + (n1 + n2));
		
		
		// 형변환도 바로 가능하다
		int n3 = n2;
		
		System.out.println("n3 = " + n3);
		
		// int보단 Integer가 무겁다 -> 든게 많으니까~
		// 결론) 
		// 단순한 데이터 저장만 필요시 -> 일반 자료형
		// 기타 관련 기능이 필요하거나 일반 자료형을 사용 불가시 -> Wrapper
	}
}
