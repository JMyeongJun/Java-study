package _interface;

import java.util.Arrays;

// Comparable �������̽� : �񱳸� �����ϴ� �������̽�
// - �ַ� �񱳰� �ʿ��� ���� �޼��忡�� �䱸�ϴ� �������̽�
// - �񱳰� �ʿ��� Ŭ������ ��� �޾Ƽ� ����Ѵ�
// - ��, �ϳ��� �� ���� �ۿ� �� ����

class Person implements Comparable<Person> {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + "��)";
	}

	@Override
	public int compareTo(Person o) { 		// this = �� ������
									 		// o = �� ������
		
		return name.compareTo(o.name);		// �� - �� = ���� ����
											// �� - �� = ���� ����
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {4,8,2,7,6};
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		
		// �̹��� �� Ŭ������ �ǽ�
		Person[] arr2 = new Person[] {
				new Person("ȫ�浿", 17),
				new Person("��浿", 30),
				new Person("�̱浿", 22)
		};
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		System.out.println("arr2 = " + Arrays.toString(arr2));
	}
}
