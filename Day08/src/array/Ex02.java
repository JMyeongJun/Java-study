package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 2차원 배열 : 배열 안에 배열을 저장한 방식

		// 1차원 배열
		int[] arr1 = new int[] { 10, 20, 30 };

		// 2차원 배열
		int[][] arr2 = new int[][] { { 10, 20, 30 }, // 0행
				{ 11, 21, 31 }, // 1행
				{ 12, 22, 32 }, // 2행
				{ 13, 23, 33 } // 3행
				// 0 1 2 열
		};

		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");

		System.out.println("31 = " + arr2[1][2]);
		System.out.println("13 = " + arr2[3][0] + "\n");

		System.out.println("arr2크기 : " + arr2.length);
		System.out.println("arr2[0]크기 : " + arr2[0].length + "\n");

		for (int i = 0; i < arr2.length; i++) { // 행 반복
			for (int j = 0; j < arr2[i].length; j++) { // 열 반복
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
