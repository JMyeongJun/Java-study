package collection;

import java.util.HashSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set : ����x, �ߺ�x
		
		// ������ Ŭ����)
		// HashSet, TreeSet
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add(10);		// �ߺ��� �����ʹ� ���õȴ�~
		
		System.out.println("hs = " + hs);
		
		// System.out.println("hs[0] = " + hs.get(0));
		// - index(= ����)�� ���� ������ indexing �Ұ���
		
		System.out.println("hs�� ũ�� : " + hs.size());
		
		hs.remove(10);	// remove(��) : ������ ���� �����Ѵ�
		System.out.println("hs = " + hs);
		
		hs.clear();
		System.out.println("hs = " + hs);
	}
}
