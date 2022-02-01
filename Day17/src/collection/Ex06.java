package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		// 상위 클래스(인터페이스)로 인스턴스를 참조하는 것을 up-casting이라고 했엇다
		
		List<Integer> list = new ArrayList<Integer>();
		// - 반환형이나 매개변수에 동일한 형태로 주고 받기 위해서 사용하기도 하므로 참고한다
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list);
		
		list.add(1, 100);
		System.out.println("list = " + list);
		
		list.remove(2);
		System.out.println("list = " + list);
		
		list.clear();
		System.out.println("list = " + list);
	}
}
