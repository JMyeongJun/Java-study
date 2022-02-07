package fileIO;

import java.io.FileWriter;
import java.io.IOException;

// ����� : ��ǻ�Ϳ� �����͸� �ְ� �޴� ����

// �Է� : ���α׷�(.java)���� �����Ͱ� ���� ��
// ��� : ���α׷����� �����Ͱ� ������ ��

// ǥ�� �Է� : Ű���� ���� ��ġ�� ���ؼ� ���α׷��� �����͸� �ִ� ��
// ǥ�� ��� : ����� ���� ��ġ�� ���ؼ� ���α׷� �ۿ� �����͸� ������ ��

// ���� �Է� : ���α׷��� ������ ������ �ִ� �� -> �б�
// ���� ��� : ���α׷����� ���Ͽ� ������ �ִ� �� -> ����

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Hello~");
		
		try {
			// FileWriter Ư¡)
			// 1. ���� ���(= ����)�� ����ϴ� Ŭ����
			// 2. �ٹٲ��� ���ԵǾ� ���� �ʴ�
			// 3. ���۸� ������� �ʴ´�
			FileWriter fw = new FileWriter("hello.txt");
		
			fw.write("Hello notepad~\n");
			fw.write("�ѱ��� �ߵǳ���?\n");
			fw.write("�ٹٲ���?\n");
			
			fw.close();
			
			System.out.println("���� ����� �Ϸ�~");
			
		} catch(IOException e) {
			System.err.println("���� : " + e.getMessage());
			
		}
	}
}
