package array;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// ���� : �����͸� �����ϴ� ����. ���ϰ�
		// �迭 : ���� �ڷ������� �޸𸮻� ���ӵ� ����. ������
		
		int n = 10;
		int[] arr = new int[] {10,20,30,40,50};
							// 0  1  2  3  4	(= index, ������ȣ)
		System.out.println("n = " + n);
		System.out.println("arr = " + arr + "\n");
		// ##�迭�� ���� ���� arr ���������� ��¿� ���� '�ؽ��ڵ�'��� ���� ��µ�!!!
		
		// �迭�� ����� �����͸� '���(elements)'��� �Ѵ�
		// ��Ҹ� �����Ϸ��� ��������[index] �������� �����ϴ�
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[4] = " + arr[4]);
		
		//System.out.println("arr[5] = " + arr[5]);
		// - index�� ������ �ʰ��ϴ� ������ ����~
		
		System.out.println("\narr �迭�� ũ�� : " + arr.length +"\n");
		
		// - �ڹ��� �迭�� ���ο� ����� ����(= ũ��)�� ��ü������ ������ �ִ�
		
		for(int i =0; i< arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
		
		// # Arrays Ŭ���� : �迭�� ����Ǵ� Ŭ����
		// - toString() : ������ �迭�� ���ڿ��� ��ȯ
		System.out.println("arr = " + Arrays.toString(arr));
		
	}
}
