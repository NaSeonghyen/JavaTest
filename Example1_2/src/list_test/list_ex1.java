package list_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class list_ex1 {

	public static void main(String[] args) {
		/* 자바에서는 데이터를 정제하거나 데이터를 전송하는 역할을 하는데 개발자는 이 방식을 고민해야함.
		* 이 값이 어떻게 구성이 되어있고 화면단에 출력할 때 어떻게 표현될까?
		* 컬렉션 프레임워크에는 list(배열),set(집합),map(키와 값으로 구성된 집합) 3개로 구성되어있음.
		* list 공통 메서드 : add , contains , remove, size , toArray
		* list에는 arrayList ,linkedList(순서가 있음)
		*/
		
		ArrayList list1 = new ArrayList<Integer>();
		
//		list1.add(new Integer(5));
//		list1.add(new Integer(4));
//		list1.add(new Integer(2));
//		list1.add(new Integer(0));
//		list1.add(new Integer(1));
//		list1.add(new Integer(3));
//		
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
		//배열 요소 전체 출력
		System.out.println(list1);
		
		//배열 요소 각각 출력
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		//list2에 list1의 일부 요소 
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		//자동 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//포함 여부(contains[개별],contains[전체])
		System.out.println("list1.containsAll(list2): " + list1.contains(4));
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		
		//리스트 요소 추가
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		
		//리스트 요소 변경
		list2.set(3,"AA");
		print(list1, list2);
		
		//리스트 list2와 중복되는 요소 삭제
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		//리스트 1과 중복되는 요소 삭제(list2)[배열 마지막 요소부터 비교]
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
					list2.remove(i);
		}
		print(list1, list2);
		
		//리스트 1과 중복되는 요소 삭제(list2)[배열 첫번째 요소부터 비교]
		for(int i=0; i<list2.size(); i++) {
			if(list1.contains(list2.get(i)))
					list2.remove(i);
		}
		print(list1, list2);
	}
	
	//print 메소드 
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}


