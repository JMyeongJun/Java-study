package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// 리스트의 반복
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list + "\n");
		
		
		// 1. 일반 for문 : index를 가지고 반복
		for (int i = 0; i < list.size(); i++) {
			System.out.println("lits[" + i + "] = " + list.get(i));
		}
		System.out.println();
		
		
		// 2. for-each : 요소를 하나씩 대입하며 반복
		// - 특징 : index가 없는 구조에서도 사용 가능한 방식
		for (int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 3. iterator : 순환자, 반복자
		// - 커서(cursor)의 개념과 같다
		Iterator<Integer> it = list.iterator();
		
		System.out.println("다음 위치가 있나? " + it.hasNext());
		// hasNext() : 커서를 움직이지 않고, 다음 요소가 있는지 판별
		
		System.out.println("다음 위치로 이동 후 데이터 : " + it.next());
		// next() : 커서를 한칸 다음으로 움직이고, 움직이고 난 후의 요소를 리턴
		
		System.out.println("다음 : " + it.next());
		System.out.println("다음 : " + it.next());
		
		System.out.println("다음 위치가 있나? " + it.hasNext() + "\n");
		
		// System.out.println("다음 : " + it.next() + "\n");
		
		// 특징 : iterator는 이동 후 다시 앞으로 돌아오지 않는다
		// 따라서 다시 순환하려면 위치를 다시 받아야 한다
		it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("it = " + it.next());
		}
		
		System.out.println("it의 다음? " + it.hasNext());
	}
}
