package interaction;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d��)\n", name, age);
	}
}

class Car {
	String model;
	int speed;			// 0
	Person driver;		// null
	
	Car(String model) {
		this.model = model;
	}
	
	void showCar() {
		String result = (driver == null) ? "����" : driver.name;
		
		System.out.printf("%s (%dkm/h, %s)\n\n", 
				model, speed, result);
	}
	
	void takeOn(Person p) {
		driver = p;
		
		System.out.println(model + "�� " + p.name + "���� ž��~");
		
		showCar();
	}
	
	void accel(int speed) {
		if (driver == null) {	// �����ڰ� ���ٸ�
			System.out.println("�����ڰ� �����ϴ�\n");
			return;
		}
		
		this.speed += speed;
		
		System.out.println(speed + "km/h ����!!!");
		
		showCar();
	}
	
	void _break(int speed) {
		if (driver == null) {	// �����ڰ� ���ٸ�
			System.out.println("�����ڰ� �����ϴ�\n");
			return;
		}
		
		this.speed -= speed;
		
		System.out.println(speed + "km/h ����!!!");
		
		showCar();
	}
	
	void takeOff() {
		if (speed != 0) {
			System.out.println("���� �� ������ �ּ���!!!");
			return;
		}
		
		System.out.println(driver.name + "���� ����");
		
		driver = null;
		
		showCar();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", 30);
		Car car = new Car("���");
		
		p.showInfo();
		car.showCar();  // ��� (0km/h, ����);
		
		
		car.accel(30);	// �ڵ����� �����ϴ� �޼���
						// ��, �������� ����� ������ ����x
		
		car.takeOn(p);	// ����� �ڵ����� ž���ϴ� �޼���
		
		car.accel(30);	// 30km/h ����!!!
		
		
		car._break(10);	// 10km/h ����!!!
		
		car.takeOff();	// ����� �����ϴ� �޼���
						// ��, �ӵ��� ������ ���� �� ����
		
	}
}
