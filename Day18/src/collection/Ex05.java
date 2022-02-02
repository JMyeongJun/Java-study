package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		// 배열 -> 리스트
		Integer[] arr = new Integer[] { 10,20,30,40,50 };
		
		// 1. new로 할당받은 공간
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		System.out.println("list = " + list);
		
		list.add(60);	// 늘고 줄고가 가능
		System.out.println("list = " + list + "\n");
		
		
		// 2. 그냥 넘겨 받은 공간
		List<Integer> list2 = Arrays.asList(arr);
		
		System.out.println("list2 = " + list2 + "\n");
		
		// list2.add(60);	// 변경 불가능!
		
		
		// 리스트 -> 배열
		arr = list.toArray(arr);
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		
	}
}
