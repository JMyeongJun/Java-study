package inheritance;

// Object Ŭ���� : �ڹ��� �ֻ��� Ŭ����
// - �ڹٿ��� �ۼ��� ��� Ŭ������ ���ܾ��� �� Ŭ������ ��ӹް� �ִ� (�ڵ�)

class People {
	private String name;
	private int age;
	private double height;
	
	People(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString() {
		String result = "%s (%d��, %.1fcm)";
		result = String.format(result, name, age, height);
		
		return result;
	}

	// hashCode : ��ü�� ���� ���������� Ȯ���ϱ� ���� ��
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// equals : ������ ������ ���ϴ� �޼���
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		People other = (People) obj;
		
		if (age != other.age)
			return false;
		
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
			
		} 
		
		else if (!name.equals(other.name))
			return false;
		
		return true;
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		People p1 = new People("ȫ�浿", 20, 170.5);
		People p2 = new People("ȫ�浿", 20, 170.5);
		People p3 = p1;
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString() + "\n");
		// - ���������� ��¿��� ȣ���ϸ� -> toString()�� ȣ��ǰ� �Ǿ��ִ�
		// - ��, �̸� �������̵� �ϸ� ���������� ���ϴ� ���·� ����� �� �ִ�
		
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		// ��ü�� ��
		// - ���������� �񱳿����� ���� ����� ���� �� (= ���� ������ �ٶ󺸴��� ��)
		// - ���) ���� �����͸� ���ϴ� ���� �ƴϴٶ�� ��
		System.out.println("p1 == p2 ��� : " + (p1 == p2));
		System.out.println("p1 == p3 ��� : " + (p1 == p3) + "\n");
		
		
		System.out.println("p1.equals(p2) ��� : " + p1.equals(p2));
		System.out.println("p1.equals(p3) ��� : " + p1.equals(p3));
	}
}
