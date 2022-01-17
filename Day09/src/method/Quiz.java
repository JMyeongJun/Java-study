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
			System.out.println("같다");
		} else {
			System.out.println("큰수 : " + max);
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
		// 1. 정수를 전달하여 1 ~ n까지 일렬로 출력하는 메서드
		printNumber(10);
		System.out.println();
		printNumber(5);
		System.out.println("\n");

		// 2. 두 정수를 비교하는 메서드
		compare(10, 5); // 큰 수 출력
		compare(5, 10);
		compare(5, 5); // 같으면 '같다'
		System.out.println();

		// 3. 1 ~ n까지의 합계를 반환하는 메서드
		System.out.println("결과 : " + total(5));
		System.out.println("결과 : " + total(10));
		System.out.println();

		// 4. 전달한 정수를 절대값을 반환하는 메서드
		System.out.println("결과 : " + absolute(-5));
		System.out.println("결과 : " + absolute(5));
		System.out.println();

		// 5. 전달한 배열을 일렬로 출력하는 메서드
		int[] arr = new int[] { 10, 20, 30, 40, 50 };

		printArr(arr);
		System.out.println("\n");

		// 6. 전달한 정수를 거꾸로 작성해서 반환
		int rev = reverse(100);

		System.out.println("rev = " + rev);

	}
}
