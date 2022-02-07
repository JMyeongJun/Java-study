package fileIO;

import java.io.FileWriter;
import java.io.IOException;

// 입출력 : 컴퓨터와 데이터를 주고 받는 행위

// 입력 : 프로그램(.java)으로 데이터가 들어가는 것
// 출력 : 프로그램에서 데이터가 나오는 것

// 표준 입력 : 키보드 같은 장치를 통해서 프로그램에 데이터를 주는 것
// 표준 출력 : 모니터 같은 장치를 통해서 프로그램 밖에 데이터를 꺼내는 것

// 파일 입력 : 프로그램에 파일의 내용을 주는 것 -> 읽기
// 파일 출력 : 프로그램에서 파일에 내용을 주는 것 -> 쓰기

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Hello~");
		
		try {
			// FileWriter 특징)
			// 1. 파일 출력(= 쓰기)을 담당하는 클래스
			// 2. 줄바꿈이 포함되어 있지 않다
			// 3. 버퍼를 사용하지 않는다
			FileWriter fw = new FileWriter("hello.txt");
		
			fw.write("Hello notepad~\n");
			fw.write("한글이 잘되나요?\n");
			fw.write("줄바꿈은?\n");
			
			fw.close();
			
			System.out.println("파일 입출력 완료~");
			
		} catch(IOException e) {
			System.err.println("예외 : " + e.getMessage());
			
		}
	}
}
