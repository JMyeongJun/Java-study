package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Quiz {
	public static void main(String[] args) {
		Person[] arr2 = new Person[] {
				new Person("ȫ�浿", 17),
				new Person("��浿", 30),
				new Person("�̱浿", 22)
		};
		
		// ���� �̸� ������ ���ĵȴ�.
		Arrays.sort(arr2);
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		
		// Comparator�� Ȱ���ؼ� ���� ������ ���������� �������� �ΰ��� �ۼ��� ������
		// 1. ��������(����)
		Comparator<Person> ageAsc = (Person o1, Person o2) -> {
			return o1.age - o2.age;
		};
		
		Arrays.sort(arr2, ageAsc);
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		
		// 2. ��������(����)
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			return o2.age - o1.age;
		};
		
		Arrays.sort(arr2, ageDesc);
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		
		// etc. ��������(�̸�)
		Comparator<Person> nameDesc = (Person o1, Person o2) -> {
			return o2.name.compareTo(o1.name);
		};
		
		Arrays.sort(arr2, nameDesc);
		System.out.println("arr2 = " + Arrays.toString(arr2));
	}
}
