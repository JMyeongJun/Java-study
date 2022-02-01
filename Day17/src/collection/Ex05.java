package collection;

import java.util.LinkedList;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList VS LinkedList
		// - 사용 방법 동일하다
		// - 단, 저장하는 구조가 다르다
		
		// 1. ArrayList : 배열 기반으로 작성된 리스트
		// - 속도가 빠르다. 단, 추가 제거에 적합하지 못하다
		
		// 2. LinkedList : 다음 데이터를 이어놓은 형태의 리스트
		// - ArrayList보단 느림. 단, 추가 제거에 오버헤드가 없다
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list);
		
		list.add(1, 15);
		System.out.println("list = " + list);
		
		list.remove(2);
		System.out.println("list = " + list);
		
	}
}
