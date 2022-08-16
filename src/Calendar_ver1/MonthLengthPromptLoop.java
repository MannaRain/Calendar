package Calendar_ver1;

import java.util.Scanner;

public class MonthLengthPromptLoop {
	// 입력받는 값이 -1일 때만 반복을 끝내도록 월별 일수 출력하기.
	// 입력하는 곳 앞에 프롬프트(>) 출력하기.

	private final static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDate(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
//		System.out.println("반복횟수를 입력해주세요: ");
		Scanner input = new Scanner(System.in);
//		int repeat = input.nextInt();

		System.out.print("날 수를 알고 싶은 달은?\n> ");
		int month = input.nextInt();
		while (month != -1) {
			System.out.printf("%d월은 %d일가지 있습니다.\n", month, MonthLengthPromptLoop.getMaxDate(month));
			System.out.print("날 수를 알고 싶은 달은?\n> ");
			month = input.nextInt();
		}
		System.out.println("반복이 끝났습니다.");
		input.close();
	}

}
