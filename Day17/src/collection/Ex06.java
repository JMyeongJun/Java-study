package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		// ���� Ŭ����(�������̽�)�� �ν��Ͻ��� �����ϴ� ���� up-casting�̶�� �߾���
		
		List<Integer> list = new ArrayList<Integer>();
		// - ��ȯ���̳� �Ű������� ������ ���·� �ְ� �ޱ� ���ؼ� ����ϱ⵵ �ϹǷ� �����Ѵ�
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("list = " + list);
		
		list.add(1, 100);
		System.out.println("list = " + list);
		
		list.remove(2);
		System.out.println("list = " + list);
		
		list.clear();
		System.out.println("list = " + list);
	}
}
