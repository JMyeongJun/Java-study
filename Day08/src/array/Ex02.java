package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 2���� �迭 : �迭 �ȿ� �迭�� ������ ���

		// 1���� �迭
		int[] arr1 = new int[] { 10, 20, 30 };

		// 2���� �迭
		int[][] arr2 = new int[][] { { 10, 20, 30 }, // 0��
				{ 11, 21, 31 }, // 1��
				{ 12, 22, 32 }, // 2��
				{ 13, 23, 33 } // 3��
				// 0 1 2 ��
		};

		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");

		System.out.println("31 = " + arr2[1][2]);
		System.out.println("13 = " + arr2[3][0] + "\n");

		System.out.println("arr2ũ�� : " + arr2.length);
		System.out.println("arr2[0]ũ�� : " + arr2[0].length + "\n");

		for (int i = 0; i < arr2.length; i++) { // �� �ݺ�
			for (int j = 0; j < arr2[i].length; j++) { // �� �ݺ�
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
