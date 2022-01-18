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
		System.out.printf("%s (%dkm/h, %d석)\n\n", 
				model, speed, sits);
	}
	
	void accel(int speed) {	// this = car;
		this.speed += speed;
		
		System.out.println(speed + "km/h 가속!!!");
		
		showCar();		// this.showCar();
						// car.showCar();
	}
	
	void _break(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + "km/h 감속!!!");
		
		showCar();
	}
}

public class Quiz {
	public static void main(String[] args) {
		// 아래코드가 실행되게 클래스를 구성하세요
		Car car = new Car("모닝", 0, 4);		// 모델명, 속도, 좌석수
		
		car.showCar();	// 모닝 (0km/h, 4석)
		
		car.accel(30);	// 30km/h 가속
						// 모닝 (30km/h, 4석)
		
		car._break(10);	// 10km/h 감속
						// 모닝 (20km/h, 4석)
		
		
		
	}
}
