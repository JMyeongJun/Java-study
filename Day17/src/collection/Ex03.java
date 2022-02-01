package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// ����Ʈ�� �ݺ�
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list + "\n");
		
		
		// 1. �Ϲ� for�� : index�� ������ �ݺ�
		for (int i = 0; i < list.size(); i++) {
			System.out.println("lits[" + i + "] = " + list.get(i));
		}
		System.out.println();
		
		
		// 2. for-each : ��Ҹ� �ϳ��� �����ϸ� �ݺ�
		// - Ư¡ : index�� ���� ���������� ��� ������ ���
		for (int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 3. iterator : ��ȯ��, �ݺ���
		// - Ŀ��(cursor)�� ����� ����
		Iterator<Integer> it = list.iterator();
		
		System.out.println("���� ��ġ�� �ֳ�? " + it.hasNext());
		// hasNext() : Ŀ���� �������� �ʰ�, ���� ��Ұ� �ִ��� �Ǻ�
		
		System.out.println("���� ��ġ�� �̵� �� ������ : " + it.next());
		// next() : Ŀ���� ��ĭ �������� �����̰�, �����̰� �� ���� ��Ҹ� ����
		
		System.out.println("���� : " + it.next());
		System.out.println("���� : " + it.next());
		
		System.out.println("���� ��ġ�� �ֳ�? " + it.hasNext() + "\n");
		
		// System.out.println("���� : " + it.next() + "\n");
		
		// Ư¡ : iterator�� �̵� �� �ٽ� ������ ���ƿ��� �ʴ´�
		// ���� �ٽ� ��ȯ�Ϸ��� ��ġ�� �ٽ� �޾ƾ� �Ѵ�
		it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("it = " + it.next());
		}
		
		System.out.println("it�� ����? " + it.hasNext());
	}
}
