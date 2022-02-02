package collection;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Ex06 {
	public static void main(String[] args) {
		// TreeSet : Tree��� �ڷᱸ���� �����ϴ� Set
		// ��� : ��½� ���� �Ǿ ��µȴ�
		
		Random ran = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int n = ran.nextInt(100) + 1;
			
			ts.add(n);
		}
		
		
		System.out.println("ts = " + ts);
		
		
		// ���������ǰ� �غ�����~
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
