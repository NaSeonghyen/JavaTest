package string;

public class String_Ex1 {

	public static void main(String[] args) {
		/*
		 * string a는 문자열 a
		 * string b는 문자열 b
		 * String은 하나의 클래스이고 문자열은 문자열 나열이다.
		 * JAVA에서 String클래스는 char의 배열이고 메서드들의 집합이다.
		 */
		
		//String 이해(1) - 주소저장
		String a = "a";
		String b = "b";
		
		a = a+b;
		System.out.println(a);
		
		//String 이해(2) - new 키워드
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//String 비교
		if(str1 == str2) {
			System.out.println("str1과 str2 같음");
		} else {
			System.out.println("str1과 str2 다름");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4 같음");
		} else {
			System.out.println("str3과 str4 다름");
		}
		
		// 문자열 초기화
		String str = "";
		
		// String 메서드 - 문자열 비교 ☆☆☆
		String s = "hello";
		boolean d = s.equals("hello");
		boolean f = s.equals("Hello");
		
		System.out.println(d);
		System.out.println(f);
		

		//못찾으면 -1을 반환 ☆
		String t = "hello";
		int idx1 = t.indexOf('o');
		int idx2 = t.indexOf('k');
		
		if(t.indexOf('k')>0)
		{
			System.out.println(t.indexOf('k') + "위치에 있음");
		} else {
			System.out.println("없음");
		}
//		System.out.println(idx1);
//		System.out.println(idx2);
		
		// 처음 시작하는 위치는 반환함
		String g = "ABCDEFG";
		int idx = g.indexOf("CD");
		
//		System.out.println(idx);
		
		// 뒤에서 부터 해당 문자열의 위치를 찾고 위치를 반환
		String p = "java.lang.Object";
		int index1 = p.lastIndexOf("."); //오른쪽에서 왼쪽
		int index2 = p.indexOf("."); // 왼쪽에서 오른쪽
		
//		System.out.println(index1);
//		System.out.println(index2);
		
		//length 사용하기
		String o = "HELLO";
		int length = o.length();
		
//		System.out.println(length);
		
		//문자열 자르기(split)☆
		String anlmals = "dog,cat,bear";
		String[] arr = anlmals.split(",");
		
		System.out.println(anlmals);
		
		//for문
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------");
		
		//for each문
		for(String brr : arr) {
			System.out.println(brr);
		}
		
		//substring 사용
		String i = "java.lang.Object";
		String c = i.substring(10);
		String q = i.substring(5,9);
		System.out.println("------");
		System.out.println(i);
		System.out.println(c);
		System.out.println(q);
		
		//trim
		String x = "안녕하세요 ";
		String s1 = x.trim();
		System.out.println(s1);
		
		//static 메서드이기 떄문에 생성자를 사용하지 않고 클래스 이름으로 메서드를 호출하여 사용한다.
		String u = String.valueOf(1);
		System.out.println(u);
		
		String k = "무궁화, 삼천리, 화려강산, 대한사람, 대한으로, 길이, 보전하세";
		
		k = k.replace(",", "/");
		System.out.println(k);
		
		//숫자를 문자로 변환하기(형변환)
		String str_int = "123";
		int z = Integer.parseInt(str_int);
		System.out.println("------");
		System.out.println(z);
		
		//문자를 숫자로 변환하기(형변환)
		int z1 = 1;
		String u2 = String.valueOf(z1);
		System.out.println(u2);
	}

}
