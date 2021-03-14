package string;

public class String_Ex1 {

	public static void main(String[] args) {
		/*
		 * string a�� ���ڿ� a
		 * string b�� ���ڿ� b
		 * String�� �ϳ��� Ŭ�����̰� ���ڿ��� ���ڿ� �����̴�.
		 * JAVA���� StringŬ������ char�� �迭�̰� �޼������ �����̴�.
		 */
		
		//String ����(1) - �ּ�����
		String a = "a";
		String b = "b";
		
		a = a+b;
		System.out.println(a);
		
		//String ����(2) - new Ű����
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//String ��
		if(str1 == str2) {
			System.out.println("str1�� str2 ����");
		} else {
			System.out.println("str1�� str2 �ٸ�");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4 ����");
		} else {
			System.out.println("str3�� str4 �ٸ�");
		}
		
		// ���ڿ� �ʱ�ȭ
		String str = "";
		
		// String �޼��� - ���ڿ� �� �١١�
		String s = "hello";
		boolean d = s.equals("hello");
		boolean f = s.equals("Hello");
		
		System.out.println(d);
		System.out.println(f);
		

		//��ã���� -1�� ��ȯ ��
		String t = "hello";
		int idx1 = t.indexOf('o');
		int idx2 = t.indexOf('k');
		
		if(t.indexOf('k')>0)
		{
			System.out.println(t.indexOf('k') + "��ġ�� ����");
		} else {
			System.out.println("����");
		}
//		System.out.println(idx1);
//		System.out.println(idx2);
		
		// ó�� �����ϴ� ��ġ�� ��ȯ��
		String g = "ABCDEFG";
		int idx = g.indexOf("CD");
		
//		System.out.println(idx);
		
		// �ڿ��� ���� �ش� ���ڿ��� ��ġ�� ã�� ��ġ�� ��ȯ
		String p = "java.lang.Object";
		int index1 = p.lastIndexOf("."); //�����ʿ��� ����
		int index2 = p.indexOf("."); // ���ʿ��� ������
		
//		System.out.println(index1);
//		System.out.println(index2);
		
		//length ����ϱ�
		String o = "HELLO";
		int length = o.length();
		
//		System.out.println(length);
		
		//���ڿ� �ڸ���(split)��
		String anlmals = "dog,cat,bear";
		String[] arr = anlmals.split(",");
		
		System.out.println(anlmals);
		
		//for��
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------");
		
		//for each��
		for(String brr : arr) {
			System.out.println(brr);
		}
		
		//substring ���
		String i = "java.lang.Object";
		String c = i.substring(10);
		String q = i.substring(5,9);
		System.out.println("------");
		System.out.println(i);
		System.out.println(c);
		System.out.println(q);
		
		//trim
		String x = "�ȳ��ϼ��� ";
		String s1 = x.trim();
		System.out.println(s1);
		
		//static �޼����̱� ������ �����ڸ� ������� �ʰ� Ŭ���� �̸����� �޼��带 ȣ���Ͽ� ����Ѵ�.
		String u = String.valueOf(1);
		System.out.println(u);
		
		String k = "����ȭ, ��õ��, ȭ������, ���ѻ��, ��������, ����, �����ϼ�";
		
		k = k.replace(",", "/");
		System.out.println(k);
		
		//���ڸ� ���ڷ� ��ȯ�ϱ�(����ȯ)
		String str_int = "123";
		int z = Integer.parseInt(str_int);
		System.out.println("------");
		System.out.println(z);
		
		//���ڸ� ���ڷ� ��ȯ�ϱ�(����ȯ)
		int z1 = 1;
		String u2 = String.valueOf(z1);
		System.out.println(u2);
	}

}
