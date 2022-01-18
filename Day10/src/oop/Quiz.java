package oop;

class Car {
	String model;
	int speed, sits;
	
	Car(String model, int speed, int sits) {
		this.model = model;
		this.speed = speed;
		this.sits = sits;
	}
	
	void showCar() {
		System.out.printf("%s (%dkm/h, %d��)\n\n", 
				model, speed, sits);
	}
	
	void accel(int speed) {	// this = car;
		this.speed += speed;
		
		System.out.println(speed + "km/h ����!!!");
		
		showCar();		// this.showCar();
						// car.showCar();
	}
	
	void _break(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + "km/h ����!!!");
		
		showCar();
	}
}

public class Quiz {
	public static void main(String[] args) {
		// �Ʒ��ڵ尡 ����ǰ� Ŭ������ �����ϼ���
		Car car = new Car("���", 0, 4);		// �𵨸�, �ӵ�, �¼���
		
		car.showCar();	// ��� (0km/h, 4��)
		
		car.accel(30);	// 30km/h ����
						// ��� (30km/h, 4��)
		
		car._break(10);	// 10km/h ����
						// ��� (20km/h, 4��)
		
		
		
	}
}
