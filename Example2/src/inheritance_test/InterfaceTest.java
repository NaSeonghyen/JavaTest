package inheritance_test;

public class InterfaceTest implements catWorld {
	// 인터페이스 사용하기
	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest();
		it.call();
		it.come();
		it.out();

	}

	@Override
	public void call() {
		System.out.println("야옹야옹");
		
	}

	@Override
	public void come() {
		System.out.println("와라");
		
	}

	@Override
	public void out() {
		System.out.println("나가");
		
	}

}
