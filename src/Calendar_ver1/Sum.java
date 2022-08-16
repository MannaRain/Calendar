package Calendar_ver1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 키보드로 두 수의 입력을 받아서 둘의 합을 출력한다
		int a, b;
		Scanner input = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요(띄어쓰기나 엔터로 구분): ");
		s1 = input.next();
		s2 = input.next();
		System.out.println(s1 + "과 " + s2 + "의 합은...");
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a+b);
		System.out.printf("두 수의 합은 %d입니다.", a+b);
		
		input.close();
		
		// scanner.next() 하면 다음 토큰을 문자열로 받는다. 
		// '토큰'은 공백(띄어쓰기나 탭이나 엔터)으로 구분되는 듯 하다.
		// 즉, '200 (탭)(탭) -20'을 입력하면 180이 잘 실행되어 나옴.
	}
}
