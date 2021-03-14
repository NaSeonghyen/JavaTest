package hashWeb;

import java.util.HashMap;
import java.util.Scanner;

public class hashWeb_Ex1 {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크는 총 3종류가 있다. 
		 * ㄴ list(배열과 비슷한 자료구조형, 순서가 있으며 중복이 된다.), set(순서도 없고 중복도 안됨)
		 * , map(순서가 없고 값은 중복되고 키 중복x) - HashTable,HashMap,TreeMap, LinkedMap(순서가 있음)
		 * 컬렉션 인터페이스는 총 2종류가 있다.
		 * 
		 * HashMap에는 여러가지 메서드들이 있는데
		 * ☆1.put : 키와 값을 넣는다. 키는 중복허용이 불가하지만 같은 중복허용이 가능
		 * 2.remove : 삭제, replace : 교체
		 * ☆3.get : 해당 키를 써서 값을 가져온다.
		 * 4.containsKey() 해당 키의 값이 포함되어 있는지
		 * 5.containsValue() 해당 값이 포함되어 있는지
		 * 6.size() 맵의 크기를 나타냄 == length
		 * 7.isEmpty() 맵이 비어있는지 확인할 수 있다.
		 * 
		 */
		
		//HashMap 기본 사용법 put
//		HashMap<String, String> map = new HashMap<String,String>();
		HashMap<String, String> map = new HashMap();

		map.put("myId","1234");
		map.put("asdf","5678");
		map.put("asef","9123");
		
		System.out.println(map); //컬렉션 프레임워크는 전체 키와 값을 볼 수 있다.(toString을 쓰지 않아도)	
		
		//HashMap 기본 사용법2 put, replace
		HashMap<Integer, String> map2 = new HashMap(); //해시맵(순서x, 키중복x , 값중복 x)
//		LinkedHashMap<Integer, String> map2 = new LinkedHashMap();(순서o, 키중복x, 값중복 x)
		map2.put(101,"둘리");
		map2.put(201,"도우네");
		map2.put(301,"마이콜");
		map2.put(401,"또치");
		map2.replace(401, "고길동");
		map2.put(101,"일리"); //키 중복 확인
		map2.put(102,"일리"); //값 중복 확인
		System.out.println(map2);

		//HashMap 기본 사용법2 containsKey, containsValue
		boolean a = map2.containsKey(501);
		boolean b = map2.containsValue("고길동");
		
		//map2 요소 확인1
		if(a) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
		//map2 요소 확인2
		if(b) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
		
		//map2.clear() //map2 요소들이 전부 지워짐.
		map2.remove(401); // map2 해당 요소만 삭제
		//map2.size
		System.out.println(map2);
		System.out.println(map2.size());
		
		//map2.get 사용
		System.out.println("key :" + 101 +" value :" + map2.get(101));
		System.out.println("key :" + 101 +" value :" + map2.get(201));
		System.out.println("key :" + 101 +" value :" + map2.get(301));
		System.out.println("key :" + 101 +" value :" + map2.get(401));
		
		//해시맵을 이용한 id,password 입력받아 로그인하기
		HashMap idpw = new HashMap();
		
		idpw.put("qwer","1234");
		idpw.put("asdf","4567");
		idpw.put("zxcv","6789");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요");
			System.out.print("id :");
			
			// 공백제거
			String id = sc.nextLine().trim();
			
			System.out.println("password :");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!idpw.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}
			
			if(!(idpw.get(id)).equals(password)) {
				System.out.println("비밀번호가 존재하지 않습니다. 다시 입력해주세요");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}

}
