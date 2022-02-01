package _interface;

import java.util.Arrays;
import java.util.Comparator;

// Comparator �������̽� : ��Ÿ �ٸ� �� ������ �ʿ��Ҷ� �����ϴ� �������̽�
// - ���� ���Ѿ��� ��� ���� ����

class Desc implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {	// o1 = ��, o2 = ��
		return o2 - o1;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {4,8,2,7,6};
		
		// �͸� Ŭ����x : 1. Ŭ������ ��� -> �ν��Ͻ� ���� -> �Ű������� ���� 
		Desc desc = new Desc();
		
		Arrays.sort(arr1, desc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		
		// �͸� Ŭ����o : 1. �ν��Ͻ� ���� -> 2. �Ű������� ����
		Comparator<Integer> de2 = (Integer o1, Integer o2) -> {
			return o1 - o2;
		};
		
		Arrays.sort(arr1, de2);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
	}
}
