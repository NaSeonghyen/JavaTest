package basic_test.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test07 {

	/*
	 * 
	 * 숫자 맞추기 게임 만들기 
	 * 
	 * 이미 선언된 배열  int[] arr1 = {1,2,3};
	 * 사용자가 숫자 3개를 입력하여 이미 선언된  배열(arr1)과 비교합니다
	 * 선언된 배열과 위치와 값 둘다 맞으면 스트라이크 
	 * 선언된 배열과 값은 맞으나 위치가 틀리면 볼 입니다.
	 * 
	 * 요구사항
	 * 1. 사용자가 숫자 3개를 입력하면 몇스트라이크 몇 볼인지 출력해 주세요 ex) S2B1 
	 * 2. 3스트라이크가 나올때 까지 사용자가 계속 반복 하여 입력할 수 있게 해주세요 
	 * 3. 한번에 3스트라이크를  맞추면 '한번에 맞추었습니다'라고 콘솔에 출력해주세요
	 * 4. 사용자가 몇번만에 3스트라이크를 맞추었는지 콘솔에 출력해주세요 ex) 'n번 만에 맞추었습니다.' 
	 * 
	*/
		
	public static void main(String[] args) {
		
			int[] arr1 = { 1, 2, 3 };
			int[] arr2 = new int[3];
			
			Scanner scan = new Scanner(System.in); // 입력 객체 선언
			int strike, ball; // 스트라이크 , 볼 변수 선언
			int count = 0; // 숫자맞추기 시도 횟수 변수 선언
			boolean finish = false; // 게임 종료 변수 기본값 false 선언
			
			//숫자 맞추기 시작
			while (!finish) {
				strike = 0; // 스트라이크 변수 초기화
				ball = 0; // 볼 변수 초기화
				System.out.print("숫자 3개를 입력하세요(숫자 하나씩 입력할 것): ");
				// 입력 값 배열 형식으로 저장
				for(int i = 0; i<arr2.length; ++i) {
					arr2[i] = scan.nextInt(); // 입력 값 저장
					for(int j=0; j<arr1.length; ++j) { // 선언된 배열과의 비교를 위한 반복문
						if(arr2[i] == arr1[j]) { // 선언된 배열 숫자 한개와 입력한 숫자 비교
							if(i==j) strike++; // 자리가 같은 경우 strike +1
							else ball++;       // 자리가 다른 경우 ball +1 
						}
					}
				}
				// 입력 값 중 중복 숫자 확인
				if(arr2[0]==arr2[1] || arr2[0]==arr2[2] || arr2[1]==arr2[2]) {
					System.out.println("중복된 숫자가 있습니다.");
					continue;
				}
				System.out.println("S"+strike+"B"+ball); // 현황 출력
				count = count + 1; // 시도 횟수 추가
				if (strike == 3) finish = true; // 스트라이크 3개인 경우 숫자 맞추기 종료
			}
			scan.close(); 
			if(count == 1) { // 한번에 맞춘 경우
				System.out.println("한번에 맞추었습니다");
			} else { // 두번 이상으로 맞춘 경우
				System.out.println(count + "번 만에 맞추었습니다.");
			}
	}
}
