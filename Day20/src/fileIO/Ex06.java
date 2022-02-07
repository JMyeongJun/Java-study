package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// Scanner�� ���� �Է�
		try {
			File file = new File("����.txt");
			Scanner sc = new Scanner(file);
			
			String name;
			int kor, eng, mat, sum;
			
			System.out.printf("�̸�\t����\t����\t����\t�հ�\n");
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
			System.err.println("���� : " + e.getMessage());
		}
	}
}
