package inheritance_test;

public class InterfaceTest implements catWorld {
	// �������̽� ����ϱ�
	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest();
		it.call();
		it.come();
		it.out();

	}

	@Override
	public void call() {
		System.out.println("�߿˾߿�");
		
	}

	@Override
	public void come() {
		System.out.println("�Ͷ�");
		
	}

	@Override
	public void out() {
		System.out.println("����");
		
	}

}
