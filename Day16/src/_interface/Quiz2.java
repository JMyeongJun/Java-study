package _interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//1. 학생 정보를 저장할 클래스를 선언 한다 
// 단, 필드는 모두 private로 세팅
// 필드는, 이름 국 영 수

class Student {
	private String name;
	private int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		String result = "\n%s (국 %d, 영 %d, 수 %d, 합 %d)\n";
		int sum = kor + eng + mat; 
		
		result = String.format(result, name, kor, eng, mat, sum);
		
		return result;
	}
	
	int getSum() {
		return kor + eng + mat;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 2. 사용자에게 이름, 점수를 입력 받아서 배열로 저장
		// 단, 3명까지만 저장
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;
		
		Student[] stus = new Student[3];
		
		for (int i = 0; i < stus.length; i++) {
			System.out.print("이름 : ");
			name = sc.next();
			
			System.out.print("국 영 수 : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
			
			stus[i] = new Student(name, kor, eng, mat);
		}
		
		// 3. 학생 정보를 일렬로 출력
		// 단, '이름 국 영 수 합계'가 출력되게 한다
		System.out.println("\n" + Arrays.toString(stus));
		
		// 4. 합계 순으로 내림차순하고 출력한다
		Comparator<Student> desc = (Student s1, Student s2) -> {
			return s2.getSum() - s1.getSum();
		};
		
		Arrays.sort(stus, desc);
		System.out.println("\n" + Arrays.toString(stus));
		
		sc.close();
	}
}
