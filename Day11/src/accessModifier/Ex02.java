package accessModifier;

import other.People;

// import other.Animal;
// - package Ŭ������ �ܺο��� import �Ұ���~

public class Ex02 {
	public static void main(String[] args) {
		People p = new People("ȫ�浿", 23, 170.3);
		
		System.out.println("p�� �̸� : " + p.name);
		// System.out.println("p�� ���� : " + p.age);
		// System.out.println("p�� ���� : " + p.height);
		
		// package �Ӽ��� �ܺο��� ���� �Ұ���!!!
		
		p.showInfo();
	}
}
