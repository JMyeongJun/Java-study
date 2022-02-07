package fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		
		try {
			// 1. 스트림 생성
			FileReader fr = new FileReader("읽기1.txt");
			
			// 2. 버퍼 생성
			BufferedReader br = new BufferedReader(fr);
			
			String line;	// 한줄을 저장할 변수
			
			while (true) {
				line = br.readLine();
				
				if (line == null) break;
				// 문서 끝에 도달하면 null을 반환 -> 즉, 모두 읽은 상태
				
				System.out.println(line);
			}
			
			br.close();
			
			System.out.println("읽기 완료~");
		
		} catch(FileNotFoundException e) {
			System.err.println("예외 : " + e.getMessage());
		
		} catch(IOException e) {
			System.err.println("예외 : " + e.getMessage());
		}
	}
}
