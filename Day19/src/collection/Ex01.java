package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// 1. List : 순서o, 중복o
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		
		System.out.println("list = " + list);
		
		for (int i = 0; i < 10; i++) {
			int n = rand.nextInt(10) + 1;
			list.add(n);
		}
		
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("list = " + list);
		
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		list.sort(desc);
		System.out.println("list = " + list);
		
		
		// 2. Set : 순서x, 중복x
		Set<Integer> st = new HashSet<Integer>(list);
		
		System.out.println("st = " + st);
		
	}
}
