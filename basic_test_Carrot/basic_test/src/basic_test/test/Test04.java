package basic_test.test;

import java.util.Scanner;

public class Test04 {

	/*
	 * 콘솔에 사용자가 값을 입력하면 
	 * 두개의 합을 출력해주는 프로그램을 만들어 주세요 ^^ 
	 * 
	 * 예시)
	 * A값을 입력하세요 : 15
	 * B값을 입력하세요 : 10
	 * 15+10 = 25
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// 정수형 변수 및 입력 객체 선언
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		//a값 입력
		System.out.print("A값을 입력하세요 : ");
		a = scan.nextInt();
		
		//b값 입력
		System.out.print("B값을 입력하세요 : ");
		b = scan.nextInt();
		
		//a,b 입력값 이용한 a+b 출력
		System.out.println(a + "+" + b + " = " + (a+b));
		
	}

}
