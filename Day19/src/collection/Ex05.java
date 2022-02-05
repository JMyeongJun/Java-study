package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex05 {
	public static void main(String[] args) {
		// List, Set�� ���ٽ� ����� ���캸��
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach((Integer v) -> System.out.println("v : " + v));
		System.out.println();
		
		
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		hs.forEach((Integer v) -> System.out.println("v : " + v));
		System.out.println();
		
		
		// ���ĵ� �����ѵ�, ���ǻ���!!!
		// 1. {}�� �ۼ����� �ʴ´�
		// 2. return�� �ۼ����� �ʰ� ����ĸ� �ۼ��Ѵ�
		list.sort((Integer o1, Integer o2) -> o2 - o1);
		
		System.out.println("list = " + list);
	}
}
