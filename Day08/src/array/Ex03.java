package array;

public class Ex03 {
	public static void main(String[] args) {
		// �� 2���� �迭
		int[][] arr = new int[3][4]; // [��][��]

		arr[1][1] = 10;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
				// %nd : nĭ�� �̸� Ȯ�� �� ä���
			}
			System.out.println();
		}
	}
}
