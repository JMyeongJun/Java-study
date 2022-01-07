package variable;

public class Ex04 {
	public static void main(String[] args) {
		// 참조 자료형
		// - 기본 자료형을 제외한 모든 타입
		// - 주로 뒤에 배울 클래스가 해당
		// - 실제 생성된 공간을 가리키는 타입
		
		int num = 10;	// 기본 자료형
		int[] arr = new int[] {10,20,30,40,50};	// 참조 자료형
		
		int num2 = num;		// 기본 자료형은 대입 받으면 복사됨
		int[] arr2 = arr;	// 참조 자료형은 대입 받으면 가리키는 대상의 위치를 받음
		
		System.out.println("num = " + num);
		System.out.println("arr = " + arr);
		
	}
}
