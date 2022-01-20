package interaction;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
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
		String result = (driver == null) ? "없음" : driver.name;
		
		System.out.printf("%s (%dkm/h, %s)\n\n", 
				model, speed, result);
	}
	
	void takeOn(Person p) {
		driver = p;
		
		System.out.println(model + "에 " + p.name + "님이 탑승~");
		
		showCar();
	}
	
	void accel(int speed) {
		if (driver == null) {	// 운전자가 없다면
			System.out.println("운전자가 없습니다\n");
			return;
		}
		
		this.speed += speed;
		
		System.out.println(speed + "km/h 가속!!!");
		
		showCar();
	}
	
	void _break(int speed) {
		if (driver == null) {	// 운전자가 없다면
			System.out.println("운전자가 없습니다\n");
			return;
		}
		
		this.speed -= speed;
		
		System.out.println(speed + "km/h 감속!!!");
		
		showCar();
	}
	
	void takeOff() {
		if (speed != 0) {
			System.out.println("정차 후 하차해 주세요!!!");
			return;
		}
		
		System.out.println(driver.name + "님이 하차");
		
		driver = null;
		
		showCar();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 30);
		Car car = new Car("모닝");
		
		p.showInfo();
		car.showCar();  // 모닝 (0km/h, 없음);
		
		
		car.accel(30);	// 자동차가 가속하는 메서드
						// 단, 운전석에 사람이 없으면 동작x
		
		car.takeOn(p);	// 사람이 자동차에 탑승하는 메서드
		
		car.accel(30);	// 30km/h 가속!!!
		
		
		car._break(10);	// 10km/h 감속!!!
		
		car.takeOff();	// 사람이 하차하는 메서드
						// 단, 속도가 남으면 내릴 수 없다
		
	}
}
