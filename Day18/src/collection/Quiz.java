package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		// �ζ� ��ȣ ��÷ ���α׷�
		
		// 1. 1 ~ 45 ������ ���� �������� ��÷�Ѵ�
		// 2. ��÷�� ���� �ߺ����� 6���� �̴´�
		// 3. ��� ��÷ �� ��� ��ǥ�� �׻� ������������ ��ǥ�Ѵ�
		
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while (hs.size() != 6) {	// �ߺ����� 6���� �ɶ�����
			int n = ran.nextInt(45) + 1;
			
			hs.add(n);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		
		list.sort(null);
		
		System.out.println(list);
		
	}
}
