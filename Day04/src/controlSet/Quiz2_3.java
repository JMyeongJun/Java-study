package controlSet;

import java.util.Scanner;

public class Quiz2_3 {
	public static void main(String[] args) {

		// 3. 버스는 10 정거장 미만일 경우 역 간 이동 시간이 2분 소요되며,
		// 10 정거장이 넘으면 4분 소요된다 .
		// 정거장 수를 입력하면 소요시간을 계산하여 출력하시오

		Scanner sc = new Scanner(System.in);
		int station, time;
		String hour = "";

		System.out.print("정거장 수 : ");
		station = sc.nextInt();

		if (station >= 10) {
			time = station * 4;
		} else {
			time = station * 2;
		}

		if (time >= 60) {
			hour = Integer.toString(time / 60) + "시간 ";
		}

		System.out.printf("총 소요시간은 %s%d분 입니다.", hour, time % 60);

		sc.close();
	}
}
