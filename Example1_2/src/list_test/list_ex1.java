package list_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class list_ex1 {

	public static void main(String[] args) {
		/* �ڹٿ����� �����͸� �����ϰų� �����͸� �����ϴ� ������ �ϴµ� �����ڴ� �� ����� ����ؾ���.
		* �� ���� ��� ������ �Ǿ��ְ� ȭ��ܿ� ����� �� ��� ǥ���ɱ�?
		* �÷��� �����ӿ�ũ���� list(�迭),set(����),map(Ű�� ������ ������ ����) 3���� �����Ǿ�����.
		* list ���� �޼��� : add , contains , remove, size , toArray
		* list���� arrayList ,linkedList(������ ����)
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
		
		//�迭 ��� ��ü ���
		System.out.println(list1);
		
		//�迭 ��� ���� ���
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		//list2�� list1�� �Ϻ� ��� 
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		//�ڵ� ����
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//���� ����(contains[����],contains[��ü])
		System.out.println("list1.containsAll(list2): " + list1.contains(4));
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		
		//����Ʈ ��� �߰�
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		
		//����Ʈ ��� ����
		list2.set(3,"AA");
		print(list1, list2);
		
		//����Ʈ list2�� �ߺ��Ǵ� ��� ����
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		//����Ʈ 1�� �ߺ��Ǵ� ��� ����(list2)[�迭 ������ ��Һ��� ��]
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
					list2.remove(i);
		}
		print(list1, list2);
		
		//����Ʈ 1�� �ߺ��Ǵ� ��� ����(list2)[�迭 ù��° ��Һ��� ��]
		for(int i=0; i<list2.size(); i++) {
			if(list1.contains(list2.get(i)))
					list2.remove(i);
		}
		print(list1, list2);
	}
	
	//print �޼ҵ� 
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}


