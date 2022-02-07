package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Writer, Reader : ����(char) �����
// InputStream, OutputStream : ����Ʈ(byte) �����

public class Ex07 {
	public static void main(String[] args) {
		
		try {
			// 1. ��Ʈ�� ����
			FileInputStream fis = new FileInputStream("jdk8.exe");
			FileOutputStream fos = new FileOutputStream("copy.exe");
			
			// 2. ���� ����
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i;
			
			while (true) {
				i = bis.read();
			
				if (i == -1) break;
				// ���� ���� ������ -1�� ���ϵ�
				
				bos.write(i);
			}
			
			System.out.println("����� �Ϸ�~");
		
		} catch(FileNotFoundException e) {
			System.err.println("���� : " + e.getMessage());
			
		} catch(IOException e) {
			System.err.println("���� : " + e.getMessage());
			
		}
	}
}
