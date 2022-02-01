package collection;

import java.util.ArrayList;

// �÷��� : ����, ����
// ������ ��ũ : ����ȭ�� ����. ���� ���� ���� Ʋ�� ���� �������� �ǹ�

// �÷��� ������ ��ũ : �ڹٿ��� �����ϴ� �ڷᱸ�� �� �˰����� �ǹ�

// ����)
// 1. List	: ����o, �ߺ�o
// 2. Set	: ����x, �ߺ�x
// 3. Map	: key�� value�� �ѽ��� ���� (= key�� �ߺ�x, value�� �ߺ�o)

public class Ex01 {
	public static void main(String[] args) {
		// List�� interface�� �����Ǿ� ���� �ʴ�
		
		// �̸� ���� ������ ��ǥ���� Ŭ������
		// 1. ArrayList
		// 2. LinkedList
		// 3. Vector
		
		// Array VS ArrayList
		// 1. Array : ���� ũ�⸦ �̸� �����ϰ� ����ؾ� �Ѵ�, ����� ���� -> ����
		// 2. ArrayList : �� �迭�� ����� �߰��ؼ� ���� ����
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);		// add(������) : ����Ʈ ���� �ڿ� �����͸� �߰�
		list.add(30);
		list.add(20);
		
		System.out.println("list = " + list);
		System.out.println("list�� ũ�� : " + list.size() + "\n");
		
		System.out.println("list[0] = " + list.get(0));
		// ArrayList�� Ŭ���� -> ���� ��� ����� �޼���� �ۼ��Ǿ� ������ ���� �Ѵ�
		
		list.add(1, 15);	// add(index, ������) : ���� ��ġ�� �����͸� �߰�. ���� �����ʹ� �ڷ� �з���
		System.out.println("list = " + list);
		
		list.set(2, 40);	// set(index, ������) : ���� ��ġ�� ���
		System.out.println("list = " + list);
		
		list.sort(null);	// sort(Comparator) : ���� �� �������� ����. null�� �ָ� Comparable�� ��
		System.out.println("list = " + list);
		
		int n = list.remove(2);		// remove(index) : ���� ��ġ�� ����
		System.out.println("list = " + list);
		System.out.println("������ ��  = " + n + "\n");
		
		list.clear();		// clear() : ��Ҹ� ��� ����
		System.out.println("list = " + list);
		
		
	}
}
