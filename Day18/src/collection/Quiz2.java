package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

class Lotto {
	private Random ran = new Random();
	
	ArrayList<Integer> getNumber() {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while (hs.size() != 6) {
			int n = ran.nextInt(45) + 1;
			hs.add(n);
		}
		
		ArrayList<Integer> lotto = new ArrayList<Integer>(hs);
		lotto.sort(null);
		
		return lotto;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// Quiz1의 내용을 클래스로 작성해 보라
		Lotto lt = new Lotto();
		
		List<Integer> lotto = lt.getNumber(); 
		
		System.out.println("lotto = " + lotto);
		
		System.out.println("결과2 : " + lt.getNumber());
		
	}
}
