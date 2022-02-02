package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		// 로또 번호 추첨 프로그램
		
		// 1. 1 ~ 45 사이의 수를 무작위로 추첨한다
		// 2. 추첨한 수는 중복없이 6개를 뽑는다
		// 3. 모두 추첨 후 결과 발표는 항상 오름차순으로 발표한다
		
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while (hs.size() != 6) {	// 중복없이 6개가 될때까지
			int n = ran.nextInt(45) + 1;
			
			hs.add(n);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		
		list.sort(null);
		
		System.out.println(list);
		
	}
}
