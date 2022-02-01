package wrapper;

// 제네릭 : 일반화
// 제네릭 프로그래밍 : 자료형에 구애 받지 않는 프로그래밍 방식

// 조건) 일반 자료형은 사용할 수 없다
// - 타입을 받을 때 Object 형태로 받기 때문

class Person {
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
	
	void eat(String food) {
		System.out.println(food + "(을)를 먹는다");
	}
}


public class Ex03 {
	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {10,20,30};
		
		Integer[] arr2 = new Integer[] {10,20,30};
		Double[] arr3 = new Double[] {10.1, 3.14, 5.3};
		String[] arr4 = new String[] {"Java", "Python", "C"};
		
		// printArr(arr1);
		// - 일반 자료형은 클래스가 아님 -> Object로 형변환 불가능
		// - 따라서 제네릭에 사용 불가능
		
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		
		
		Person[] arr5 = new Person[] {
				new Person("홍길동", 22),
				new Person("김길동", 30),
		};
		
		printArr(arr5);
		
		
	}
}
