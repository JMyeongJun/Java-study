package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// Scanner로 파일 입력
		try {
			File file = new File("성적.txt");
			Scanner sc = new Scanner(file);
			
			String name;
			int kor, eng, mat, sum;
			
			System.out.printf("이름\t국어\t영어\t수학\t합계\n");
			System.out.println("-----------------------------------");
			
			while (sc.hasNext()) {
				name = sc.next();
				kor = sc.nextInt();
				eng = sc.nextInt();
				mat = sc.nextInt();
				
				sum = kor + eng + mat;
				
				System.out.printf("%s\t%d\t%d\t%d\t%d\n", name, kor, eng, mat, sum);
			}
			
			sc.close();
			
		} catch(FileNotFoundException e) {
			System.err.println("예외 : " + e.getMessage());
		}
	}
}
