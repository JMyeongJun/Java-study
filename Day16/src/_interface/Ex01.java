package _interface;

class Computer {
	
	void connect(USB tar) {
		tar.run();
	}
}

class MemoryStick implements USB {
	@Override
	public void run() {
		System.out.println("32GB �޸� ����. E:\\ �� �����");
	}
}

class Phone implements USB {
	@Override
	public void run() {
		System.out.println("81% ���� �� ... Ž���⿡ �����ұ��? (Y/N)");
	}
}

class Remocon {
	public void run() {
		System.out.println("���� ON/OFF");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		MemoryStick mem32GB = new MemoryStick();
		Phone iphone = new Phone();
		Remocon rm = new Remocon();
		
		
		com.connect(mem32GB);
		com.connect(iphone);
		// com.connect(rm);
		// - remocon�� USB�� �������� �ʾƼ� �Ű����� �޾����� �ʴ´�
		// - ���� : �������� USB ���ڰ� ���� ��ǰ�̴�~
		
		
		// �Ϲ����� ������θ� �߻�ȭ�� ��ü�� ������ �� ����
		// - �̸� �ٷ� �����ϴ� ����� �ִµ� '�͸� Ŭ����'��� �Ѵ�
		// - �ϳ��� �ν��Ͻ����� ��� ������ '��ȸ�� Ŭ����'
		// - �ַ� �������̽��� �޼��带 ���ڸ����� �ٷ� �����Ϸ��� �Ҷ� ����Ѵ�
		
		USB mem64GB = new USB() {
			
			@Override
			public void run() {
				System.out.println("64GB �޸� ����. G:\\ �����");
			}
		};
		
		com.connect(mem64GB);
		
		
		// �� ���ٽ� : ����ȭ�� ��. �͸� Ŭ������ ������ �� ��밡���ϴ�
		// - ��, �Լ��� �������̽��� ��� ����
		
		USB phone = () -> {
			System.out.println("95% ������...");
		};
		
		com.connect(phone);
		
	}
}
