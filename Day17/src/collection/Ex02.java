package collection;

import java.util.ArrayList;
import java.util.Comparator;

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + "��)";
	}
	
	@Override
	public int compareTo(Person o) {
		// this = ��, o = ��
		return age - o.age;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// �츮�� �ۼ��� Ŭ������ ����־� ����~
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("ȫ�浿", 22));
		list.add(new Person("��浿", 40));
		list.add(new Person("�̱浿", 17));
		
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("list = " + list);
		
		
		// ���� ������ �������� �ǰ��϶�~
		// ���� : �ʿ��ϴٸ� Access �޼��带 �ۼ��ص� ����~
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		list.sort(ageDesc);
		System.out.println("list = " + list);
		
		
		// �߰��� �̸� �̸� ������ ������ ������~
		Comparator<Person> nameAsc = (Person o1, Person o2) -> {
			return o1.getName().compareTo(o2.getName());
			// o1.name - o2.name;
		};
		
		list.sort(nameAsc);
		System.out.println("list = " + list);
		
		
		Comparator<Person> nameDesc = (Person o1, Person o2) -> {
			return o2.getName().compareTo(o1.getName());
			// o2.name - o1.name;
		};
		
		list.sort(nameDesc);
		System.out.println("list = " + list);
		
	}
}
