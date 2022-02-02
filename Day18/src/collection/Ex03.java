package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// Set�� �ݺ�
		// - index�� ���� ������ �Ϲ� for���� ��� �Ұ���
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 10; i <= 50; i += 10) {
			hs.add(i);
		}
		
		System.out.println("hs = " + hs + "\n");
		
		
		// 1. for-each��
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
