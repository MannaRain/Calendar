package Calendar_ver1;

import java.util.Scanner;

public class MonthLength {
	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력
		Scanner input = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = input.nextInt();
		
		// 월별 날수 배열
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (month <= 12 & month >= 1) {
			System.out.println(month + "월은 " + maxDays[month-1] + "일까지 있습니다.");
		} else {
			System.out.println("1 이상 12 이하의 수를 입력해주세요.");
		}
		input.close();
		
	}
}
