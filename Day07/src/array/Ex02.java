package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 초기화된 배열 -> 크기를 작성하지 않는다
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };

		// 2. 빈 배열 -> 크기를 꼭 작성한다
		int[] arr2 = new int[3];

		System.out.println("arr1 크기 : " + arr1.length);
		System.out.println("arr2 크기 : " + arr2.length + "\n");

		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr1 = " + Arrays.toString(arr2) + "\n");
		// - 자바의 배열은 초기화 하지 않으면 각 자료형의 기본값이 할당된다

		// 기본값)
		// 정수 : 0
		// 실수 : 0.0
		// 문자 : \0
		// 논리 : false
		// 클래스 : null

	}
}
