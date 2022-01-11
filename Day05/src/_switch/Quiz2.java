package _switch;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, cal;

		System.out.print("Ã¹¹øÂ° Á¤¼ö ÀÔ·Â : ");
		a = sc.nextInt();
		System.out.print("µÎ¹øÂ° Á¤¼ö ÀÔ·Â : ");
		b = sc.nextInt();

		System.out.println("1 : µ¡¼À");
		System.out.println("2 : »¬¼À");
		System.out.println("3 : °ö¼À");
		System.out.println("4 : ³ª´°¼À");
		System.out.print(">>> ");
		cal = sc.nextInt();

		switch (cal) {
		case 1:
			System.out.printf("%d + %d = %d", a, b, a + b);
			break;
		case 2:
			System.out.printf("%d - %d = %d", a, b, a - b);
			break;
		case 3:
			System.out.printf("%d * %d = %d", a, b, a * b);
			break;
		case 4:
			System.out.printf("%d / %d = %.2f", a, b, a / (double)b);
			break;
		}
		
		sc.close();
	}
}
