package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Java", 80);
		map.put("C���", 70);
		map.put("Python", 85);
		map.put("C++", 75);
		
		System.out.println("map = " + map + "\n");
		
		// Map�� �ݺ�(= ��ȯ)
		// - �⺻������ ��ȯ�� �Ұ����� ����
		
		Set<String> keys = map.keySet();	// keySet() : key�� �� �̾Ƴ��� �޼���
		
		System.out.println("keys = " + keys + "\n");
		
		
		// Set�� Iterator�� ��ȯ�� ������ ����~
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();		// next()�� Ŀ���� �̵� �� ��Ҹ� ��ȯ
										// ��, �ι� ������� �ʰ� ������ ����ް� �������
			
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		// for-each������ Map ��ü ���
		for (String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		// ���ٽ��� Ȱ���� ��ȯ
		map.forEach((String k, Integer v) -> System.out.println(k + " : " + v));
		
	}
}
