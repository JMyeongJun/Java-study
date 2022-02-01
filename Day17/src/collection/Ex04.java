package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. list에 자신이 아는 it과목이나 프로그래밍 언어를 5개정도 채운다
		list.add("Java");
		list.add("C언어");
		list.add("Linux");
		list.add("CCNA");
		list.add("Python");
		
		System.out.println("list = " + list + "\n");
		
		// 2. for문, for-each, iterator를 각각을 사용해서 전체를 출력해본다
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
