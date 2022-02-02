package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// Set의 가장 큰 특징은 중복을 걸러준다는 점
		
		Random ran = new Random();
		int n;
		
		// 1. List -> Set
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			n = ran.nextInt(5) + 1;	// 1 ~ 5 사이의 난수를 반환
			
			list.add(n);
		}
		
		System.out.println("list = " + list);
		
		// 변환
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		System.out.println("hs = " + hs);
		
		
		// 2. Set -> List
		list = new ArrayList<Integer>(hs);
		
		System.out.println("\nlist = " + list);
		System.out.println("list[3] = " + list.get(3));
		
	}
}
