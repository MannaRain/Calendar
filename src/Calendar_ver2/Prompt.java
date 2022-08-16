package Calendar_ver2;

import java.util.Scanner;

public class Prompt {
	
	private final static String PRMOPT = "cal> ";
	
	public static void runPrompt() {
		Scanner input = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PRMOPT);
			month = input.nextInt();
			if (month == -1) {
				break;
			}
			if (month < 1 | month > 12) {
				continue;
			}
			
			cal.printCalendar(2022,  month);
		}
		System.out.println("루프가 끝났습니다.");
		input.close();
	}
	
	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();  // 클래스 정의 안에서 자기자신의 인스턴스를 만드네?
		p.runPrompt();
	}
}
