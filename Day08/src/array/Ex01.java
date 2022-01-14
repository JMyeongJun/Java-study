package array;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형을 메모리상 연속된 공간
		
		int[] arr1 = new int[] {10,20,30,40,50};
		int[] arr2 = new int[3];
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2) + "\n");
		
		
		// 반복을 이용한 배열의 모든 요소 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");
		
		
		// 자바의 반복은 index를 이용한 방식도 있고
		// 요소를 하나씩 대입하며 반복하는 방식도 있다
		// 이를, for-each문이라고 한다
		for (int num : arr1) {
			System.out.println("num = " + num);
		}
		
	}
}
