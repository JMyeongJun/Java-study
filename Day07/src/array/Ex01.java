package array;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 변수 : 데이터를 저장하는 공간. 단일값
		// 배열 : 같은 자료형으로 메모리상 연속된 공간. 복수값
		
		int n = 10;
		int[] arr = new int[] {10,20,30,40,50};
							// 0  1  2  3  4	(= index, 순서번호)
		System.out.println("n = " + n);
		System.out.println("arr = " + arr + "\n");
		// ##배열을 참조 중인 arr 참조변수를 출력에 사용시 '해시코드'라는 값이 출력됨!!!
		
		// 배열에 저장된 데이터를 '요소(elements)'라고 한다
		// 요소를 참조하려면 참조변수[index] 형식으로 가능하다
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[4] = " + arr[4]);
		
		//System.out.println("arr[5] = " + arr[5]);
		// - index의 범위를 초과하는 참조는 에러~
		
		System.out.println("\narr 배열의 크기 : " + arr.length +"\n");
		
		// - 자바의 배열은 내부에 요소의 개수(= 크기)를 자체적으로 가지고 있다
		
		for(int i =0; i< arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
		
		// # Arrays 클래스 : 배열에 도움되는 클래스
		// - toString() : 전달한 배열을 문자열로 반환
		System.out.println("arr = " + Arrays.toString(arr));
		
	}
}
