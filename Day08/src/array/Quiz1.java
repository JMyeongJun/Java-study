package array;

public class Quiz1 {
	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		int a=1;
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				arr[i][j] = a++;
			}
		}
		
		for(int[] line : arr) {
			for(int num: line) {
				System.out.printf("%2d ", num);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}
		
		
	}
}
