package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 1. �ʱ�ȭ�� �迭 -> ũ�⸦ �ۼ����� �ʴ´�
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };

		// 2. �� �迭 -> ũ�⸦ �� �ۼ��Ѵ�
		int[] arr2 = new int[3];

		System.out.println("arr1 ũ�� : " + arr1.length);
		System.out.println("arr2 ũ�� : " + arr2.length + "\n");

		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr1 = " + Arrays.toString(arr2) + "\n");
		// - �ڹ��� �迭�� �ʱ�ȭ ���� ������ �� �ڷ����� �⺻���� �Ҵ�ȴ�

		// �⺻��)
		// ���� : 0
		// �Ǽ� : 0.0
		// ���� : \0
		// �� : false
		// Ŭ���� : null

	}
}
