package collection;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		// Map : Key�� Value�� �ѽ��� �ڷᱸ��
		// - Key�� �ߺ�x, Value�� �ߺ�o
		
		// ������ Ŭ����
		// - HashMap, TreeMap, HashTable
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//     <Key,    Value  >
		
		hm.put("Java", 85);
		hm.put("C���", 90);
		hm.put("Python", 80);
		
		System.out.println("hm = " + hm);
		
		// Key�� Value�� �����ϱ� ���� Index�� �����ϴ�
		// ��, List�� ������(value)�� Index�� �����ϰ�
		// Map�� �����͸� Key�� �����Ѵ�
		
		System.out.println("hm[\"Java\"] = " + hm.get("Java"));
		// - Key�� Ŀ���� Index��� �����ϸ� ����
		
		System.out.println("hm[\"Python\"] = " + hm.get("Python") + "\n");
		
		
		// �ߺ��� Key�� �߰��ϸ� ������ ���� ��������
		hm.put("Java", 95);
		System.out.println("hm = " + hm);
		
		// �����Ϸ��ϴ� Value�� �ߺ��� �����ϴ�~
		hm.put("SQL", 80);
		System.out.println("hm = " + hm);
		
	}
}
