package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ex07 {
	public static void main(String[] args) {
		// HashTable : List의 Vector처럼 호환성을 위해서 남겨둔 구조~
		
		Hashtable<String, Object> ht = new Hashtable<String, Object>();
		
		ht.put("name", "홍길동");
		ht.put("age", 27);
		ht.put("height", 170.5);
		
		System.out.println("ht = " + ht + "\n");
		
		// HashTable은 Enumeration을 반환할 수 있다
		// - 이를 가지고 Value값을 순환할 수 있다~
		Enumeration<Object> value = ht.elements();
		
		while(value.hasMoreElements()) {	// == hasNext()
			System.out.println("value = " + value.nextElement());	// == next()
		}
	}
}
