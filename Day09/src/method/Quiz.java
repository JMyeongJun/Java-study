package method;

public class Quiz {

	static void printNumber(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}

	static void compare(int n1, int n2) {
		int max = n1 > n2 ? n1 : n2;

		if (n1 == n2) {
			System.out.println("����");
		} else {
			System.out.println("ū�� : " + max);
		}
	}

	static int total(int num) {

		return num > 0 ? num + total(num - 1) : 0;
	}

	static int absolute(int num) {

		return num < 0 ? -num : num;
	}

	static void printArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static int reverse(int num) {

		String n = "";
		
		while(num != 0) {
			n += Integer.toString(num%10);
			num /= 10;
		}

//		int result = 0;
//
//		while (num != 0) {
//			result = result * 10 + num % 10;
//			num /= 10;
//		}
//
		return Integer.parseInt(n);
//		return result;
	}

	public static void main(String[] args) {
		// 1. ������ �����Ͽ� 1 ~ n���� �Ϸķ� ����ϴ� �޼���
		printNumber(10);
		System.out.println();
		printNumber(5);
		System.out.println("\n");

		// 2. �� ������ ���ϴ� �޼���
		compare(10, 5); // ū �� ���
		compare(5, 10);
		compare(5, 5); // ������ '����'
		System.out.println();

		// 3. 1 ~ n������ �հ踦 ��ȯ�ϴ� �޼���
		System.out.println("��� : " + total(5));
		System.out.println("��� : " + total(10));
		System.out.println();

		// 4. ������ ������ ���밪�� ��ȯ�ϴ� �޼���
		System.out.println("��� : " + absolute(-5));
		System.out.println("��� : " + absolute(5));
		System.out.println();

		// 5. ������ �迭�� �Ϸķ� ����ϴ� �޼���
		int[] arr = new int[] { 10, 20, 30, 40, 50 };

		printArr(arr);
		System.out.println("\n");

		// 6. ������ ������ �Ųٷ� �ۼ��ؼ� ��ȯ
		int rev = reverse(100);

		System.out.println("rev = " + rev);

	}
}
