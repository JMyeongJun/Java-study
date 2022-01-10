package controlSet;

import java.util.Scanner;

public class Quiz2_2 {
	public static void main(String[] args) {

		// 2. USB 한 개에 5000원 한다. 그런데 한번에 10개 이상을 구매하면 전체의 10%를 할인해준다.
		// 100개 이상은 전체의 12%를 할인해준다. n개의 USB를 사려면 얼마가 있어야 하는가

		Scanner sc = new Scanner(System.in);
		int price = 5000, n;
		double pay;

		System.out.print("구매 개수 : ");
		n = sc.nextInt();

		if (n >= 100) {
			pay = n * price * 0.88;
		} else if (n >= 10) {
			pay = n * price * 0.9;
		} else {
			pay = n * price;
		}

		System.out.printf("구매 금액 : %.0f원", pay);

		sc.close();
	}
}
