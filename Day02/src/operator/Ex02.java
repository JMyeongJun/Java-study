package operator;

public class Ex02 {
	public static void main(String[] args) {
		// ���� ������ : ���� �Ҵ��ϴ� ������
		
		// Ư¡)
		// 1. ���� �������� �º��� '����', �캯�� '�����'
		// 2. ���� ������ �׻� �캯���� ó���Ѵ�
		// 3. ���� �������� �纯�� �ڷ����� ��ġ ��Ų��
		
		int n = 10 + 2;
		
		System.out.println("n = " + n);
		
		int n1, n2, n3;
		
		n1 = n2 = n3 = 10;
		
		System.out.println("n1 =" + n1);
		System.out.println("n2 =" + n2);
		System.out.println("n3 =" + n3 + "\n");
		
		// ���� ���� ������ : ��� + ����
		// +=, -=, *=, /=, %=
		
		int num = 10;
		
		System.out.println("num + 5 = " + (num + 5));
		System.out.println("num = " + num + "\n");
		// ��� ������ ������ ������ ���� �ʴ´�
		
		num += 3;	// num = num + 3;
		System.out.println("num = " + num);
		
		num -= 5;
		System.out.println("num = " + num);
		
		num *= 2;
		System.out.println("num = " + num);
		
		num /= 4;
		System.out.println("num = " + num);
		
		num %= 6;
		System.out.println("num = " + num + "\n");
		
		///////////����
		int a = 7, b = 3, c = 2;
		
		a += b -= c *= 2;
		// a = a+b, b = b-c, c = c*2
		
		//1. c = c*2 = 2*2 = 4
		//2. b = b-c = 3-4 = -1
		//3. a = a+b = 7+(-1) = 6
		System.out.println("a = " + a);		//?
		System.out.println("b = " + b);		//?
		System.out.println("c = " + c);		//?
		
	}
}
