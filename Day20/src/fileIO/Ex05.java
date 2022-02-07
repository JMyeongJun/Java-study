package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		
		try {
			// 1. ��Ʈ�� ����
			FileReader fr = new FileReader("�б�1.txt");
			
			// 2. ���� ����
			BufferedReader br = new BufferedReader(fr);
			
			String line;	// ������ ������ ����
			
			while (true) {
				line = br.readLine();
				
				if (line == null) break;
				// ���� ���� �����ϸ� null�� ��ȯ -> ��, ��� ���� ����
				
				System.out.println(line);
			}
			
			br.close();
			
			System.out.println("�б� �Ϸ�~");
		
		} catch(FileNotFoundException e) {
			System.err.println("���� : " + e.getMessage());
		
		} catch(IOException e) {
			System.err.println("���� : " + e.getMessage());
		}
	}
}
