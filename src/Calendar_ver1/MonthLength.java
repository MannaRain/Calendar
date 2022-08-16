package Calendar_ver1;

import java.util.Scanner;

public class MonthLength {
	// 월별 날수 배열
	private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// 숫자를 입력받아 해당하는 달의 최대 일수를 반환
	public static int getMonthLength(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력
		Scanner input = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = input.nextInt();

		if (month > 12 | month < 1) {
			System.out.println("1 이상 12 이하의 수를 입력해주세요.");
		} else {
			System.out.println(month + "월은 " + MonthLength.getMonthLength(month) + "일까지 있습니다.");
		}
		input.close();
	}
}
