package _interface;

import java.util.Arrays;
import java.util.Comparator;

// Comparator 인터페이스 : 기타 다른 비교 기준이 필요할때 구현하는 인터페이스
// - 개수 제한없이 몇개든 생성 가능

class Desc implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {	// o1 = 앞, o2 = 뒤
		return o2 - o1;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {4,8,2,7,6};
		
		// 익명 클래스x : 1. 클래스에 상속 -> 인스턴스 생성 -> 매개변수로 전달 
		Desc desc = new Desc();
		
		Arrays.sort(arr1, desc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		
		// 익명 클래스o : 1. 인스턴스 생성 -> 2. 매개변수로 전달
		Comparator<Integer> de2 = (Integer o1, Integer o2) -> {
			return o1 - o2;
		};
		
		Arrays.sort(arr1, de2);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
	}
}
