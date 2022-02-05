package collection;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		// Map : Key와 Value의 한쌍의 자료구조
		// - Key는 중복x, Value는 중복o
		
		// 구현한 클래스
		// - HashMap, TreeMap, HashTable
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//     <Key,    Value  >
		
		hm.put("Java", 85);
		hm.put("C언어", 90);
		hm.put("Python", 80);
		
		System.out.println("hm = " + hm);
		
		// Key는 Value를 접근하기 위한 Index와 동일하다
		// 즉, List는 데이터(value)를 Index로 접근하고
		// Map은 데이터를 Key로 접근한다
		
		System.out.println("hm[\"Java\"] = " + hm.get("Java"));
		// - Key는 커스텀 Index라고 생각하면 좋다
		
		System.out.println("hm[\"Python\"] = " + hm.get("Python") + "\n");
		
		
		// 중복된 Key를 추가하면 이전의 값이 덮어진다
		hm.put("Java", 95);
		System.out.println("hm = " + hm);
		
		// 저장하려하는 Value는 중복이 가능하다~
		hm.put("SQL", 80);
		System.out.println("hm = " + hm);
		
	}
}
