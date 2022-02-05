package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex05 {
	public static void main(String[] args) {
		// List, Set의 람다식 출력을 살펴보자
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach((Integer v) -> System.out.println("v : " + v));
		System.out.println();
		
		
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		hs.forEach((Integer v) -> System.out.println("v : " + v));
		System.out.println();
		
		
		// 정렬도 가능한데, 주의사항!!!
		// 1. {}를 작성하지 않는다
		// 2. return을 작성하지 않고 연산식만 작성한다
		list.sort((Integer o1, Integer o2) -> o2 - o1);
		
		System.out.println("list = " + list);
	}
}
