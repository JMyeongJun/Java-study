package method;

public class Quiz3 {
	// 제네릭 : 자료형에 구애받지 않는 프로그래밍 방식을 의미
	// - 일반 자료형을 사용할 수 없다

	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 아래의 배열을 모두 실행될 수 있게 하라
		Integer[] arr1 = new Integer[] { 10, 20, 30, 40, 50 };
		Double[] arr2 = new Double[] { 10.3, 3.14, 5.12 };
		String[] arr3 = new String[] { "Java", "Python", "C++" };

		// 요소를 일렬로 출력하는 메서드
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}

// # Wrapper 클래스
// - 일반 타입을 객체로 취급하기 위해서 작성한 클래스들
//
// 일반 자료형		Wrapper
//-----------------------
// boolean		Boolean
// byte			Byte
// char			Character
// short		Short
// int			Integer
// long			Long
// float		Float
// double		Double
