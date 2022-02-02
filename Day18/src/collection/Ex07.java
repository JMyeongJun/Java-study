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
		return name + " (" + age + "세)";
	}
	
	@Override
	public int compareTo(Person o) {
		return o.age - age;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		
		// 사람 정보 3개를 ts에 추가한다
		// 단, 출력은 나이순으로 내림차순 되게 한다
		
		ts.add(new Person("홍길동", 30));
		ts.add(new Person("김길동", 22));
		ts.add(new Person("박길동", 17));
		
		System.out.println("ts = " + ts);
		
	}
}
