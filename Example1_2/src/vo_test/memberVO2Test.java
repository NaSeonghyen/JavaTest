package vo_test;

import java.util.Scanner;

public class memberVO2Test {

	public static void main(String[] args) {
		//VO 변수 선언 , 입력 객체변수 선언
		memberVO2 memb = new memberVO2();
		Scanner sc = new Scanner(System.in);
		
		//번호 입력
		System.out.println("번호 입력");
		int mem_num = sc.nextInt();
		sc.nextLine(); // 찌꺼지 return 소거용
		
		//아이디 입력
		System.out.println("아이디 입력");
		String mem_id = sc.nextLine();
		
		//이름 입력
		System.out.println("이름 입력");
		String mem_name = sc.nextLine();
		
		//패스워드 입력
		System.out.println("패스워드 입력");
		String mem_pw = sc.nextLine();
		
		//이메일 입력
		System.out.println("이메일 입력");
		String mem_email = sc.nextLine();
		
		//폰번호 입력
		System.out.println("폰번호 입력");
		String mem_phone = sc.nextLine();
		
		//memb set 이용
		memb.setMember_no(mem_num);
		memb.setMember_id(mem_id);
		memb.setMember_name(mem_name);
		memb.setPassword(mem_pw);
		memb.setEmail(mem_email);
		memb.setPhone(mem_phone);
		
		//한꺼번에 나오게하기
		System.out.println("각각 사용");
		System.out.print("번호 : " + memb.getMember_no() + " ");
		System.out.print("아이디 : " + memb.getMember_id() + " ");
		System.out.print("이름 : " + memb.getMember_name() + " ");
		System.out.print("비번 : " + memb.getPassword() + " ");
		System.out.print("이메일 : " + memb.getEmail() + " ");
		System.out.println("폰번호 : " + memb.getPhone() + " ");
		
		System.out.println("toString 사용");
		System.out.println(memb.toString());
		

		
		
		
		

	}

}
