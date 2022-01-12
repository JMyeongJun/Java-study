package loop;

public class Ex03 {
	public static void main(String[] args) {
		// 보조 제어문 : 제어문을 보조하는 구문

		// 1. break : 제어문을 즉시 '탈출' == 종료
		for (int i = 1; i <= 5; i++) {
			if (i == 5) {
				break;
			}

			System.out.print(i + " ");
		}
		System.out.println();

		// 2. continue : 제어문을 즉시 처음으로 == 다시 반복
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}

			System.out.print(i + " ");
		}
		System.out.println();
		
		// # return : 함수를 즉시 종료 (main 함수를 종료시 프로그램 종료)
		for (int i = 1; i <= 5; i++) {
			if (i == 5) {
				return;		// 제어문(for)에 걸리는게 아니라 main함수에 걸린다!!!
			}

			System.out.print(i + " ");
		}
		
		System.out.println("\n여기는 실행이 되나요???");
	}
}
