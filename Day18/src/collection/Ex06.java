package collection;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Ex06 {
	public static void main(String[] args) {
		// TreeSet : Tree라는 자료구조로 저장하는 Set
		// 결론 : 출력시 정렬 되어서 출력된다
		
		Random ran = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int n = ran.nextInt(100) + 1;
			
			ts.add(n);
		}
		
		
		System.out.println("ts = " + ts);
		
		
		// 내림차순되게 해보세요~
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		ts = new TreeSet<Integer>(desc);
		
		for (int i = 0; i < 10; i++) {
			int n = ran.nextInt(100) + 1;
			
			ts.add(n);
		}
		
		System.out.println("ts = " + ts);
	}
}
