package basic_test.test;

import java.util.Arrays;

public class Test06 {
	// 두배열이 같은지 출력하는 코드를 작성해 주세요 
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int arrCount = 0; // 배열 카운트 선언
		
		
		
		// 배열 구성 비교
		for (int i = 0; i< arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				arrCount++; // 배열 다를 경우 카운트 +1
			}
		}
		
		// 배열 구성에 따른 출력
		if(arrCount > 0) {
			System.out.println("arr1배열과 arr2배열의 구성은 다릅니다.");
		} else {
			System.out.println("arr1배열과 arr2배열의 구성은 같습니다.");
		}
		
	}
}
