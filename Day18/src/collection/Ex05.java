package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		// �迭 -> ����Ʈ
		Integer[] arr = new Integer[] { 10,20,30,40,50 };
		
		// 1. new�� �Ҵ���� ����
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		System.out.println("list = " + list);
		
		list.add(60);	// �ð� �ٰ� ����
		System.out.println("list = " + list + "\n");
		
		
		// 2. �׳� �Ѱ� ���� ����
		List<Integer> list2 = Arrays.asList(arr);
		
		System.out.println("list2 = " + list2 + "\n");
		
		// list2.add(60);	// ���� �Ұ���!
		
		
		// ����Ʈ -> �迭
		arr = list.toArray(arr);
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		
	}
}
