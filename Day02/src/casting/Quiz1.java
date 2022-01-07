package casting;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름 국 영 수 점수를 저장할 변수를 선언한다
		// 단, 국 영 수는 정수형으로 선언
		
		// 2. 1번의 변수에 값을 채운다
		
		// 3. 결과는 아래와 같다
		// 결과)
		// 이름 : 홍길동
		// 성적 : 국 70, 영 80, 수 98
		// 합계 : 248 (= 82.67)
		
		String name;
		int rnr, dud, tn;
		int sum;
		
		name = "홍길동";
		rnr = 70; dud = 80; tn = 98;
		sum = rnr + dud + tn;
		
		System.out.println("이름 : " + name);
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", rnr, dud, tn);
		System.out.printf("합계 : %d (= %.2f)", sum, sum/3.0);
		System.out.println();
		
		// #소수점 제어
		// 1. 강제 형변환(버림)
		double avg = sum / 3.0;	// 82.6666666..
		
//		avg = avg * 100;		// 8266.666666...
//		avg = (int)avg;			// 8266.0
//		avg = avg / 100;		// 82.66
		
		// 한줄로
		avg = (int)(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg);
		
		// 2. Math 클래스 사용(반올림)
		avg = sum / 3.0;
		
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("avg = " + avg);
	}
}
