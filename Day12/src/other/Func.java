package other;

public class Func {
	private Func() {}
	
	public static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static int total(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static int abs(int n) {
		if (n < 0) { return -n; }
		
		return n;
	}
	
	public static int reverse(int n) {
		int result = 0;
		
		while(n != 0) {
			result = result * 10 + n % 10;
			n /= 10;
		}
		
		return result;
	}
	
}
