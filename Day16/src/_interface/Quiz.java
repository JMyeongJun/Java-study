package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Quiz {
	public static void main(String[] args) {
		Person[] arr2 = new Person[] {
				new Person("홍길동", 17),
				new Person("김길동", 30),
				new Person("이길동", 22)
		};
		
		// 현재 이름 순으로 정렬된다.
		Arrays.sort(arr2);
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		
		// Comparator를 활용해서 나이 순으로 오름차순과 내림차순 두개를 작성해 보세요
		// 1. 오름차순(나이)
		Comparator<Person> ageAsc = (Person o1, Person o2) -> {
			return o1.age - o2.age;
		};
		
		Arrays.sort(arr2, ageAsc);
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		
		// 2. 내림차순(나이)
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			return o2.age - o1.age;
		};
		
		Arrays.sort(arr2, ageDesc);
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		
		// etc. 내림차순(이름)
		Comparator<Person> nameDesc = (Person o1, Person o2) -> {
			return o2.name.compareTo(o1.name);
		};
		
		Arrays.sort(arr2, nameDesc);
		System.out.println("arr2 = " + Arrays.toString(arr2));
	}
}
