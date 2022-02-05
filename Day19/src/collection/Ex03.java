package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		// - Value가 Object? -> 모든 객체가 저장될 수 있다는 의미
		
		hm.put("name", "홍길동");
		hm.put("age", 25);
		hm.put("height", 175.5);
		
		hm.put("hobby", Arrays.asList("영화", "게임", "독서"));
		
		
		System.out.println("hm = " + hm);
		
		// 이처럼, Map은 객체를 간단하게 표현하고 교환하기 위해서 사용하기도 한다
		
		
		System.out.println("\nhm의 이름? " + hm.get("name") + "\n");
		// Key가 문자열 -> 가독성이 좋다
		
		
		// 만약, List로 저장했다면?
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("홍길동");
		list.add(25);
		list.add(175.5);
		list.add(Arrays.asList("영화", "게임", "독서"));
		
		System.out.println("list = " + list);
		
		System.out.println("\nlist의 이름? " + list.get(0));
		// Index는 정수 -> 문자열 보단 가독성이 떨어진다
		// - 즉, 데이터가 많을 수록 원하는 데이터 참조가 조금 불편해진다
		
	}
}
