package _static;

public class Ex02 {
	public static void main(String[] args) {
		// static�� �ν��Ͻ� ���� ��밡�� �ϴٴ� ������ Ȱ���� Ŭ������ �ִ�
		// ex) Math Ŭ����
		
		// Math math = new Math();
		// - Math�� �����ڴ� private�� �������ִ�. ��, �ν��Ͻ� ���� �Ұ���!!!
		
		System.out.println("2 ^ 10 = " + Math.pow(2, 10));
		// double pow(double a, double b)
		
		System.out.println("��Ʈ 4 = " + Math.sqrt(4));
		System.out.println("��Ʈ 2 = " + Math.sqrt(2));
		
		System.out.println("sin 90 = " + Math.sin(Math.toRadians(90)));
	}
}
