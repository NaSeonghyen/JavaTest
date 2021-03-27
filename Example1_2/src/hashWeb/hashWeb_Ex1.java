package hashWeb;

import java.util.HashMap;
import java.util.Scanner;

public class hashWeb_Ex1 {

	public static void main(String[] args) {
		/*
		 * �÷��� �����ӿ�ũ�� �� 3������ �ִ�. 
		 * �� list(�迭�� ����� �ڷᱸ����, ������ ������ �ߺ��� �ȴ�.), set(������ ���� �ߺ��� �ȵ�)
		 * , map(������ ���� ���� �ߺ��ǰ� Ű �ߺ�x) - HashTable,HashMap,TreeMap, LinkedMap(������ ����)
		 * �÷��� �������̽��� �� 2������ �ִ�.
		 * 
		 * HashMap���� �������� �޼������ �ִµ�
		 * ��1.put : Ű�� ���� �ִ´�. Ű�� �ߺ������ �Ұ������� ���� �ߺ������ ����
		 * 2.remove : ����, replace : ��ü
		 * ��3.get : �ش� Ű�� �Ἥ ���� �����´�.
		 * 4.containsKey() �ش� Ű�� ���� ���ԵǾ� �ִ���
		 * 5.containsValue() �ش� ���� ���ԵǾ� �ִ���
		 * 6.size() ���� ũ�⸦ ��Ÿ�� == length
		 * 7.isEmpty() ���� ����ִ��� Ȯ���� �� �ִ�.
		 * 
		 */
		
		//HashMap �⺻ ���� put
//		HashMap<String, String> map = new HashMap<String,String>();
		HashMap<String, String> map = new HashMap();

		map.put("myId","1234");
		map.put("asdf","5678");
		map.put("asef","9123");
		
		System.out.println(map); //�÷��� �����ӿ�ũ�� ��ü Ű�� ���� �� �� �ִ�.(toString�� ���� �ʾƵ�)	
		
		//HashMap �⺻ ����2 put, replace
		HashMap<Integer, String> map2 = new HashMap(); //�ؽø�(����x, Ű�ߺ�x , ���ߺ� x)
//		LinkedHashMap<Integer, String> map2 = new LinkedHashMap();(����o, Ű�ߺ�x, ���ߺ� x)
		map2.put(101,"�Ѹ�");
		map2.put(201,"�����");
		map2.put(301,"������");
		map2.put(401,"��ġ");
		map2.replace(401, "��浿");
		map2.put(101,"�ϸ�"); //Ű �ߺ� Ȯ��
		map2.put(102,"�ϸ�"); //�� �ߺ� Ȯ��
		System.out.println(map2);

		//HashMap �⺻ ����2 containsKey, containsValue
		boolean a = map2.containsKey(501);
		boolean b = map2.containsValue("��浿");
		
		//map2 ��� Ȯ��1
		if(a) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		//map2 ��� Ȯ��2
		if(b) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		//map2.clear() //map2 ��ҵ��� ���� ������.
		map2.remove(401); // map2 �ش� ��Ҹ� ����
		//map2.size
		System.out.println(map2);
		System.out.println(map2.size());
		
		//map2.get ���
		System.out.println("key :" + 101 +" value :" + map2.get(101));
		System.out.println("key :" + 101 +" value :" + map2.get(201));
		System.out.println("key :" + 101 +" value :" + map2.get(301));
		System.out.println("key :" + 101 +" value :" + map2.get(401));
		
		//�ؽø��� �̿��� id,password �Է¹޾� �α����ϱ�
		HashMap idpw = new HashMap();
		
		idpw.put("qwer","1234");
		idpw.put("asdf","4567");
		idpw.put("zxcv","6789");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���");
			System.out.print("id :");
			
			// ��������
			String id = sc.nextLine().trim();
			
			System.out.println("password :");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!idpw.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			
			if(!(idpw.get(id)).equals(password)) {
				System.out.println("��й�ȣ�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			} else {
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			}
		}
	}

}
