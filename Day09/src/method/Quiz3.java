package method;

public class Quiz3 {
	// ���׸� : �ڷ����� ���ֹ��� �ʴ� ���α׷��� ����� �ǹ�
	// - �Ϲ� �ڷ����� ����� �� ����

	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// �Ʒ��� �迭�� ��� ����� �� �ְ� �϶�
		Integer[] arr1 = new Integer[] { 10, 20, 30, 40, 50 };
		Double[] arr2 = new Double[] { 10.3, 3.14, 5.12 };
		String[] arr3 = new String[] { "Java", "Python", "C++" };

		// ��Ҹ� �Ϸķ� ����ϴ� �޼���
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}

// # Wrapper Ŭ����
// - �Ϲ� Ÿ���� ��ü�� ����ϱ� ���ؼ� �ۼ��� Ŭ������
//
// �Ϲ� �ڷ���		Wrapper
//-----------------------
// boolean		Boolean
// byte			Byte
// char			Character
// short		Short
// int			Integer
// long			Long
// float		Float
// double		Double
