package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ex07 {
	public static void main(String[] args) {
		// HashTable : List�� Vectoró�� ȣȯ���� ���ؼ� ���ܵ� ����~
		
		Hashtable<String, Object> ht = new Hashtable<String, Object>();
		
		ht.put("name", "ȫ�浿");
		ht.put("age", 27);
		ht.put("height", 170.5);
		
		System.out.println("ht = " + ht + "\n");
		
		// HashTable�� Enumeration�� ��ȯ�� �� �ִ�
		// - �̸� ������ Value���� ��ȯ�� �� �ִ�~
		Enumeration<Object> value = ht.elements();
		
		while(value.hasMoreElements()) {	// == hasNext()
			System.out.println("value = " + value.nextElement());	// == next()
		}
	}
}
