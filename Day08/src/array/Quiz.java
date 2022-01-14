package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0, max, min;

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + " 학생 점수 입력 : ");
			score[i] = sc.nextInt();
			
			sum += score[i];
		}
		System.out.println();

		System.out.println("학생 점수");
		System.out.println(Arrays.toString(score));

		System.out.println("점수 합계 : " + sum + ", 평균 : " + sum / (double) score.length);

		max = score[0];
		min = score[0];

		for (int i = 1; i < score.length; i++) {
			max = max > score[i] ? max : score[i];
			min = min < score[i] ? min : score[i];
		}

		System.out.println("max : " + max + ", min : " + min);

		for (int j = 0; j < score.length-1; j++) {
			for (int i = j+1; i < score.length; i++) {
				if (score[j] > score[i]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
//			System.out.println(Arrays.toString(score));
		}
		
		System.out.println(Arrays.toString(score));
	
		sc.close();
	}
}
