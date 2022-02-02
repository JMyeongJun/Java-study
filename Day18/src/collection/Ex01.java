package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex01 {
	public static void main(String[] args) {
		// Vector : List�� ������ Ŭ����. �� �����̰� ȣȯ���� ���ؼ� ���ܵ� ����
		
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println("vec = " + vec);
		
		// Vector�� iterator ��ſ� enumeration�� ����Ѵ�
		
		Enumeration<Integer> em = vec.elements();				// iterator()�� ������ �޼���
		
		while(em.hasMoreElements()) {							// hasNext()�� ����
			System.out.println("em = " + em.nextElement());		// next()�� ����
		}
	}
}
