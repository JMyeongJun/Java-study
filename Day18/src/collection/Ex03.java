package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// Set의 반복
		// - index가 없기 때문에 일반 for문은 사용 불가능
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 10; i <= 50; i += 10) {
			hs.add(i);
		}
		
		System.out.println("hs = " + hs + "\n");
		
		
		// 1. for-each문
		for (int n : hs) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 2. iterator
		Iterator<Integer> it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println("it = " + it.next());
		}
	}
}
