package method;

public class Quiz2 {
	
	static void printArr(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void printArr(double[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void printArr(String[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		// �Ʒ��� �迭�� ��� ����� �� �ְ� �϶�
		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
		double[] arr2 = new double[] { 10.3, 3.14, 5.12 };
		String[] arr3 = new String[] { "Java", "Python", "C++" };
		
		// ��Ҹ� �Ϸķ� ����ϴ� �޼���
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}
