package _interface;

import java.util.Arrays;

// Comparable 인터페이스 : 비교를 구현하는 인터페이스
// - 주로 비교가 필요한 정렬 메서드에서 요구하는 인터페이스
// - 비교가 필요한 클래스에 상속 받아서 사용한다
// - 단, 하나의 비교 기준 밖에 못 만듦

class Person implements Comparable<Person> {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + "세)";
	}

	@Override
	public int compareTo(Person o) { 		// this = 앞 데이터
									 		// o = 뒷 데이터
		
		return name.compareTo(o.name);		// 앞 - 뒤 = 오름 차순
											// 뒤 - 앞 = 내림 차순
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {4,8,2,7,6};
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		
		// 이번엔 내 클래스로 실습
		Person[] arr2 = new Person[] {
				new Person("홍길동", 17),
				new Person("김길동", 30),
				new Person("이길동", 22)
		};
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		System.out.println("arr2 = " + Arrays.toString(arr2));
	}
}
