package fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 {
	public static void main(String[] args) {
		
		try {
			// PrintWriter Ư¡)
			// - ���� �ٹٲ��� ���� (���� x)
			PrintWriter pw = new PrintWriter("�ٹٲ�.txt");
		
			pw.println("����� �ٹٲ��� �˴ϴ�");
			pw.println("�ѹ� Ȯ���� ������~");
			
			pw.close();
			
			System.out.println("���� ����� �Ϸ�~");
			
		} catch(FileNotFoundException e) {
			System.err.println("���� ���� �Դϴ� : " + e.getMessage());
			
		}
		
	}
}
