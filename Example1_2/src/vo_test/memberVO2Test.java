package vo_test;

import java.util.Scanner;

public class memberVO2Test {

	public static void main(String[] args) {
		//VO ���� ���� , �Է� ��ü���� ����
		memberVO2 memb = new memberVO2();
		Scanner sc = new Scanner(System.in);
		
		//��ȣ �Է�
		System.out.println("��ȣ �Է�");
		int mem_num = sc.nextInt();
		sc.nextLine(); // ��� return �Ұſ�
		
		//���̵� �Է�
		System.out.println("���̵� �Է�");
		String mem_id = sc.nextLine();
		
		//�̸� �Է�
		System.out.println("�̸� �Է�");
		String mem_name = sc.nextLine();
		
		//�н����� �Է�
		System.out.println("�н����� �Է�");
		String mem_pw = sc.nextLine();
		
		//�̸��� �Է�
		System.out.println("�̸��� �Է�");
		String mem_email = sc.nextLine();
		
		//����ȣ �Է�
		System.out.println("����ȣ �Է�");
		String mem_phone = sc.nextLine();
		
		//memb set �̿�
		memb.setMember_no(mem_num);
		memb.setMember_id(mem_id);
		memb.setMember_name(mem_name);
		memb.setPassword(mem_pw);
		memb.setEmail(mem_email);
		memb.setPhone(mem_phone);
		
		//�Ѳ����� �������ϱ�
		System.out.println("���� ���");
		System.out.print("��ȣ : " + memb.getMember_no() + " ");
		System.out.print("���̵� : " + memb.getMember_id() + " ");
		System.out.print("�̸� : " + memb.getMember_name() + " ");
		System.out.print("��� : " + memb.getPassword() + " ");
		System.out.print("�̸��� : " + memb.getEmail() + " ");
		System.out.println("����ȣ : " + memb.getPhone() + " ");
		
		System.out.println("toString ���");
		System.out.println(memb.toString());
		

		
		
		
		

	}

}
