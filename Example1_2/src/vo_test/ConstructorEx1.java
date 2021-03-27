package vo_test;

public class ConstructorEx1 {

	public static void main(String[] args) {
		memberVO memb = new memberVO();
		memberVO memb2 = new memberVO(1, "qw", "we", "er", "rt", "yu");
		memb.setMember_id("naseonghyun");
		
		System.out.println(memb.getMember_id());
		System.out.println(memb2.getPassword());
		System.out.println(memb2.toString());
	}

}
