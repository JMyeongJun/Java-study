package fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 {
	public static void main(String[] args) {
		
		try {
			// PrintWriter 특징)
			// - 끝에 줄바꿈이 내포 (버퍼 x)
			PrintWriter pw = new PrintWriter("줄바꿈.txt");
		
			pw.println("여기는 줄바꿈이 됩니다");
			pw.println("한번 확인해 보세요~");
			
			pw.close();
			
			System.out.println("파일 입출력 완료~");
			
		} catch(FileNotFoundException e) {
			System.err.println("없는 파일 입니다 : " + e.getMessage());
			
		}
		
	}
}
