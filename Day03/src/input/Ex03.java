package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� �ڷ����� �Է� �޾� ����~
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		Scanner sc = new Scanner(System.in);
		
		// 1. boolean
		System.out.print("��/����? ");
		bo = sc.nextBoolean();
		
		System.out.println("bo = " + bo);
		
		// 2. byte
		System.out.println("byte? ");
		by = sc.nextByte();
		
		System.out.println("by = " + by);
		
		// 3. short
		System.out.println("short? ");
		sh = sc.nextShort();
		
		System.out.println("short = " + sh);

		// 4. int
		System.out.println("int? ");
		it = sc.nextInt();
		
		System.out.println("int = " + it);
		
		// 5. long
		System.out.println("long? ");
		lo = sc.nextLong();
		
		System.out.println("long = " + lo);
		
		// 6. float
		System.out.println("float? ");
		fl = sc.nextFloat();
		
		System.out.println("float = " + fl);
		
		// 7. double
		System.out.println("double? ");
		db = sc.nextDouble();
		
		System.out.println("double = " + db);
		
		sc.close();
	}
}
