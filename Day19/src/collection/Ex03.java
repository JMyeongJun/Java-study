package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		// - Value�� Object? -> ��� ��ü�� ����� �� �ִٴ� �ǹ�
		
		hm.put("name", "ȫ�浿");
		hm.put("age", 25);
		hm.put("height", 175.5);
		
		hm.put("hobby", Arrays.asList("��ȭ", "����", "����"));
		
		
		System.out.println("hm = " + hm);
		
		// ��ó��, Map�� ��ü�� �����ϰ� ǥ���ϰ� ��ȯ�ϱ� ���ؼ� ����ϱ⵵ �Ѵ�
		
		
		System.out.println("\nhm�� �̸�? " + hm.get("name") + "\n");
		// Key�� ���ڿ� -> �������� ����
		
		
		// ����, List�� �����ߴٸ�?
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("ȫ�浿");
		list.add(25);
		list.add(175.5);
		list.add(Arrays.asList("��ȭ", "����", "����"));
		
		System.out.println("list = " + list);
		
		System.out.println("\nlist�� �̸�? " + list.get(0));
		// Index�� ���� -> ���ڿ� ���� �������� ��������
		// - ��, �����Ͱ� ���� ���� ���ϴ� ������ ������ ���� ����������
		
	}
}
