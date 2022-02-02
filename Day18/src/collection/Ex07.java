package collection;

import java.util.TreeSet;

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
		return o.age - age;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		
		// ��� ���� 3���� ts�� �߰��Ѵ�
		// ��, ����� ���̼����� �������� �ǰ� �Ѵ�
		
		ts.add(new Person("ȫ�浿", 30));
		ts.add(new Person("��浿", 22));
		ts.add(new Person("�ڱ浿", 17));
		
		System.out.println("ts = " + ts);
		
	}
}
