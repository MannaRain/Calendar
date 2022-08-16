package Calendar_ver1;

import java.util.Scanner;

public class MonthLengthLoop {
	private final static int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// 숫자를 받아 해당하는 달의 최대 일수를 반환
	public static int getMaxDate(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] agrs) {
		// 반복할 횟수를 입력받아 그 수만큼 달의 일수 출력을 반복
		System.out.println("반복을 원하는 횟수를 입력해주세요.\n");
		Scanner input = new Scanner(System.in);
		int repeat = input.nextInt();
		
		for (int i=0; i < repeat; i++) {
			System.out.println("월을 입력하세요: ");
			int month = input.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, MonthLengthLoop.getMaxDate(month));
		}
		System.out.println("반복을 끝냅니다.");
		input.close();
	}
}
