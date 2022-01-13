package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] its = new int[3];
		double[] dbs = new double[3];
		char[] chs = new char[3];
		boolean[] bos = new boolean[3];
		String[] sts = new String[3];	// <- String은 클래스
		
		System.out.println("its = " + Arrays.toString(its));
		System.out.println("dbs = " + Arrays.toString(dbs));
		System.out.println("chs = " + Arrays.toString(chs));
		System.out.println("bos = " + Arrays.toString(bos));
		System.out.println("sts = " + Arrays.toString(sts));
		// # null : 데이터가 없음을 의미
	}
}
