package _static;

public class Ex02 {
	public static void main(String[] args) {
		// static은 인스턴스 없이 사용가능 하다는 이점을 활용한 클래스도 있다
		// ex) Math 클래스
		
		// Math math = new Math();
		// - Math의 생성자는 private로 감춰져있다. 즉, 인스턴스 생성 불가능!!!
		
		System.out.println("2 ^ 10 = " + Math.pow(2, 10));
		// double pow(double a, double b)
		
		System.out.println("루트 4 = " + Math.sqrt(4));
		System.out.println("루트 2 = " + Math.sqrt(2));
		
		System.out.println("sin 90 = " + Math.sin(Math.toRadians(90)));
	}
}
