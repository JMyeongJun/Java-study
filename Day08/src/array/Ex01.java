package array;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// �迭 : ���� �ڷ����� �޸𸮻� ���ӵ� ����
		
		int[] arr1 = new int[] {10,20,30,40,50};
		int[] arr2 = new int[3];
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2) + "\n");
		
		
		// �ݺ��� �̿��� �迭�� ��� ��� ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");
		
		
		// �ڹ��� �ݺ��� index�� �̿��� ��ĵ� �ְ�
		// ��Ҹ� �ϳ��� �����ϸ� �ݺ��ϴ� ��ĵ� �ִ�
		// �̸�, for-each���̶�� �Ѵ�
		for (int num : arr1) {
			System.out.println("num = " + num);
		}
		
	}
}
