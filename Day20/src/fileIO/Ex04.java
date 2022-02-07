package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		
		try {
			// ����x -> ���ڸ� char[] �迭�� �о�;� �Ѵ�
			FileReader fr = new FileReader("�б�1.txt");
			char[] ch = new char[200];
			
			fr.read(ch);
			
			for (char c : ch) {
				System.out.print(c);
			}
			System.out.println();
			
			fr.close();
			
			System.out.println("�ҷ����� �Ϸ�");
			
		} catch(FileNotFoundException e) {
			System.err.println("���� ���� : " + e.getMessage());
			
		} catch(IOException e) {
			System.err.println("���� : " + e.getMessage());
			
		}
	}
}
