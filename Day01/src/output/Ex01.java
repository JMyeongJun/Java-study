package output;

// 패키지명과 클래스명은 파일과 같아야 한다
public class Ex01 {
	public static void main(String[] args) {
		// System 클래스 : 표준 입출력을 제어하는 클래스
		
		// 1. println() : 끝에 줄바꿈이 포함된 출력문
		System.out.println("Hello world!!");
		System.out.println("안녕하세요\n");
		
		// 2. print() : 줄바꿈이 없는 출력문(#이스케이프를 사용한다)
		System.out.print("Hello~");
		System.out.print("Java\n");
		
		// 3. printf() : 포맷에 맞게 출력 (%s, %d, %f, %c 등)
		System.out.printf("언어 : %s, 버전 : %d\n", "Java", 8);
	}
}
