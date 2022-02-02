package collection;

import java.util.HashSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set : 순서x, 중복x
		
		// 구현한 클래스)
		// HashSet, TreeSet
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);		// 중복된 데이터는 무시된다~
		
		System.out.println("hs = " + hs);
		
		// System.out.println("hs[0] = " + hs.get(0));
		// - index(= 순서)가 없기 때문에 indexing 불가능
		
		System.out.println("hs의 크기 : " + hs.size());
		
		hs.remove(10);	// remove(값) : 지정한 값을 제거한다
		System.out.println("hs = " + hs);
		
		hs.clear();
		System.out.println("hs = " + hs);
	}
}
