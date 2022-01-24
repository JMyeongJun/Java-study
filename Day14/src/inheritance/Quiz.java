package inheritance;

import other.Person;

class Airplain {
	private Person[] member = new Person[10];
	
	void takeOn(Person tar) {
		for (int i = 0; i < member.length; i++) {
			if (member[i] == null) {
				member[i] = tar;
				
				System.out.println(member[i].getName() + "님이 탑승~");
				return;
			}
		}
		
		System.out.println("남은 좌석이 없습니다~");
	}
	
	void list() {
		System.out.println("\n좌석 목록)");
		
		for (int i = 0; i < member.length; i++) {
			System.out.print(i + 1 + "좌석 : ");
			
			if (member[i] != null) {
				System.out.println(member[i].showInfo());
			}
			else {
				System.out.println("-- 빈좌석 --");
			}
		}
	}
	
	void emergency(Person tar) {
		System.out.println("\n긴급상황!!! 기내에서 의사를 찾습니다!!!");
		
		for (int i = 0; i < member.length; i++) {
			if (member[i] instanceof Doctor) {
				System.out.println("의사발견!!!\n");
				
				Doctor doc = (Doctor)member[i];
				
				doc.cure(tar);
				return;
			}
		}
		
		System.out.println("기내에 의사가 없습니다...");
	}
}

public class Quiz {
	public static void main(String[] args) {
		// 아래코드가 동작하게 하라~
		Person per = new Person("홍길동", 25);
		Student stu = new Student("김길동", 15, 75);
		Police pol = new Police("이길동", 27, "순경");
		Doctor doc = new Doctor("박길동", 40, "내과");
		
		Airplain air = new Airplain();
		
		air.takeOn(per);	// 비행기에 '사람'을 태우는 메서드
		air.takeOn(stu);	// 자리가 없을시 탑승 불가능하게 한다 
		air.takeOn(pol);
		air.takeOn(doc);	
		
		air.list();			// 승객 목록을 출력하는 메서드
		
		
		air.emergency(stu);	// 긴급 상황 발생 메서드
							// - 기내에서 의사를 찾고, 전달된 '사람'을 치료하게 한다
							// - 의사가 없다면, 기내에서 의사가 없다라고 출력한다
	
	}
}
