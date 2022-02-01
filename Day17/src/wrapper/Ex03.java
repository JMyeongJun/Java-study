package wrapper;

// ���׸� : �Ϲ�ȭ
// ���׸� ���α׷��� : �ڷ����� ���� ���� �ʴ� ���α׷��� ���

// ����) �Ϲ� �ڷ����� ����� �� ����
// - Ÿ���� ���� �� Object ���·� �ޱ� ����

class Person {
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
	
	void eat(String food) {
		System.out.println(food + "(��)�� �Դ´�");
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
		// - �Ϲ� �ڷ����� Ŭ������ �ƴ� -> Object�� ����ȯ �Ұ���
		// - ���� ���׸��� ��� �Ұ���
		
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		
		
		Person[] arr5 = new Person[] {
				new Person("ȫ�浿", 22),
				new Person("��浿", 30),
		};
		
		printArr(arr5);
		
		
	}
}
