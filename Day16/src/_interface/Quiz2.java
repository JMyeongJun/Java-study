package _interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//1. �л� ������ ������ Ŭ������ ���� �Ѵ� 
// ��, �ʵ�� ��� private�� ����
// �ʵ��, �̸� �� �� ��

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
		String result = "\n%s (�� %d, �� %d, �� %d, �� %d)\n";
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
		// 2. ����ڿ��� �̸�, ������ �Է� �޾Ƽ� �迭�� ����
		// ��, 3������� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;
		
		Student[] stus = new Student[3];
		
		for (int i = 0; i < stus.length; i++) {
			System.out.print("�̸� : ");
			name = sc.next();
			
			System.out.print("�� �� �� : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
			
			stus[i] = new Student(name, kor, eng, mat);
		}
		
		// 3. �л� ������ �Ϸķ� ���
		// ��, '�̸� �� �� �� �հ�'�� ��µǰ� �Ѵ�
		System.out.println("\n" + Arrays.toString(stus));
		
		// 4. �հ� ������ ���������ϰ� ����Ѵ�
		Comparator<Student> desc = (Student s1, Student s2) -> {
			return s2.getSum() - s1.getSum();
		};
		
		Arrays.sort(stus, desc);
		System.out.println("\n" + Arrays.toString(stus));
		
		sc.close();
	}
}
