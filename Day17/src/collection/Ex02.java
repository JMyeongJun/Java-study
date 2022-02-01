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
		return name + " (" + age + "세)";
	}
	
	@Override
	public int compareTo(Person o) {
		// this = 앞, o = 뒤
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
		// 우리가 작성한 클래스를 집어넣어 보자~
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동", 22));
		list.add(new Person("고길동", 40));
		list.add(new Person("이길동", 17));
		
		System.out.println("list = " + list);
		
		list.sort(null);
		System.out.println("list = " + list);
		
		
		// 나이 순으로 내림차순 되게하라~
		// 참고 : 필요하다면 Access 메서드를 작성해도 좋다~
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		list.sort(ageDesc);
		System.out.println("list = " + list);
		
		
		// 추가로 미리 이름 순으로 정렬해 보세요~
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
