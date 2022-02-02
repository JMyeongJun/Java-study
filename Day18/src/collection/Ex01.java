package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex01 {
	public static void main(String[] args) {
		// Vector : List를 구현한 클래스. 옛 버전이고 호환성을 위해서 남겨둔 구조
		
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("vec = " + vec);
		
		// Vector는 iterator 대신에 enumeration을 사용한다
		
		Enumeration<Integer> em = vec.elements();				// iterator()와 동일한 메서드
		
		while(em.hasMoreElements()) {							// hasNext()와 동일
			System.out.println("em = " + em.nextElement());		// next()와 동일
		}
	}
}
