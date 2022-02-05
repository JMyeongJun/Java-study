package collection;

import java.util.Comparator;
import java.util.TreeMap;

public class Ex06 {
	public static void main(String[] args) {
		// TreeMep : Key값을 가지고 정렬되어서 출력된다
		
		Comparator<String> desc = (String o1, String o2) -> {
			return o2.compareTo(o1);
		};
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(desc);
		
		tm.put("SQL", 65);
		tm.put("Java", 80);
		tm.put("C언어", 70);
		tm.put("Python", 90);
		tm.put("JavaSrcript", 75);
		
		System.out.println("tm = " + tm);
		
	}
}
