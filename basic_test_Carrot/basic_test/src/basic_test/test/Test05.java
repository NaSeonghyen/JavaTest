package basic_test.test;

import java.util.Scanner;

/*
 * 콘솔에 사용자가 값을 입력하면 
 * 짝수 인지 홀수인지 구분하는 프로그램을 만들어 주세요 
 * (삼항 연산자 사용) 
 * 
 * 예시)
 * 숫자를 입력해 주세요 
 * 22
 * 출력값은 "짝수" 입니다.
 * 
 * 
 */
public class Test05 {

	public static void main(String[] args) {
		//정수형 변수 및 입력 객체 선언
		int a;
		Scanner scan = new Scanner(System.in);
		
		//임의의 숫자 입력 및 저장
		System.out.println("숫자를 입력해 주세요");
		a = scan.nextInt();
		
		//입력된 숫자값에 따른 결과 출력
		if(a%2 == 0) {
			System.out.println("출력값은 \"짝수\" 입니다.");
		} else {
			System.out.println("출력값은 \"홀수\" 입니다.");
		}
	}
	
}
