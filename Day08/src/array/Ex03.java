package array;

public class Ex03 {
	public static void main(String[] args) {
		// 빈 2차원 배열
		int[][] arr = new int[3][4]; // [행][열]

		arr[1][1] = 10;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
				// %nd : n칸을 미리 확보 후 채운다
			}
			System.out.println();
		}
	}
}
