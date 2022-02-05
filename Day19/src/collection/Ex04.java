package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Java", 80);
		map.put("C언어", 70);
		map.put("Python", 85);
		map.put("C++", 75);
		
		System.out.println("map = " + map + "\n");
		
		// Map의 반복(= 순환)
		// - 기본적으로 순환이 불가능한 구조
		
		Set<String> keys = map.keySet();	// keySet() : key만 쏙 뽑아내는 메서드
		
		System.out.println("keys = " + keys + "\n");
		
		
		// Set은 Iterator로 순환이 가능한 구조~
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();		// next()는 커서를 이동 후 요소를 반환
										// 즉, 두번 실행되지 않게 변수에 저장받고 사용하자
			
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		// for-each문으로 Map 전체 출력
		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		// 람다식을 활용한 순환
		map.forEach((String k, Integer v) -> System.out.println(k + " : " + v));
		
	}
}
