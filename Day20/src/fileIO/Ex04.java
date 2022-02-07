package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		
		try {
			// 버퍼x -> 문자를 char[] 배열로 읽어와야 한다
			FileReader fr = new FileReader("읽기1.txt");
			char[] ch = new char[200];
			
			fr.read(ch);
			
			for (char c : ch) {
				System.out.print(c);
			}
			System.out.println();
			
			fr.close();
			
			System.out.println("불러오기 완료");
			
		} catch(FileNotFoundException e) {
			System.err.println("없는 파일 : " + e.getMessage());
			
		} catch(IOException e) {
			System.err.println("예외 : " + e.getMessage());
			
		}
	}
}
