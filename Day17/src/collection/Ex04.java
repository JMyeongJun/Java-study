package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. list�� �ڽ��� �ƴ� it�����̳� ���α׷��� �� 5������ ä���
		list.add("Java");
		list.add("C���");
		list.add("Linux");
		list.add("CCNA");
		list.add("Python");
		
		System.out.println("list = " + list + "\n");
		
		// 2. for��, for-each, iterator�� ������ ����ؼ� ��ü�� ����غ���
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		
	}
}
