package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Writer, Reader : 문자(char) 입출력
// InputStream, OutputStream : 바이트(byte) 입출력

public class Ex07 {
	public static void main(String[] args) {
		
		try {
			// 1. 스트림 생성
			FileInputStream fis = new FileInputStream("jdk8.exe");
			FileOutputStream fos = new FileOutputStream("copy.exe");
			
			// 2. 버퍼 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int i;
			
			while (true) {
				i = bis.read();
			
				if (i == -1) break;
				// 파일 끝을 읽으면 -1이 리턴됨
				
				bos.write(i);
			}
			
			System.out.println("입출력 완료~");
		
		} catch(FileNotFoundException e) {
			System.err.println("예외 : " + e.getMessage());
			
		} catch(IOException e) {
			System.err.println("예외 : " + e.getMessage());
			
		}
	}
}
