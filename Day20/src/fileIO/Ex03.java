package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 버퍼(buffer) : 데이터를 모아서 전달하는 임시 공간
// - 입출력 속도를 증진하는 효과를 보기 위해서 사용한다

// ex) A -> B로 볼펜 10개를 옮긴다
// 1. 버퍼x -> 1개씩 10번 옮긴다
// 2. 버퍼o -> 10개를 바구니(= buffer)에 담아서 1번에 옮긴다

public class Ex03 {
	public static void main(String[] args) {
		
		try {
			// 1. 출력 스트림(= 통로)을 생성
			FileWriter fw = new FileWriter("버퍼.txt");
		
			// 2. 버퍼를 생성한다
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("여기는 버퍼를 활용한 입출력\n");
			bw.write("눈에 띄는 차이는 현재 없지만\n");
			bw.write("용량이 큰 입출력에 큰 입출력 속도 차이를 보인다~");
			
			bw.close();
			
			System.out.println("입출력 완료~");
		
		} catch(IOException e) {
			System.err.println("예외 : " + e.getMessage());
			
		}
	}
}
