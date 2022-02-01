package collection;

import java.util.LinkedList;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList VS LinkedList
		// - ��� ��� �����ϴ�
		// - ��, �����ϴ� ������ �ٸ���
		
		// 1. ArrayList : �迭 ������� �ۼ��� ����Ʈ
		// - �ӵ��� ������. ��, �߰� ���ſ� �������� ���ϴ�
		
		// 2. LinkedList : ���� �����͸� �̾���� ������ ����Ʈ
		// - ArrayList���� ����. ��, �߰� ���ſ� ������尡 ����
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list);
		
		list.add(1, 15);
		System.out.println("list = " + list);
		
		list.remove(2);
		System.out.println("list = " + list);
		
	}
}
